package strategies;

import data.Storage;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.cell.TextFieldListCell;
import ui.ToolUIController;
import utils.WebUtils;
import xobot.script.methods.*;
import xobot.script.wrappers.interactive.Item;

public class HandleBasicDataStrategy implements Strategy {
	@Override
	public boolean activate() {
		if (Storage.controlller != null && Storage.controlller.getTab_pane() != null) {
			SingleSelectionModel<Tab> selectionModel = Storage.controlller.getTab_pane().getSelectionModel();
			return selectionModel.getSelectedIndex() == 0;
		} else {
			return false;
		}
	}

	@Override
	public void execute() {

		Platform.runLater(() -> {
			ToolUIController controller = Storage.controlller;

			controller.getMain_location_label().setText(String.format("Location: %s, %s, %s", Players.getMyPlayer().getLocation().getX(), Players.getMyPlayer().getLocation().getY(), Players.getMyPlayer().getLocation().getPlane()));
			controller.getMain_map_base_label().setText(String.format("Map Base: %s, %s, %s", Game.getMapBase().getX(), Game.getMapBase().getY(), Game.getMapBase().getPlane()));
			controller.getMain_region_label().setText("Region: " + Players.getMyPlayer().getX() + ", " + Players.getMyPlayer().getY());
			controller.getMain_destination_label().setText(String.format("Destination: %s, %s, %s", Walking.getDestination().getX(), Walking.getDestination().getY(), Walking.getDestination().getPlane()));

			controller.getMain_camera_x_label().setText("Camera X: " + Camera.getX());
			controller.getMain_camera_y_label().setText("Camera Y: " + Camera.getY());
			controller.getMain_camera_z_label().setText("Camera Z: " + Camera.getZ());

			controller.getMain_input_state_label().setText("Input State: " + Game.getInputState());
			controller.getMain_input_state_label().setText("Input Text: " + Game.getInputText());

			controller.getMain_loop_cycle_label().setText("LoopCycle: " + Game.getLoopCycle());
			controller.getMain_logged_in_label().setText("Logged In: " + String.valueOf(Game.isLoggedIn()));

			//todo add inventory items to grid

			ObservableList<String> items = null;
			if (Storage.bankItems.isEmpty()) {
				if(Bank.isOpen()){
					for(Item item : Bank.getItems()){
						Storage.bankItems.add(item);
					}
				}
				items = FXCollections.observableArrayList("Open your bank to get item data.");
				ListView<String> list = Storage.controlller.getMain_bank_items_listview();
				list.setItems(items);
				list.setCellFactory(TextFieldListCell.forListView());
				list.setEditable(true);
			} else {
				items = FXCollections.observableArrayList();
				for (Item item : Storage.bankItems) {
					if (item != null && item.hasDefinition() && item.getDefinition().getName() != null) {
						items.add(String.format("[%s] %s (%s)", item.getID(), item.getDefinition().getName(), item.getStack()));
					}
				}
				ListView<String> list = Storage.controlller.getMain_bank_items_listview();
				list.setItems(items);
				list.setCellFactory(TextFieldListCell.forListView());
				list.setEditable(true);

			}
		});


	}
}
