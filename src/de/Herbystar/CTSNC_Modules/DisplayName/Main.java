package de.Herbystar.CTSNC_Modules.DisplayName;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import de.Herbystar.CTSNC.Modules;

public class Main extends JavaPlugin {
	
	File f1 = new File("plugins/CTSNC", "CustomTags.yml");
	YamlConfiguration config1 = YamlConfiguration.loadConfiguration(f1);
	
	public static BukkitTask displayname;
	private int displaynameinterval = config1.getInt("CTSNC.CUSTOM_TAGS.Update");
	
	public void onEnable() {
		Modules m = new Modules();
		if(m.NameTagModule() == false) {
			startDisplayName();
		}
	}
	
	public void onDisable() {
		
	}
	
	private void startDisplayName() {
		final DisplayName d = new DisplayName();
		displayname = new BukkitRunnable() {
			
			@Override
			public void run() {
				d.setDisplayName();				
			}
		}.runTaskTimer(this, 0, displaynameinterval);
	}
}
