package de.Bn.pack;

import java.util.Collection;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Equipy {
	
	public static void  PlayerEquipy(Player pla) {
		
		ItemStack bow = new ItemStack(Material.BOW);
		ItemStack arrow = new ItemStack(Material.ARROW, 64);
		ItemStack water = new ItemStack(Material.WATER_BUCKET, 1);
		ItemStack essen = new ItemStack(Material.COOKED_BEEF, 30);
		
		
		Collection<? extends Player> p = Bukkit.getServer().getOnlinePlayers();
		
		pla.getInventory().clear();
		if(Start.pro > Start.iron) {
			if(Start.pro > Start.op) {
				pla.sendMessage("Pro");
				for (Player p1 : p) {
				    p1.getInventory().setItem(0 ,new ItemStack(Material.STONE_SWORD));
				    p1.getInventory().setItem(2,new ItemStack(Material.IRON_PICKAXE));
				    p1.getInventory().setItem(1,bow);
				    p1.getInventory().setItem(3,new ItemStack(Material.GOLDEN_APPLE));
				    p1.getInventory().setItem(4,new ItemStack(Material.COBBLESTONE, 64));
				    p1.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				    
				    p1.getInventory().setItem(10, new ItemStack(Material.STONE_SWORD));
				    p1.getInventory().setItem(9, arrow);
				    p1.getInventory().setItem(8, water);
				    p1.getInventory().setItem(5, essen);
				    p1.getInventory().setItem(7, new ItemStack(Material.CARVED_PUMPKIN));
				}
				
				
				
			}else {
				
				
				
				
				pla.sendMessage("Op");
				
				for (Player p1 : p) {
					p1.getInventory().setItem(0, new ItemStack(Material.NETHERITE_SWORD));
					p1.getInventory().setItem(2, new ItemStack(Material.NETHERITE_PICKAXE));
					p1.getInventory().setItem(1, bow);
					p1.getInventory().setItem(5, essen);
					p1.getInventory().setItem(4, new ItemStack(Material.COBBLESTONE, 64));
					p1.getInventory().setItem(8, water);
					
					p1.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
					p1.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
					p1.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
					p1.getInventory().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
					
					
				}
			}
		}if(Start.iron > Start.op) {
			
			
			pla.sendMessage("Iron");
			for (Player p1 : p) {
				p1.getInventory().setItem(0, new ItemStack(Material.IRON_SWORD));
				p1.getInventory().setItem(2, new ItemStack(Material.IRON_PICKAXE));
				p1.getInventory().setItem(1, bow);
				p1.getInventory().setItem(5, essen);
				p1.getInventory().setItem(4, new ItemStack(Material.COBBLESTONE, 64));
				p1.getInventory().setItem(8, water);
				
				p1.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
				p1.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				p1.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
				p1.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
				
				
			}
			for (Player p1 : p) {
				p1.getInventory().setItem(0, new ItemStack(Material.IRON_SWORD));
				p1.getInventory().setItem(1, bow);
				p1.getInventory().setItem(10, arrow);
				p1.getInventory().setItem(19, arrow);
				p1.getInventory().setItem(28, arrow);
				p1.getInventory().setItem(4, new ItemStack(Material.COBBLESTONE, 64));
				p1.getInventory().setItem(5, essen);
				p1.getInventory().setItem(8, water);
				
				
				p1.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				p1.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
				p1.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
				p1.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
			}
			
			
			
		}else if(Start.op > Start.pro) {
			pla.sendMessage("Op");
			for (Player p1 : p) {
				p1.getInventory().setItem(0, new ItemStack(Material.NETHERITE_SWORD));
				p1.getInventory().setItem(2, new ItemStack(Material.NETHERITE_PICKAXE));
				p1.getInventory().setItem(1, bow);
				p1.getInventory().setItem(5, essen);
				p1.getInventory().setItem(4, new ItemStack(Material.COBBLESTONE, 64));
				p1.getInventory().setItem(8, water);
				
				p1.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
				p1.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
				p1.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
				p1.getInventory().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
				
				p1.getInventory().setItem(10, arrow);
				p1.getInventory().setItem(19, arrow);
				p1.getInventory().setItem(28, arrow);
				
				
			}
		}
	}
}
