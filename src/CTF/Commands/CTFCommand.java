package CTF.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import CTF.CTF;

public class CTFCommand implements CommandExecutor {
	
	public CTF main;
	
	public CTFCommand(CTF main) {
		this.main = main;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(!(sender instanceof Player)) {
			return false;
		}
		
		if(cmd.getName().equalsIgnoreCase("ctf")) {
			
			if(args.length == 0) {
				//Help
			} 
			
			
		}
		return false;
	}

}
