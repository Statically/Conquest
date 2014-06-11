package com.Statically.conquest.empires;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 *
 * @author Blackveiled
 * @author thedarklord197
 *
 */
public class EmpireManager {

    private List<Number> empires = new ArrayList<>();

    public enum EmpireType implements Empire {

        EMPIRE("Empire"),
        CONTESTEDTERRITORY("Contested"),
        NEUTRAL("Neutral"),
        PROTECTEDZONE("Protected");

        private short id;
        private short rank;
        private String name;
        private List<String> players = new ArrayList<>();
        private List<String> ranks = new ArrayList<>();

        private EmpireType(String name) {
            this.name = name;

            ranks.add("Leader");
            ranks.add("Officer");
            ranks.add("Soldier");
            ranks.add("Peasant");
            ranks.add("Traitor");
        }

        @Override
        public Empire getEmpire() {
            return null;
        }

        @Override
        public boolean hasPlayer(Player p) {
            return false;
        }

        @Override
        public Location getOrigin() {
            return null;
        }

    }

    public static boolean createEmpire(String name, String uuid) {
        return false;
    }

    public static boolean removeEmpire(String name) {
        return false;
    }

    public static boolean removeEmpire(short id) {
        return false;
    }

    public static boolean exists(String name) {
        return false;
    }

    public static Empire getEmpire(short id) {
        return null;
    }

}
