package org.matecraft.cleggeh.cleggehmessage2;

import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class InfoCommands {

    private final CleggehMessage plugin;

    public InfoCommands(CleggehMessage plugin) {
        this.plugin = plugin;
    }

    void staff(Player p) {
        String staffmessage = plugin.getConfig().getString("staffmessage");
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', staffmessage));
    }

    void member(Player p) {
        String membermessage = plugin.getConfig().getString("membermessage");
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', membermessage));
    }

    void builder(Player p) {
        String buildermessage = plugin.getConfig().getString("buildermessage");
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', buildermessage));
    }

    void gladiator(Player p) {
        String gladiatormessage = plugin.getConfig().getString("gladiatormessage");
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', gladiatormessage));
    }

    void navigation(Player p) {
        String navigationmessage = plugin.getConfig().getString("navigationmessage");
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', navigationmessage));
    }

    void sendmessage(Player p) {

    }
}
