package org.matecraft.cleggeh.cleggehmessage2;

import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class InfoCommands {

    private final CleggehMessage plugin;

    public InfoCommands(CleggehMessage plugin) {
        this.plugin = plugin;
    }

    void staff(Player p) {
        try {
            String staffmessage = plugin.getConfig().getString("staffmessage");
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', staffmessage));
        } catch (IllegalArgumentException e) {
            p.sendMessage(ChatColor.RED + "Message not set");
        }
    }

    void member(Player p) {
        try {
            String membermessage = plugin.getConfig().getString("membermessage");
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', membermessage));
        } catch (IllegalArgumentException e) {
            p.sendMessage(ChatColor.RED + "Message not set");
        }
    }

    void builder(Player p) {
        try {
            String buildermessage = plugin.getConfig().getString("buildermessage");
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', buildermessage));
        } catch (IllegalArgumentException e) {
            p.sendMessage(ChatColor.RED + "Message not set");
        }
    }

    void gladiator(Player p) {
        try {
            String gladiatormessage = plugin.getConfig().getString("gladiatormessage");
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', gladiatormessage));
        } catch (IllegalArgumentException e) {
            p.sendMessage(ChatColor.RED + "Message not set");
        }
    }

    void navigation(Player p) {
        try {
            String navigationmessage = plugin.getConfig().getString("navigationmessage");
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', navigationmessage));
        } catch (IllegalArgumentException e) {
            p.sendMessage(ChatColor.RED + "Message not set");
        }
    }

    void teamspeak(Player p) {
        try {
            String teamspeakmessage = plugin.getConfig().getString("teamspeakmessage");
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', teamspeakmessage));
        } catch (IllegalArgumentException e) {
            p.sendMessage(ChatColor.RED + "Message not set");
        }
    }

    void claiming(Player p) {
        try {
            String teamspeakmessage = plugin.getConfig().getString("claimingmessage");
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', teamspeakmessage));
        } catch (IllegalArgumentException e) {
            p.sendMessage(ChatColor.RED + "Message not set");
        }
    }

    void sendmessage(Player p) {

    }
}
