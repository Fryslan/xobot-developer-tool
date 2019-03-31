package strategies;

import data.Storage;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.layout.Pane;
import ui.ToolUIController;
import xobot.script.methods.Players;
import xobot.script.wrappers.Tile;

public class HandlePathMakerStrategy implements Strategy {

	private ToolUIController controller = Storage.controlller;
	private ObservableList<String> listCache = FXCollections.observableArrayList();
	private ListView<String> list;


	@Override
	public boolean activate() {
		if (Storage.controlller != null && Storage.controlller.getTab_pane() != null) {
			SingleSelectionModel<Tab> selectionModel = Storage.controlller.getTab_pane().getSelectionModel();
			return selectionModel.getSelectedIndex() == 2;
		} else {
			return false;
		}
	}

	@Override
	public void execute() {

		Platform.runLater(() -> {

			list = Storage.controlller.getPath_creator_selected_tiles_listview();
			Storage.controlller.getPath_creator_current_tile_button().setOnAction(event -> {
				Storage.currentTiles.add(Players.getMyPlayer().getLocation());
				listCache.add(Players.getMyPlayer().getLocation().toString());
				list.setItems(listCache);
			});

			Storage.controlller.getPath_creator_remove_tile_button().setOnAction(event -> {
				if (list.getSelectionModel().getSelectedItem() != null) {
					Storage.currentTiles.remove(list.getSelectionModel().getSelectedIndex());
					list.getItems().remove(list.getSelectionModel().getSelectedIndex());
				}
			});

			Storage.controlller.getPath_creator_area_button().setOnAction(event -> {
				Storage.controlller.getPath_creator_code_text_area().clear();
				StringBuilder builder = new StringBuilder();
				builder.append("new Area(new Tile[]{");
				for (Tile tile : Storage.currentTiles) {
					builder.append("new Tile(" + tile.getX() + ", " + tile.getY() + "),");
				}
				builder.append("});");
				Storage.controlller.getPath_creator_code_text_area().setText(builder.toString());
			});

			Storage.controlller.getPath_creator_path_button().setOnAction(event -> {
				Storage.controlller.getPath_creator_code_text_area().clear();
				StringBuilder builder = new StringBuilder();
				builder.append("new Tile[]{");
				for (Tile tile : Storage.currentTiles) {
					builder.append("new Tile(" + tile.getX() + ", " + tile.getY() + "),");
				}
				builder.append("};");
				Storage.controlller.getPath_creator_code_text_area().setText(builder.toString());
			});

			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					addPane(i, j);
				}
			}
		});

	}

	private void addPane(int colIndex, int rowIndex) {
		Pane pane = new Pane();
		Tile loc = Players.getMyPlayer().getLocation();
		pane.setOnMouseExited(event -> Storage.highlightedTile = null);
		pane.setOnMouseEntered(event -> {
			int x = loc.getX() + (rowIndex - 4);
			int y = loc.getY() + (colIndex - 4);
			System.out.println("entering " + x + ", " + y);
			Storage.highlightedTile = new Tile(x, y);
		});
		pane.setOnMouseClicked(e -> {
			int x = loc.getX() + (rowIndex - 4);
			int y = loc.getY() + (colIndex - 4);
			Storage.currentTiles.add(new Tile(x, y));
			listCache.add(new Tile(x, y).toString());
			list.setItems(listCache);
		});
		Storage.controlller.getPath_creator_tile_selector_gridview().add(pane, colIndex, rowIndex);
	}
}
