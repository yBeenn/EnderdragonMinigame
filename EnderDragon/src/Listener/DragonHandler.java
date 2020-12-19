package Listener;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import de.Bn.pack.Start;

public class DragonHandler implements Listener {
	
	
	 static Map<String, Double> dragondamage = new HashMap<String, Double>();
	
	
	
	
	
	
	
	@EventHandler
	 public void DragonDamage(EntityDamageByEntityEvent e) {
		 
		
		 
	 
		 if(e.getDamager() instanceof Player){
			 Player p = (Player) e.getDamager();
			 
			 if(e.getEntity() instanceof EnderDragon){
				if(Start.start == false)  {
				 
				 if(dragondamage.containsKey(p.getName())) {
					 
					 double damage = dragondamage.get(p.getName());
					 
					 double map1 = damage + e.getFinalDamage();
					 
					 dragondamage.put(p.getName(), map1);
					 
					 p.sendMessage(Double.toString(dragondamage.get(p.getName())));
						
					} else {
						dragondamage.put(p.getName(), e.getFinalDamage());
					}
				}
				 
			 }
			 
	 }
	}
	@EventHandler
	public void onEntityDamageByEntitys(EntityDamageByEntityEvent event) {

	   Entity damager = event.getDamager();

	   if(damager instanceof Arrow) { // check if the damager is an arrow

	       Arrow a = (Arrow) damager;
	       if(a.getShooter() instanceof Player) {
	            // the arrow.getShooter() here is the player who fired the arrow
	    	   Player p =  (Player) a.getShooter();
	    	   if(dragondamage.containsKey(p.getName())) {
					 
					 double damage = dragondamage.get(p.getName());
					 
					 double map1 = damage + event.getFinalDamage();
					 
					 dragondamage.put(p.getName(), map1);
					 
					 p.sendMessage(Double.toString(dragondamage.get(p.getName())));
						
					} else {
						dragondamage.put(p.getName(), event.getFinalDamage());
					}
	       }

	       
	   }
	           
	       

	}
	
	 
	 
}
