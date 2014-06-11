package com.Statically.conquest.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import com.Statically.conquest.empires.Empire;

/**
 * 
 * @author Blackveiled
 * @author thedarklord197
 * 
 * */

public class EmpireCollapseEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	
	private Empire empire;
	private Empire empire2;
	
	/* 
	 * Event triggered when an empire collapses
	 * getEmpire retrieves the fallen empire
	 * getOtherEmpire retrieves the empire which conquered empire
	 * */
	
    public EmpireCollapseEvent(Empire empire, Empire empire2) {
    	this.empire = empire;
    	this.empire2 = empire2;
    }
    
    public Empire getEmpire() {
    	return empire;
    }
    
    public Empire getCause() {
    	return empire2;
    }
	
	public HandlerList getHandlers() {
	    return handlers;
	}
	 
	public static HandlerList getHandlerList() {
	    return handlers;
	}

}
