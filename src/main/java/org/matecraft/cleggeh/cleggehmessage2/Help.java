/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.matecraft.cleggeh.cleggehmessage2;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 *
 * @author martin
 */
public class Help {

    private final CleggehMessage plugin;

    public Help(CleggehMessage plugin) {
        this.plugin = plugin;
    }

    public void sethelp(Player p) {
        p.sendMessage(ChatColor.RED + "------" + ChatColor.GRAY + "[CleggehMessage]" + ChatColor.RED + "------");
        p.sendMessage(ChatColor.GREEN + "/cm set Staff");
        p.sendMessage(ChatColor.GREEN + "/cm set Member");
        p.sendMessage(ChatColor.GREEN + "/cm set Builder");
        p.sendMessage(ChatColor.GREEN + "/cm set Gladiator");
        p.sendMessage(ChatColor.GREEN + "/cm set Navigation");
        p.sendMessage(ChatColor.RED + "-----------" + ChatColor.GRAY + "[End]" + ChatColor.RED + "------------");
    }

    public void colorhelp(Player p) {
        p.sendMessage(ChatColor.RED + "------" + ChatColor.GRAY + "[CleggehMessage]" + ChatColor.RED + "------");
        p.sendMessage(ChatColor.GREEN + "/color <Color>");
        p.sendMessage(ChatColor.GREEN + "/color List");
        p.sendMessage(ChatColor.GREEN + "/color all");
        p.sendMessage(ChatColor.GREEN + "/format <Format>");
        p.sendMessage(ChatColor.GREEN + "/format List");
        p.sendMessage(ChatColor.GREEN + "/format all");
        p.sendMessage(ChatColor.RED + "-----------" + ChatColor.GRAY + "[End]" + ChatColor.RED + "------------");
    }

    public void allcolor(Player p) {
        p.sendMessage(ChatColor.RED + "------" + ChatColor.GRAY + "[CleggehMessage]" + ChatColor.RED + "------");
        p.sendMessage(ChatColor.GREEN + "Black Dark_Blue");
        p.sendMessage(ChatColor.GREEN + "Dark_Green Dark_Aqua");
        p.sendMessage(ChatColor.GREEN + "Dark_Red Dark_Purple ");
        p.sendMessage(ChatColor.GREEN + "Gold Gray");
        p.sendMessage(ChatColor.GREEN + "Dark_Gray Blue");
        p.sendMessage(ChatColor.GREEN + "Green Aqua");
        p.sendMessage(ChatColor.GREEN + "Red Light_Purple");
        p.sendMessage(ChatColor.GREEN + "Yellow White");
        p.sendMessage(ChatColor.RED + "-----------" + ChatColor.GRAY + "[End]" + ChatColor.RED + "------------");
    }
}
