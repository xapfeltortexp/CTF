package CTF;

import org.bukkit.plugin.java.JavaPlugin;

import CTF.Commands.CTFCommand;
import CTF.MySQL.CTFMySQL;
import CTF.Util.CTFUtil;

public class CTF extends JavaPlugin {
	
	public CTFUtil util;
	public CTFCommand cmd;
	public CTFMySQL mysql;
	
	public int MySQLPort;
	public String MySQLHost;
	public String MySQLPassword;
	public String MySQLTable;
	public String MySQLUser;
	
	public void onEnable() {
		
		this.mysql = new CTFMySQL(this);
		this.util = new CTFUtil();
		this.cmd = new CTFCommand(this);
		
		getCommand("").setExecutor(cmd);
	}
	
	public void load_Config() {
		
		getConfig().options().copyDefaults(true);
		
		MySQLPort = getConfig().getInt("MySQLPort");
		MySQLHost = getConfig().getString("MySQLHost");
		MySQLTable = getConfig().getString("MySQLTable");
		MySQLPassword = getConfig().getString("MySQLPassword");
		MySQLUser = getConfig().getString("MySQLUser");
	}

}
