package Listener;

import java.util.Collection;

import org.bukkit.Bukkit;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.util.Vector;

public class WinListener implements Listener {

	@EventHandler
	public void onWin(EntityDeathEvent e) {
		if(e.getEntity() instanceof EnderDragon) {
			Collection<? extends Player> p = Bukkit.getServer().getOnlinePlayers();
			for (Player p1 : p) {
				Double damage = DragonHandler.dragondamage.get(p1.getName());
				Bukkit.broadcastMessage("§b"+p1.getName()+" : "+ "§a"+damage);
				p1.setVelocity(new Vector(0,1,0));
				p1.setFlying(true);
			}
		}
	}
}
