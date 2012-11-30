package CTF;

import org.bukkit.plugin.java.JavaPlugin;

import CTF.Commands.CTFCommand;
import CTF.Util.CTFUtil;

public class CTF extends JavaPlugin {
	
	public CTFUtil util;
	public CTFCommand cmd;
	
	public void onEnable() {
		
		this.util = new CTFUtil();
		this.cmd = new CTFCommand(this);
		
		getCommand("").setExecutor(cmd);
	}

}
