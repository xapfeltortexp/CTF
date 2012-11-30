package CTF.Util;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Location;

public class CTFUtil {

	private String player;
	public ArrayList<String> players = new ArrayList<String>();

	public String getPlayer(String name) {
		return player;
	}

	public String isPlayerInArena(ArrayList<String> arrayList, String name, String arenaname) {
		
		if(arenaname == null) {
			return null;
		}
		
		if (arrayList.contains(name)) {
			return name;
		}
		return null;
	}
	
	public void createArena(String arenaname, Location loc1, Location loc2) {
		
	}
	
	public String getArenaByName(String arenaname) {
		if(arenaname == null)
			return null;
		return arenaname;
	}
	
	public boolean isInArea(String arenaname, Location ploc, Location loc1, Location loc2) {
		double[] ecke = new double[2];

		ecke[0] = loc1.getX();
		ecke[1] = loc2.getX();
		Arrays.sort(ecke);
		if (ploc.getX() > ecke[1] || ploc.getX() < ecke[0])
			return false;

		ecke[0] = loc1.getZ();
		ecke[1] = loc2.getZ();
		Arrays.sort(ecke);
		if (ploc.getZ() > ecke[1] || ploc.getZ() < ecke[0])
			return false;

		ecke[0] = loc1.getY();
		ecke[1] = loc2.getY();
		Arrays.sort(ecke);
		if (ploc.getY() > ecke[1] || ploc.getY() < ecke[0])
			return false;

		return true;
	}
}
