package org.matecraft.cleggeh.cleggehmessage2;

import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class SetCommands {
    

    private final CleggehMessage plugin;
    public SetCommands(CleggehMessage plugin) {
        this.plugin = plugin;
    }
    void setstaff(Player p, String[] args) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < args.length; ++i) {
            String appended = args[i] + " ";
            str.append(appended);
        }
        String staff = str.toString();
        plugin.getConfig().set("staffmessage", staff);
        plugin.saveConfig();
        p.sendMessage(ChatColor.GREEN + "Staff message set to: " + ChatColor.WHITE + staff);
    }
    void setmember(Player p, String[] args) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < args.length; ++i) {
            String appended = args[i] + " ";
            str.append(appended);
        }
        String member = str.toString();
        plugin.getConfig().set("membermessage", member);
        plugin.saveConfig();
        p.sendMessage(ChatColor.GREEN + "Member message set to: " + ChatColor.WHITE + member);
    }
        void setbuilder(Player p, String[] args) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < args.length; ++i) {
            String appended = args[i] + " ";
            str.append(appended);
        }
        String builder = str.toString();
        plugin.getConfig().set("buildermessage", builder);
        plugin.saveConfig();
        p.sendMessage(ChatColor.GREEN + "Builder message set to: " + ChatColor.WHITE + builder);
    }
        void setgladiator(Player p, String[] args) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < args.length; ++i) {
            String appended = args[i] + " ";
            str.append(appended);
        }
        String gladiator = str.toString();
        plugin.getConfig().set("gladiatormessage", gladiator);
        plugin.saveConfig();
        p.sendMessage(ChatColor.GREEN + "Gladiator message set to: " + ChatColor.WHITE + gladiator);
    }
}
