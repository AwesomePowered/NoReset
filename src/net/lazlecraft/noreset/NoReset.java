package net.lazlecraft.noreset;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NoReset extends JavaPlugin implements Listener {
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent ev){
		Player p = ev.getPlayer();
		String msg = ev.getMessage();
		if (!msg.contains("&r") && p.hasPermission("noreset.reset")) {
			ev.setMessage(msg);
		}
		else {
			ev.setMessage(ChatColor.GREEN + "LazleCraft is an awesome server!");
		}
	}
}
