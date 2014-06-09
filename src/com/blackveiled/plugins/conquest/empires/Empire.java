package com.blackveiled.plugins.conquest.empires;

import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 *
 * @author Blackveiled
 * @author thedarklord197
 *
 */
public interface Empire {

    public Empire getEmpire(String name);

    public Empire getEmpire(short id);

    public boolean createEmpire(String name, String uuid);

    public boolean removeEmpire(String name);

    public boolean removeEmpire(short id);

    public boolean exists(String name);

    public boolean hasPlayer(Player p);

    public Location getOrigin();
}
