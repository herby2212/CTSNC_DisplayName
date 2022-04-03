package de.Herbystar.CTSNC_Modules.DisplayName;

import java.io.File;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.Herbystar.CTSNC.ReplaceString;

public class DisplayName {
	
	
	File f = new File("plugins/CTSNC", "Chat.yml");
	YamlConfiguration config = YamlConfiguration.loadConfiguration(f);
	File f2 = new File("plugins/CTSNC", "CustomTags.yml");
	YamlConfiguration config2 = YamlConfiguration.loadConfiguration(f2);
	File f3 = new File("plugins/CTSNC", "CustomTags_Data.yml");
	YamlConfiguration config3 = YamlConfiguration.loadConfiguration(f3);
	
	public boolean permission_based = config2.getBoolean("CTSNC.CUSTOM_TAGS.PermissionBased");
	public boolean default_op = config2.getBoolean("CTSNC.CUSTOM_TAGS.DefaultOP");
	
	public void setDisplayName() {		
		for(Player players : Bukkit.getOnlinePlayers()) {
//			Player p1 = (Player) Bukkit.getOfflinePlayer(players.getName());
			if(config.getBoolean("CTSNC.CHAT.CustomChatName") == false) {
				return;
			}
			if(players.isOp() && this.default_op == true) {
        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.OP.Name"), players) + players.getName());
        		continue;
			} else {
    			if(this.permission_based == true) {
    				if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag1.Permission"))) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag1.Name"), players) + players.getName());
    	        		continue;
    				}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag2.Permission"))) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag2.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag3.Permission"))) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag3.Name"), players)  + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag4.Permission"))) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag4.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag5.Permission"))) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag5.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag6.Permission"))) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag6.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag7.Permission"))) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag7.Name"), players) + players.getName());
    					continue;
    				}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag8.Permission"))) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag8.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag9.Permission"))) {	
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag9.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag10.Permission"))) {   		
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag10.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag11.Permission"))) {   		
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag11.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag12.Permission"))) {   		
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag12.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag13.Permission"))) {   		
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag13.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag14.Permission"))) {   		
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag14.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag15.Permission"))) {   		
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag15.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag16.Permission"))) {   		
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag16.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag17.Permission"))) {   		
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag17.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag18.Permission"))) {   		
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag18.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag19.Permission"))) {   		
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag19.Name"), players) + players.getName());
    	        		continue;
    	        	}
    	        	if(players.hasPermission(config2.getString("CTSNC.CUSTOM_TAGS.Tag20.Permission"))) {   		
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag20.Name"), players) + players.getName());
    	        		continue;
    	        	}   				
    			} else {
    				UUID uuid = players.getUniqueId();
					int tag = config3.getInt("CTSNC.CustomTag." + uuid.toString());
					int tag_name = config3.getInt("CTSNC.CustomTag." + players.getName());
					if(tag == 1 | tag_name == 1) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag1.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 2 | tag_name == 2) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag2.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 3 | tag_name == 3) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag3.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 4 | tag_name == 4) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag4.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 5 | tag_name == 5) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag5.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 6 | tag_name == 6) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag6.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 7 | tag_name == 7) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag7.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 8 | tag_name == 8) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag8.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 9 | tag_name == 9) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag9.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 10 | tag_name == 10) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag10.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 11 | tag_name == 11) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag11.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 12 | tag_name == 12) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag12.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 13 | tag_name == 13) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag13.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 14 | tag_name == 14) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag14.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 15 | tag_name == 15) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag15.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 16 | tag_name == 16) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag16.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 17 | tag_name == 17) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag17.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 18 | tag_name == 18) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag18.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 19 | tag_name == 19) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag19.Name"), players) + players.getName());
    	        		continue;
					}
					if(tag == 20 | tag_name == 20) {
    	        		players.setDisplayName(ReplaceString.replaceString(config2.getString("CTSNC.CUSTOM_TAGS.Tag20.Name"), players) + players.getName());
    	        		continue;
					}
    			}
			}

		}
	}

}
