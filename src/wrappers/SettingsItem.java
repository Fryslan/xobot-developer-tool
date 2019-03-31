package wrappers;

import java.util.ArrayList;

public class SettingsItem {
	private final String tag;
	private final int setting;
	private final int lastVallue;
	private final ArrayList<String> previousData;

	public SettingsItem(String tag, int setting, int lastVallue, ArrayList<String> previousData){
		this.tag = tag;
		this.setting = setting;
		this.lastVallue = lastVallue;
		this.previousData = previousData;
	}

	public String getTag() {
		return tag;
	}

	public int getSetting() {
		return setting;
	}

	public int getLastVallue() {
		return lastVallue;
	}

	public ArrayList<String> getPreviousData() {
		return previousData;
	}
}
