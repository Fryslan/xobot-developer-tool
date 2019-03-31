package ui;

/**
 * Sample Skeleton for 'Untitled' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class ToolUIController {

	@FXML // fx:id="tab_pane"
	private TabPane tab_pane; // Value injected by FXMLLoader

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="main_location_label"
	private Label main_location_label; // Value injected by FXMLLoader

	@FXML // fx:id="main_map_base_label"
	private Label main_map_base_label; // Value injected by FXMLLoader

	@FXML // fx:id="main_region_label"
	private Label main_region_label; // Value injected by FXMLLoader

	@FXML // fx:id="main_destination_label"
	private Label main_destination_label; // Value injected by FXMLLoader

	@FXML // fx:id="main_camera_x_label"
	private Label main_camera_x_label; // Value injected by FXMLLoader

	@FXML // fx:id="main_camera_y_label"
	private Label main_camera_y_label; // Value injected by FXMLLoader

	@FXML // fx:id="main_camera_z_label"
	private Label main_camera_z_label; // Value injected by FXMLLoader

	@FXML // fx:id="main_input_state_label"
	private Label main_input_state_label; // Value injected by FXMLLoader

	@FXML // fx:id="main_input_text_label"
	private Label main_input_text_label; // Value injected by FXMLLoader

	@FXML // fx:id="main_loop_cycle_label"
	private Label main_loop_cycle_label; // Value injected by FXMLLoader

	@FXML // fx:id="main_logged_in_label"
	private Label main_logged_in_label; // Value injected by FXMLLoader

	@FXML // fx:id="main_inventory_grid"
	private GridPane main_inventory_grid; // Value injected by FXMLLoader

	@FXML // fx:id="main_bank_items_listview"
	private ListView<String> main_bank_items_listview; // Value injected by FXMLLoader

	@FXML // fx:id="main_players_listview"
	private ListView<String> main_players_listview; // Value injected by FXMLLoader

	@FXML // fx:id="main_npcs_listview"
	private ListView<?> main_npcs_listview; // Value injected by FXMLLoader

	@FXML // fx:id="main_gameobject_listview"
	private ListView<?> main_gameobject_listview; // Value injected by FXMLLoader

	@FXML // fx:id="main_grounditems_listview"
	private ListView<?> main_grounditems_listview; // Value injected by FXMLLoader

	@FXML // fx:id="settings_data_listview"
	private ListView<?> settings_data_listview; // Value injected by FXMLLoader

	@FXML // fx:id="settings_changes_listview"
	private ListView<?> settings_changes_listview; // Value injected by FXMLLoader

	@FXML // fx:id="settings_integer_vallue_listview"
	private Label settings_integer_vallue_listview; // Value injected by FXMLLoader

	@FXML // fx:id="settings_binary_vallue_listview"
	private Label settings_binary_vallue_listview; // Value injected by FXMLLoader

	@FXML // fx:id="settings_hex_vallue_listview"
	private Label settings_hex_vallue_listview; // Value injected by FXMLLoader

	@FXML // fx:id="settings_mask_textfield"
	private TextField settings_mask_textfield; // Value injected by FXMLLoader

	@FXML // fx:id="settings_shift_textfield"
	private TextField settings_shift_textfield; // Value injected by FXMLLoader

	@FXML // fx:id="path_creator_current_tile_button"
	private Button path_creator_current_tile_button; // Value injected by FXMLLoader

	@FXML // fx:id="path_creator_tile_selector_gridview"
	private GridPane path_creator_tile_selector_gridview; // Value injected by FXMLLoader

	@FXML // fx:id="path_creator_selected_tiles_listview"
	private ListView<String> path_creator_selected_tiles_listview; // Value injected by FXMLLoader

	@FXML // fx:id="path_creator_remove_tile_button"
	private Button path_creator_remove_tile_button; // Value injected by FXMLLoader

	@FXML // fx:id="path_creator_code_text_area"
	private TextArea path_creator_code_text_area; // Value injected by FXMLLoader

	@FXML // fx:id="path_creator_area_button"
	private Button path_creator_area_button; // Value injected by FXMLLoader

	@FXML // fx:id="path_creator_path_button"
	private Button path_creator_path_button; // Value injected by FXMLLoader

	@FXML // fx:id="visualize_canvas"
	private Canvas visualize_canvas; // Value injected by FXMLLoader

	@FXML // fx:id="visualize_show_iteractable_checkbox"
	private CheckBox visualize_show_iteractable_checkbox; // Value injected by FXMLLoader

	@FXML // fx:id="visualize_show_ground_decoration_checkbox"
	private CheckBox visualize_show_ground_decoration_checkbox; // Value injected by FXMLLoader

	@FXML // fx:id="visualize_wall_decoration_checkbox"
	private CheckBox visualize_wall_decoration_checkbox; // Value injected by FXMLLoader

	@FXML // fx:id="visualize_wall_objects_checkbox"
	private CheckBox visualize_wall_objects_checkbox; // Value injected by FXMLLoader

	@FXML // fx:id="visualize_npc_checkbox"
	private CheckBox visualize_npc_checkbox; // Value injected by FXMLLoader

	@FXML // fx:id="visualize_players_checkbox"
	private CheckBox visualize_players_checkbox; // Value injected by FXMLLoader

	@FXML // fx:id="visualize_ground_items_checkbox"
	private CheckBox visualize_ground_items_checkbox; // Value injected by FXMLLoader

	@FXML // fx:id="visualize_info_textarea"
	private TextArea visualize_info_textarea; // Value injected by FXMLLoader

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert tab_pane != null : "fx:id=\"tab_pane\" was not injected: check your FXML file 'Untitled'.";
		assert main_location_label != null : "fx:id=\"main_location_label\" was not injected: check your FXML file 'Untitled'.";
		assert main_map_base_label != null : "fx:id=\"main_map_base_label\" was not injected: check your FXML file 'Untitled'.";
		assert main_region_label != null : "fx:id=\"main_region_label\" was not injected: check your FXML file 'Untitled'.";
		assert main_destination_label != null : "fx:id=\"main_destination_label\" was not injected: check your FXML file 'Untitled'.";
		assert main_camera_x_label != null : "fx:id=\"main_camera_x_label\" was not injected: check your FXML file 'Untitled'.";
		assert main_camera_y_label != null : "fx:id=\"main_camera_y_label\" was not injected: check your FXML file 'Untitled'.";
		assert main_camera_z_label != null : "fx:id=\"main_camera_z_label\" was not injected: check your FXML file 'Untitled'.";
		assert main_input_state_label != null : "fx:id=\"main_input_state_label\" was not injected: check your FXML file 'Untitled'.";
		assert main_input_text_label != null : "fx:id=\"main_input_text_label\" was not injected: check your FXML file 'Untitled'.";
		assert main_loop_cycle_label != null : "fx:id=\"main_loop_cycle_label\" was not injected: check your FXML file 'Untitled'.";
		assert main_logged_in_label != null : "fx:id=\"main_logged_in_label\" was not injected: check your FXML file 'Untitled'.";
		assert main_inventory_grid != null : "fx:id=\"main_inventory_grid\" was not injected: check your FXML file 'Untitled'.";
		assert main_bank_items_listview != null : "fx:id=\"main_bank_items_listview\" was not injected: check your FXML file 'Untitled'.";
		assert main_players_listview != null : "fx:id=\"main_players_listview\" was not injected: check your FXML file 'Untitled'.";
		assert main_npcs_listview != null : "fx:id=\"main_npcs_listview\" was not injected: check your FXML file 'Untitled'.";
		assert main_gameobject_listview != null : "fx:id=\"main_gameobject_listview\" was not injected: check your FXML file 'Untitled'.";
		assert main_grounditems_listview != null : "fx:id=\"main_grounditems_listview\" was not injected: check your FXML file 'Untitled'.";
		assert settings_data_listview != null : "fx:id=\"settings_data_listview\" was not injected: check your FXML file 'Untitled'.";
		assert settings_changes_listview != null : "fx:id=\"settings_changes_listview\" was not injected: check your FXML file 'Untitled'.";
		assert settings_integer_vallue_listview != null : "fx:id=\"settings_integer_vallue_listview\" was not injected: check your FXML file 'Untitled'.";
		assert settings_binary_vallue_listview != null : "fx:id=\"settings_binary_vallue_listview\" was not injected: check your FXML file 'Untitled'.";
		assert settings_hex_vallue_listview != null : "fx:id=\"settings_hex_vallue_listview\" was not injected: check your FXML file 'Untitled'.";
		assert settings_mask_textfield != null : "fx:id=\"settings_mask_textfield\" was not injected: check your FXML file 'Untitled'.";
		assert settings_shift_textfield != null : "fx:id=\"settings_shift_textfield\" was not injected: check your FXML file 'Untitled'.";
		assert path_creator_current_tile_button != null : "fx:id=\"path_creator_current_tile_button\" was not injected: check your FXML file 'Untitled'.";
		assert path_creator_tile_selector_gridview != null : "fx:id=\"path_creator_tile_selector_gridview\" was not injected: check your FXML file 'Untitled'.";
		assert path_creator_selected_tiles_listview != null : "fx:id=\"path_creator_selected_tiles_listview\" was not injected: check your FXML file 'Untitled'.";
		assert path_creator_remove_tile_button != null : "fx:id=\"path_creator_remove_tile_button\" was not injected: check your FXML file 'Untitled'.";
		assert path_creator_code_text_area != null : "fx:id=\"path_creator_code_text_area\" was not injected: check your FXML file 'Untitled'.";
		assert path_creator_area_button != null : "fx:id=\"path_creator_area_button\" was not injected: check your FXML file 'Untitled'.";
		assert path_creator_path_button != null : "fx:id=\"path_creator_path_button\" was not injected: check your FXML file 'Untitled'.";
		assert visualize_canvas != null : "fx:id=\"visualize_canvas\" was not injected: check your FXML file 'Untitled'.";
		assert visualize_show_iteractable_checkbox != null : "fx:id=\"visualize_show_iteractable_checkbox\" was not injected: check your FXML file 'Untitled'.";
		assert visualize_show_ground_decoration_checkbox != null : "fx:id=\"visualize_show_ground_decoration_checkbox\" was not injected: check your FXML file 'Untitled'.";
		assert visualize_wall_decoration_checkbox != null : "fx:id=\"visualize_wall_decoration_checkbox\" was not injected: check your FXML file 'Untitled'.";
		assert visualize_wall_objects_checkbox != null : "fx:id=\"visualize_wall_objects_checkbox\" was not injected: check your FXML file 'Untitled'.";
		assert visualize_npc_checkbox != null : "fx:id=\"visualize_npc_checkbox\" was not injected: check your FXML file 'Untitled'.";
		assert visualize_players_checkbox != null : "fx:id=\"visualize_players_checkbox\" was not injected: check your FXML file 'Untitled'.";
		assert visualize_ground_items_checkbox != null : "fx:id=\"visualize_ground_items_checkbox\" was not injected: check your FXML file 'Untitled'.";
		assert visualize_info_textarea != null : "fx:id=\"visualize_info_textarea\" was not injected: check your FXML file 'Untitled'.";
	}

	public TabPane getTab_pane() {
		return tab_pane;
	}

	public void setTab_pane(TabPane tab_pane) {
		this.tab_pane = tab_pane;
	}

	public Label getMain_location_label() {
		return main_location_label;
	}

	public void setMain_location_label(Label main_location_label) {
		this.main_location_label = main_location_label;
	}

	public Label getMain_map_base_label() {
		return main_map_base_label;
	}

	public void setMain_map_base_label(Label main_map_base_label) {
		this.main_map_base_label = main_map_base_label;
	}

	public Label getMain_region_label() {
		return main_region_label;
	}

	public void setMain_region_label(Label main_region_label) {
		this.main_region_label = main_region_label;
	}

	public Label getMain_destination_label() {
		return main_destination_label;
	}

	public void setMain_destination_label(Label main_destination_label) {
		this.main_destination_label = main_destination_label;
	}

	public Label getMain_camera_x_label() {
		return main_camera_x_label;
	}

	public void setMain_camera_x_label(Label main_camera_x_label) {
		this.main_camera_x_label = main_camera_x_label;
	}

	public Label getMain_camera_y_label() {
		return main_camera_y_label;
	}

	public void setMain_camera_y_label(Label main_camera_y_label) {
		this.main_camera_y_label = main_camera_y_label;
	}

	public Label getMain_camera_z_label() {
		return main_camera_z_label;
	}

	public void setMain_camera_z_label(Label main_camera_z_label) {
		this.main_camera_z_label = main_camera_z_label;
	}

	public Label getMain_input_state_label() {
		return main_input_state_label;
	}

	public void setMain_input_state_label(Label main_input_state_label) {
		this.main_input_state_label = main_input_state_label;
	}

	public Label getMain_input_text_label() {
		return main_input_text_label;
	}

	public void setMain_input_text_label(Label main_input_text_label) {
		this.main_input_text_label = main_input_text_label;
	}

	public Label getMain_loop_cycle_label() {
		return main_loop_cycle_label;
	}

	public void setMain_loop_cycle_label(Label main_loop_cycle_label) {
		this.main_loop_cycle_label = main_loop_cycle_label;
	}

	public Label getMain_logged_in_label() {
		return main_logged_in_label;
	}

	public void setMain_logged_in_label(Label main_logged_in_label) {
		this.main_logged_in_label = main_logged_in_label;
	}

	public GridPane getMain_inventory_grid() {
		return main_inventory_grid;
	}

	public void setMain_inventory_grid(GridPane main_inventory_grid) {
		this.main_inventory_grid = main_inventory_grid;
	}

	public ListView<String> getMain_bank_items_listview() {
		return main_bank_items_listview;
	}

	public void setMain_bank_items_listview(ListView<String> main_bank_items_listview) {
		this.main_bank_items_listview = main_bank_items_listview;
	}

	public ListView<String> getMain_players_listview() {
		return main_players_listview;
	}

	public void setMain_players_listview(ListView<String> main_players_listview) {
		this.main_players_listview = main_players_listview;
	}

	public ListView<?> getMain_npcs_listview() {
		return main_npcs_listview;
	}

	public void setMain_npcs_listview(ListView<?> main_npcs_listview) {
		this.main_npcs_listview = main_npcs_listview;
	}

	public ListView<?> getMain_gameobject_listview() {
		return main_gameobject_listview;
	}

	public void setMain_gameobject_listview(ListView<?> main_gameobject_listview) {
		this.main_gameobject_listview = main_gameobject_listview;
	}

	public ListView<?> getMain_grounditems_listview() {
		return main_grounditems_listview;
	}

	public void setMain_grounditems_listview(ListView<?> main_grounditems_listview) {
		this.main_grounditems_listview = main_grounditems_listview;
	}

	public ListView<?> getSettings_data_listview() {
		return settings_data_listview;
	}

	public void setSettings_data_listview(ListView<?> settings_data_listview) {
		this.settings_data_listview = settings_data_listview;
	}

	public ListView<?> getSettings_changes_listview() {
		return settings_changes_listview;
	}

	public void setSettings_changes_listview(ListView<?> settings_changes_listview) {
		this.settings_changes_listview = settings_changes_listview;
	}

	public Label getSettings_integer_vallue_listview() {
		return settings_integer_vallue_listview;
	}

	public void setSettings_integer_vallue_listview(Label settings_integer_vallue_listview) {
		this.settings_integer_vallue_listview = settings_integer_vallue_listview;
	}

	public Label getSettings_binary_vallue_listview() {
		return settings_binary_vallue_listview;
	}

	public void setSettings_binary_vallue_listview(Label settings_binary_vallue_listview) {
		this.settings_binary_vallue_listview = settings_binary_vallue_listview;
	}

	public Label getSettings_hex_vallue_listview() {
		return settings_hex_vallue_listview;
	}

	public void setSettings_hex_vallue_listview(Label settings_hex_vallue_listview) {
		this.settings_hex_vallue_listview = settings_hex_vallue_listview;
	}

	public TextField getSettings_mask_textfield() {
		return settings_mask_textfield;
	}

	public void setSettings_mask_textfield(TextField settings_mask_textfield) {
		this.settings_mask_textfield = settings_mask_textfield;
	}

	public TextField getSettings_shift_textfield() {
		return settings_shift_textfield;
	}

	public void setSettings_shift_textfield(TextField settings_shift_textfield) {
		this.settings_shift_textfield = settings_shift_textfield;
	}

	public Button getPath_creator_current_tile_button() {
		return path_creator_current_tile_button;
	}

	public void setPath_creator_current_tile_button(Button path_creator_current_tile_button) {
		this.path_creator_current_tile_button = path_creator_current_tile_button;
	}

	public GridPane getPath_creator_tile_selector_gridview() {
		return path_creator_tile_selector_gridview;
	}

	public void setPath_creator_tile_selector_gridview(GridPane path_creator_tile_selector_gridview) {
		this.path_creator_tile_selector_gridview = path_creator_tile_selector_gridview;
	}

	public ListView<String> getPath_creator_selected_tiles_listview() {
		return path_creator_selected_tiles_listview;
	}

	public void setPath_creator_selected_tiles_listview(ListView<String> path_creator_selected_tiles_listview) {
		this.path_creator_selected_tiles_listview = path_creator_selected_tiles_listview;
	}

	public Button getPath_creator_remove_tile_button() {
		return path_creator_remove_tile_button;
	}

	public void setPath_creator_remove_tile_button(Button path_creator_remove_tile_button) {
		this.path_creator_remove_tile_button = path_creator_remove_tile_button;
	}

	public TextArea getPath_creator_code_text_area() {
		return path_creator_code_text_area;
	}

	public void setPath_creator_code_text_area(TextArea path_creator_code_text_area) {
		this.path_creator_code_text_area = path_creator_code_text_area;
	}

	public Button getPath_creator_area_button() {
		return path_creator_area_button;
	}

	public void setPath_creator_area_button(Button path_creator_area_button) {
		this.path_creator_area_button = path_creator_area_button;
	}

	public Button getPath_creator_path_button() {
		return path_creator_path_button;
	}

	public void setPath_creator_path_button(Button path_creator_path_button) {
		this.path_creator_path_button = path_creator_path_button;
	}

	public Canvas getVisualize_canvas() {
		return visualize_canvas;
	}

	public void setVisualize_canvas(Canvas visualize_canvas) {
		this.visualize_canvas = visualize_canvas;
	}

	public CheckBox getVisualize_show_iteractable_checkbox() {
		return visualize_show_iteractable_checkbox;
	}

	public void setVisualize_show_iteractable_checkbox(CheckBox visualize_show_iteractable_checkbox) {
		this.visualize_show_iteractable_checkbox = visualize_show_iteractable_checkbox;
	}

	public CheckBox getVisualize_show_ground_decoration_checkbox() {
		return visualize_show_ground_decoration_checkbox;
	}

	public void setVisualize_show_ground_decoration_checkbox(CheckBox visualize_show_ground_decoration_checkbox) {
		this.visualize_show_ground_decoration_checkbox = visualize_show_ground_decoration_checkbox;
	}

	public CheckBox getVisualize_wall_decoration_checkbox() {
		return visualize_wall_decoration_checkbox;
	}

	public void setVisualize_wall_decoration_checkbox(CheckBox visualize_wall_decoration_checkbox) {
		this.visualize_wall_decoration_checkbox = visualize_wall_decoration_checkbox;
	}

	public CheckBox getVisualize_wall_objects_checkbox() {
		return visualize_wall_objects_checkbox;
	}

	public void setVisualize_wall_objects_checkbox(CheckBox visualize_wall_objects_checkbox) {
		this.visualize_wall_objects_checkbox = visualize_wall_objects_checkbox;
	}

	public CheckBox getVisualize_npc_checkbox() {
		return visualize_npc_checkbox;
	}

	public void setVisualize_npc_checkbox(CheckBox visualize_npc_checkbox) {
		this.visualize_npc_checkbox = visualize_npc_checkbox;
	}

	public CheckBox getVisualize_players_checkbox() {
		return visualize_players_checkbox;
	}

	public void setVisualize_players_checkbox(CheckBox visualize_players_checkbox) {
		this.visualize_players_checkbox = visualize_players_checkbox;
	}

	public CheckBox getVisualize_ground_items_checkbox() {
		return visualize_ground_items_checkbox;
	}

	public void setVisualize_ground_items_checkbox(CheckBox visualize_ground_items_checkbox) {
		this.visualize_ground_items_checkbox = visualize_ground_items_checkbox;
	}

	public TextArea getVisualize_info_textarea() {
		return visualize_info_textarea;
	}

	public void setVisualize_info_textarea(TextArea visualize_info_textarea) {
		this.visualize_info_textarea = visualize_info_textarea;
	}
}
