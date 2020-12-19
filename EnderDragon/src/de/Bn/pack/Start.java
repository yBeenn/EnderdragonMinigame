package de.Bn.pack;



import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;



public class Start implements CommandExecutor, Listener {
public static boolean start = true;
public static boolean game = false;






static Map<String, Integer> vote = new HashMap<String, Integer>();

static int pro = 0;
static int op = 0;
static int iron = 0;

ItemStack Pro = new ItemStack(Material.STONE_SWORD);
ItemStack Op = new ItemStack(Material.NETHERITE_SWORD);
ItemStack Iron = new ItemStack(Material.IRON_SWORD);

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(args.length == 0) {
				start = true;
				
					p.setGameMode(GameMode.SURVIVAL);
					World world = Bukkit.getServer().getWorld("world_the_end");
					Location l = new Location(world, 0, 67, 0);
					p.teleport(l);
						start = false;
						game = true;
						p.sendMessage("game = true");
						
						
						Location l1 = new Location(world, 0, 67, 0);
						p.teleport(l1);
						Equipy.PlayerEquipy(p);
				
				
						
							
							
				
						
					
				
			}
		}
		return false;
	}
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		vote.put(p.getName(), 4);
		World world = Bukkit.getServer().getWorld("world_the_end");
		p.sendMessage("join");
		
		Location l = new Location(world, 0, 67, 0);
		p.teleport(l);
		if(start == true) {
			p.getInventory().clear();
			ItemStack item = new ItemStack(Material.CHEST);
			ItemMeta itemM = item.getItemMeta();
			itemM.setDisplayName("§f§lKitSelector");
			item.setItemMeta(itemM);
			p.getInventory().setItem(0, item);
			if(start == true) {
				p.setGameMode(GameMode.CREATIVE);
			}
		}else p.setGameMode(GameMode.SPECTATOR);
	}
	@EventHandler
	public void onOpenenee(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if(p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase("§f§lKitSelector")) {
			p.sendMessage("click");
			
			
			org.bukkit.inventory.Inventory inv = Bukkit.createInventory(null, 9, "§f§lKitSelector");
			p.openInventory(inv);
			
			inv.addItem(Pro);
			inv.addItem(Iron);
			inv.addItem(Op);
			p.sendMessage(Integer.toString(pro));
			e.setCancelled(true);
			
			
			
		}
	}

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if(e.getClickedInventory() != null ) {
			int i = 9;
			if(e.getClickedInventory().getSize()== i) {
				e.setCancelled(true);
				Player p = (Player)e.getWhoClicked();
				p.sendMessage("hier geths noch");
				if(vote.get(p.getName()) >1) {
					p.sendMessage("hier auch noch!!!");
					
				
				if(e.getCurrentItem().equals(Pro)) {
					pro = +1;
					vote.put(p.getName(), 0);
					Pro.setAmount(Pro.getAmount() +1);
					p.closeInventory();
					
				}if(e.getCurrentItem().equals(Op)) {
					op = +1;
					vote.put(p.getName(), 0);
					p.closeInventory();
					
					Op.setAmount(Pro.getAmount() +1);
				}if(e.getCurrentItem().equals(Iron)) {
					iron = +1;
					vote.put(p.getName(), 0);
					p.closeInventory();
					
					Iron.setAmount(Pro.getAmount() +1);
				}
					
				}else {
					p.sendMessage("§f§lDu hast schon gevotet!");
				}
			}
		}
	}
	@EventHandler
	public void onBlock (BlockBreakEvent e) {
		if(start == true) {
			
			e.setCancelled(true);
		}
	}

	@EventHandler
	public void onHit (EntityDamageEvent e) {
		if(start == true) {
			
			e.setCancelled(true);
		}
	}
	@EventHandler
	public void onblockBlace (BlockPlaceEvent e) {
		if(start == true) {
			
			e.setCancelled(true);
			}
	}
	@EventHandler 
	public void onDrop(PlayerDropItemEvent e) {
		
		
		if(start == true) {
		e.setCancelled(true);
		
		}
	}
	@EventHandler
	public void onDeathPlayer(PlayerDeathEvent e) {
		Player p = e.getEntity();
		p.setGameMode(GameMode.SPECTATOR);
	}
}
