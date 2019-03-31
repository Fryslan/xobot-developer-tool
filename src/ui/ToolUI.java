package ui;

import data.Storage;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ToolUI {
	private static JFrame frame;
	private static JFXPanel fxPanel;
	private static Scene scene;

	private static void initAndShowGUI() {

		try {
			fxPanel = new JFXPanel();
			frame = new JFrame("Frisian Developer Tool");
			Platform.setImplicitExit(false);

			frame.add(fxPanel);
			frame.setSize(665, 600);
			//Show the JFrame
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			Platform.runLater(() -> {
				Platform.setImplicitExit(false);
				initFX(fxPanel);
				Platform.setImplicitExit(false);
			});
		} catch (HeadlessException e) {
			e.printStackTrace();
		}
	}

	private static void initFX(JFXPanel fxPanel) {
		// This method is invoked on the JavaFX thread.
		Platform.setImplicitExit(false);
		scene = createScene();
		fxPanel.setScene(scene);
	}

	private static Scene createScene() {
		Scene scene;
		try {
			Storage.controlller = new ToolUIController();
			FXMLLoader loader = new FXMLLoader();
			Platform.setImplicitExit(false);
			loader.setController(Storage.controlller);
			loader.setLocation(new URL("https://fryslan.000webhostapp.com/xobot/tool_ui.fxml"));
			Parent root = (Parent) loader.load();

			scene = new Scene(root);
			return (scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void initialize() {
		//launch the application.
		SwingUtilities.invokeLater(() -> initAndShowGUI());
		Storage.loaded = true;
	}
}
