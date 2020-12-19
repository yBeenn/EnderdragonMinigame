package de.Bn.pack;



import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import Listener.Crystall;
import Listener.DragonHandler;
import Listener.WinListener;
import command.Test;
import command.Test2;



public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		PluginManager pluginmanager = Bukkit.getPluginManager();
		pluginmanager.registerEvents(new Crystall(), this);
		getCommand("reset").setExecutor(new Test());
		Bukkit.broadcastMessage("start");
		pluginmanager.registerEvents(new DragonHandler(), this);
		getCommand("start").setExecutor(new Start());
		getCommand("test").setExecutor(new Test2());
		pluginmanager.registerEvents(new Start(), this);
		pluginmanager.registerEvents(new WinListener(), this);
	}
		
	@Override
	public void onDisable() {
		
		
	}

	
		
}
