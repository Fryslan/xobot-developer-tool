package data;

import strategies.Strategy;
import ui.ToolUIController;
import xobot.script.wrappers.Tile;
import xobot.script.wrappers.interactive.Item;

import java.util.ArrayList;

public class Storage {
	public static ArrayList<Strategy> strategies;
	public static boolean loaded = false;
	public static ToolUIController controlller;
	public static ArrayList<Item> bankItems = new ArrayList<>();
	public static ArrayList<Integer> settingsCache = new ArrayList<>();
	public static ArrayList<Tile> currentTiles;
	public static Tile highlightedTile;
}
