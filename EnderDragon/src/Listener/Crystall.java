package Listener;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import de.Bn.pack.Start;



public class Crystall implements Listener {
	int crycount=10;
	@EventHandler
	public void onHit(EntityDamageByEntityEvent e) {
		
		
		Entity crystal = e.getEntity();
		 if(crystal.getType().equals(EntityType.ENDER_CRYSTAL)){
			if(Start.start == false) { 
			 
			 
			 int i = crycount;
			 crycount = i-1;
			 
			 if(crycount >0) {
			 Bukkit.broadcastMessage(" ");
			 Bukkit.broadcastMessage("§d[Crystal] §aEs sind noch " +Integer.toString(crycount)+ " §aübrig");
			 }else {
			 Bukkit.broadcastMessage(" ");
			 Bukkit.broadcastMessage(" ");
			 Bukkit.broadcastMessage("§aAlle §dCrystal §asind zerstört!");
			 }
			}
           
           
          
           
           
		
            
		}
		
	}
	static Map<String, Double> crystalc = new HashMap<String, Double>();
	@EventHandler
	public void werhatcrystallzerstoert (EntityDamageByEntityEvent e) {
		
		Entity crystal = e.getEntity();
		 if(crystal.getType().equals(EntityType.ENDER_CRYSTAL)){		
			 if(e.getDamager() instanceof Player) {
				 Player p = (Player) e.getDamager();
				 if(crystalc.containsKey(p.getName())) {
					 
					 double count = crystalc.get(p.getName());
					 
					 double map1 = count + 1;
					 
					 crystalc.put(p.getName(), map1);
					 
					 p.sendMessage(Double.toString(crystalc.get(p.getName())));
						
					} else {
						double d = 1;
						crystalc.put(p.getName(), d);
					}
			 }
		 }
		
	}
	
}
