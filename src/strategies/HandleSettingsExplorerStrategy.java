package strategies;

import data.Storage;
import javafx.application.Platform;
import ui.ToolUIController;
import xobot.script.methods.Settings;

public class HandleSettingsExplorerStrategy implements Strategy {
	@Override
	public boolean activate() {

		if(Storage.settingsCache.isEmpty()){
			for(int setting : Settings.get()){
				Storage.settingsCache.add(setting);
			}
		}

		return hasChanged();
	}

	@Override
	public void execute() {

		Platform.runLater(() -> {
			ToolUIController controller = Storage.controlller;
			//controller.getSettings_data_listview().getItems().
		});

	}

	private boolean hasChanged(){
		for (int i = 0; i < Settings.get().length; i++) {
			if(Settings.get(i) != Storage.settingsCache.get(i)) {
				return true;
			}
		}
		return false;
	}
}
