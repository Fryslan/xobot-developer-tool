package strategies;

import data.Storage;
import javafx.application.Platform;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.paint.Color;
import xobot.script.methods.GameObjects;
import xobot.script.methods.Players;
import xobot.script.util.Filter;
import xobot.script.wrappers.Area;
import xobot.script.wrappers.Tile;
import xobot.script.wrappers.interactive.GameObject;
import xobot.script.wrappers.interactive.Player;

import java.util.ArrayList;

public class HandleVisualizeDataStrategy implements Strategy {
	@Override
	public boolean activate() {
		if (Storage.controlller != null && Storage.controlller.getTab_pane() != null) {
			SingleSelectionModel<Tab> selectionModel = Storage.controlller.getTab_pane().getSelectionModel();
			return selectionModel.getSelectedIndex() == 3;
		} else {
			return false;
		}
	}

	@Override
	public void execute() {

		Platform.runLater(() -> {
			try {
				Canvas canvas = Storage.controlller.getVisualize_canvas();
				Tile loc = Players.getMyPlayer().getLocation();
				Area area = new Area(new Tile(loc.getX() - 104, loc.getY() - 104), new Tile(loc.getX() + 104, loc.getY() + 104));
				int[][] grid = new int[104][104];
				ArrayList<Integer> flags = new ArrayList<>();
				int rectSize = 5;

				System.out.println(canvas.getWidth() + " - " + canvas.getHeight());

				for (Tile tile : area.getTileArray()) {
					if (tile.getRegionX() > 0 && tile.getRegionY() < 104 && tile.getRegionY() > 0 && tile.getRegionX() < 104) {
						grid[tile.getRegionX()][tile.getRegionY()] = tile.getCollisionFlag();
					}
				}

				for (int i = 0; i < 104; i++) {
					for (int j = 0; j < 104; j++) {
						if (!flags.contains(grid[i][j])) {
							flags.add(grid[i][j]);
						}

						int flag = grid[i][j];

						switch (flag) {
							case Tile.Flag.WALL_EAST:
							case Tile.Flag.WALL_WEST:
							case Tile.Flag.WALL_NORTH:
							case Tile.Flag.WALL_NORTHEAST:
							case Tile.Flag.WALL_NORTHWEST:
							case Tile.Flag.WALL_SOUTH:
							case Tile.Flag.WALL_SOUTHEAST:
							case Tile.Flag.WALL_SOUTHWEST:
								canvas.getGraphicsContext2D().setFill(Color.GRAY);
								canvas.getGraphicsContext2D().fillRect(i * rectSize, j * rectSize, rectSize, rectSize);
								break;

							case Tile.Flag.WATER:
								canvas.getGraphicsContext2D().setFill(Color.CYAN);
								canvas.getGraphicsContext2D().fillRect(i * rectSize, j * rectSize, rectSize, rectSize);
								break;

							case Tile.Flag.BLOCKED:
								canvas.getGraphicsContext2D().setFill(Color.RED);
								canvas.getGraphicsContext2D().fillRect(i * rectSize, j * rectSize, rectSize, rectSize);
								break;

							case 2097152:
								canvas.getGraphicsContext2D().setFill(Color.DARKCYAN);
								canvas.getGraphicsContext2D().fillRect(i * rectSize, j * rectSize, rectSize, rectSize);
								break;

							default:
								canvas.getGraphicsContext2D().setFill(Color.WHITE);
								canvas.getGraphicsContext2D().fillRect(i * rectSize, j * rectSize, rectSize, rectSize);
								break;
						}
					}
				}

				for(GameObject obj : GameObjects.getAll(gameObject -> gameObject != null && gameObject.type() == GameObject.ObjectType.GroundDecoration)){
					canvas.getGraphicsContext2D().setFill(Color.LIGHTGRAY);
					canvas.getGraphicsContext2D().fillRect(obj.getLocation().getRegionX() * rectSize, obj.getLocation().getRegionY()  * rectSize, rectSize, rectSize);
				}

				for(GameObject obj : GameObjects.getAll(gameObject -> gameObject != null && gameObject.type() == GameObject.ObjectType.GroundItem)){
					canvas.getGraphicsContext2D().setFill(Color.AZURE);
					canvas.getGraphicsContext2D().fillRect(obj.getLocation().getRegionX() * rectSize, obj.getLocation().getRegionY()  * rectSize, rectSize, rectSize);
				}

				for(GameObject obj : GameObjects.getAll(gameObject -> gameObject != null && gameObject.type() == GameObject.ObjectType.WallObject)){
					canvas.getGraphicsContext2D().setFill(Color.GRAY);
					canvas.getGraphicsContext2D().fillRect(obj.getLocation().getRegionX() * rectSize, obj.getLocation().getRegionY()  * rectSize, rectSize, rectSize);
				}

				for(GameObject obj : GameObjects.getAll(gameObject -> gameObject != null && gameObject.type() == GameObject.ObjectType.Interactable)){
					canvas.getGraphicsContext2D().setFill(Color.LIME);
					canvas.getGraphicsContext2D().fillRect(obj.getLocation().getRegionX() * rectSize, obj.getLocation().getRegionY()  * rectSize, rectSize, rectSize);
				}


				canvas.getGraphicsContext2D().setFill(Color.MAGENTA);
				canvas.getGraphicsContext2D().fillRect(Players.getMyPlayer().getLocation().getRegionX() * rectSize, Players.getMyPlayer().getLocation().getRegionY()  * rectSize, rectSize, rectSize);


				for (int i : flags) {
					System.out.println(i);
				}

				System.out.println("Water Loc : "+new Tile(Player.getMyPlayer().getLocation().getX() - 10, Player.getMyPlayer().getLocation().getY()).getCollisionFlag());
				System.out.println("#######################################################################");
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

	}
}
