package command;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Test implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(args.length == 0) {
				
				int crycount=187;
				   World world = Bukkit.getServer().getWorld("world");
				   
				   for (Player target : Bukkit.getServer().getOnlinePlayers()) {
					   
					        target.kickPlayer("§4§lReset");
					}
				   
				   
		           World world1 = Bukkit.getServer().getWorld("world_the_end");
		           Bukkit.getServer().unloadWorld(world1, true);
		           
		           Bukkit.broadcastMessage(Integer.toString(crycount));
		           deleteWorld(world1.getWorldFolder());
		           Bukkit.getServer().shutdown();
		           
				
			}
			
		}
		return false;
	}
		
	
	  public static void deleteWorld(File file) 
	    {
	        if(file.isFile())
	        {
	            file.delete();
	        }
	        else if(file.isDirectory())
	        {
	            for(File f : file.listFiles())
	            {
	                deleteWorld(f);
	            }

	            file.delete();
	        }
	    }

	}
