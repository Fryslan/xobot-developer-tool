import data.Storage;
import strategies.*;
import ui.ToolUI;
import xobot.client.callback.listeners.MessageListener;
import xobot.client.callback.listeners.PaintListener;
import xobot.client.events.MessageEvent;
import xobot.script.ActiveScript;
import xobot.script.Manifest;
import xobot.script.util.Time;
import xobot.script.wrappers.Area;
import xobot.script.wrappers.Tile;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.Callable;

@Manifest(authors = "FrisianGamer", name = "FrisTool", version = 0.1)
public class Core extends ActiveScript implements MessageListener, PaintListener {

	@Override
	public boolean onStart() {

		Storage.currentTiles = new ArrayList<>();

		ToolUI.initialize();
		Time.sleep((Callable) () -> Storage.loaded, Integer.MAX_VALUE);

		Storage.strategies = new ArrayList<>();
		Storage.strategies.add(new HandleBasicDataStrategy());
		Storage.strategies.add(new HandleSettingsExplorerStrategy());
		Storage.strategies.add(new HandleVisualizeDataStrategy());
		Storage.strategies.add(new HandlePathMakerStrategy());


		return super.onStart();
	}

	@Override
	public void onStop() {
		super.onStop();
	}

	@Override
	public int loop() {

		for (Strategy strategy : Storage.strategies) {
			if (strategy.activate()) {
				strategy.execute();
			}
		}
		return 500;
	}

	@Override
	public void MessageRecieved(MessageEvent messageEvent) {

	}

	@Override
	public void repaint(Graphics graphics) {
		if (Storage.highlightedTile != null) {
			Storage.highlightedTile.draw(graphics, Color.CYAN);
		}

		for (Tile path : path()) {
			path.draw(graphics, Color.red);
		}

		Tile[] areaTiles = new Area(path()).getTileArray();
		for (Tile area : areaTiles) {
			area.draw(graphics, Color.green);
		}
	}

	private Tile[] path() {
		Tile[] path = new Tile[Storage.currentTiles.size()];
		return Storage.currentTiles.toArray(path);
	}
}
