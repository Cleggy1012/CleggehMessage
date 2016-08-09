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
        p.sendMessage(ChatColor.RED + "----------" + ChatColor.DARK_PURPLE + "[Matecraft]" + ChatColor.RED + "----------");
        p.sendMessage(ChatColor.GREEN + "/cm set Staff");
        p.sendMessage(ChatColor.GREEN + "/cm set Member");
        p.sendMessage(ChatColor.GREEN + "/cm set Builder");
        p.sendMessage(ChatColor.GREEN + "/cm set Gladiator");
        p.sendMessage(ChatColor.GREEN + "/cm set Navigation");
        p.sendMessage(ChatColor.GREEN + "/cm set teamspeak");
        p.sendMessage(ChatColor.RED + "-----------" + ChatColor.DARK_PURPLE + "[End]" + ChatColor.RED + "------------");
    }

    public void colorhelp(Player p) {
        p.sendMessage(ChatColor.RED + "----------" + ChatColor.DARK_PURPLE + "[Matecraft]" + ChatColor.RED + "----------");
        p.sendMessage(ChatColor.GREEN + "/color <Color>" + ChatColor.WHITE + " --- "  + ChatColor.DARK_GRAY + "For a Color code.");
        p.sendMessage(ChatColor.GREEN + "/color <Format>" + ChatColor.WHITE + " --- "  + ChatColor.DARK_GRAY + "For a Format code.");
        p.sendMessage(ChatColor.GREEN + "/color" + ChatColor.WHITE + " --- "  + ChatColor.DARK_GRAY + "For a list of arguments.");
        p.sendMessage(ChatColor.RED + "-----------" + ChatColor.DARK_PURPLE + "[End]" + ChatColor.RED + "------------");
    }

    public void allcolor(Player p) {
        p.sendMessage(ChatColor.RED + "----------" + ChatColor.DARK_PURPLE + "[Matecraft]" + ChatColor.RED + "----------");
        p.sendMessage("Black, Dark_Blue");
        p.sendMessage("Dark_Green, Dark_Aqua");
        p.sendMessage("Dark_Red, Dark_Purple ");
        p.sendMessage("Gold, Gray");
        p.sendMessage("Dark_Gray, Blue");
        p.sendMessage("Green, Aqua");
        p.sendMessage("Red, Light_Purple");
        p.sendMessage("Yellow, White");
        p.sendMessage("Obfuscated, Bold");
        p.sendMessage("Strikethrough, Underline");
        p.sendMessage("Italic, Reset");
        p.sendMessage(ChatColor.RED + "-----------" + ChatColor.GRAY + "[End]" + ChatColor.RED + "------------");
    }
    public void addPerm(Player p){
        p.sendMessage(ChatColor.GREEN + "/addperm " + ChatColor.YELLOW + "{server} " + ChatColor.GREEN + "{group} " + ChatColor.YELLOW + "{permission} " + ChatColor.GREEN + "{value}");
    }
    public void delPerm(Player p){
        p.sendMessage(ChatColor.GREEN + "/delperm " + ChatColor.YELLOW + "{server} " + ChatColor.GREEN + "{group} " + ChatColor.YELLOW + "{permission}");
    }
}
