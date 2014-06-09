package com.blackveiled.plugins.conquest.empires;

import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 *
 * @author Blackveiled
 * @author thedarklord197
 *
 */
public class EmpireManager {

    public enum EmpireType implements Empire {

        EMPIRE("Empire"),
        CONTESTEDTERRITORY("Contested"),
        PROTECTEDZONE("Protected");

        private String name;

        private EmpireType(String name) {
            this.name = name;
        }

        @Override
        public Empire getEmpire(String name) {
            return null;
        }

        @Override
        public Empire getEmpire(short id) {
            return null;
        }

        @Override
        public boolean createEmpire(String name, String uuid) {
            return false;
        }

        @Override
        public boolean removeEmpire(String name) {
            return false;
        }

        @Override
        public boolean removeEmpire(short id) {
            return false;
        }

        @Override
        public boolean exists(String name) {
            return false;
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

}
