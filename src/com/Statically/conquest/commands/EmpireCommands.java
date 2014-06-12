/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Statically.conquest.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author Blackveiled
 * @author thedarklord197
 *
 * 
 */

public class EmpireCommands implements CommandExecutor {

    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if (!(s instanceof Player)) {
            s.sendMessage("You cannot use this command while not in-game.");
            return false;
        }
        if (args[0].length() > 0) {
            switch (args[0]) {
                case "new":
                    if (s.hasPermission("conquest.new") || s.hasPermission("conquest.default")) {
                    }
                    break;
                case "view":
                    break;
                case "list":
                    break;
                case "disband":
                    break;
                case "hiscores":
                    break;
                case "map":
                    break;
                case "admin":
                	if (s.hasPermission("conquest.admin")) {
                	switch (args[1]) {
                	case "reload":
                		break;
                	default: 
                		s.sendMessage(ChatColor.RED + "Invalid command arguments.");
                		break;
                	}
                	}
                default: 
                	s.sendMessage(ChatColor.RED + "Invalid command arguments.");
                	break;
                }

        }
        return true;
    }
}
