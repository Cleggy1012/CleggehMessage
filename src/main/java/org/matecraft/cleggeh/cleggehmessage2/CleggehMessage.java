package org.matecraft.cleggeh.cleggehmessage2;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CleggehMessage extends JavaPlugin {

    SettingsManager settings = new SettingsManager(this);
    SetCommands commands = new SetCommands(this);
    InfoCommands info = new InfoCommands(this);
    String setnoperms = settings.getData().getString("SetNoPerms");
    String ColorNoPerms = settings.getData().getString("ColorNoPerms");
    Help help = new Help(this);

    @Override
    public void onEnable() {
        settings.setup(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Commands only for players in version 2.0!");
            return true;
        }

        Player p = (Player) sender;

        String cmdName = (cmd.getName().toLowerCase());

        switch (cmdName) {
            case "addperm":
                if (args.length <= 0) {
                    help.addPerm(p);
                } else {
                    String val = "true";
                    if(args[4] != null){
                         val = args[4];
                    }
                    switch (args[1].toLowerCase()) {
                        case "enchanted":
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set Enchanted:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set survivalworld:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set survivalworld_nether:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set survivalworld_the_end:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set ResourceWorld:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set EnderDoors:" + args[3] + " " + val);
                            break;
                        case "cast-away":
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set skyblock:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set skyblock_nether:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set skyblock_the_end:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set ASkyBlock:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set ASkyBlock_nether:" + args[3] + " " + val);
                            break;
                        case "inspire":
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set spawn:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set Builderexamples:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set Terrain-Plots:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set TerrainFree:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set WorldShapers:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set freebuild:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set plotworld:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set plotworldlarge:" + args[3] + " " + val);
                            break;
                        case "bombermate":
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set Bomber2:" + args[3] + " " + val);
                            break;
                        case "continuity":
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set world:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set world_nether:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set world_the_end:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set Flat:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set jres:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set njres:" + args[3] + " " + val);
                            break;
                        case "prison":
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set Prison2:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set Freeworld:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set Hub:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set Plots:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set Quest:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set Quest1:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set Quests:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set Plot:" + args[3] + " " + val);
                            break;
                        case "aasgard":
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set aasgard" + args[3] + " " + val);
                            break;
                        case "nexus":
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set world:" + args[3] + " " + val);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "zperms group " + args[2] + "set world_nether:" + args[3] + " " + val);
                            break;
                        default:
                            break;
                    }
                }

                break;
            case "staff":
                info.staff(p);
                break;
            case "member":
                info.member(p);
                break;
            case "builder":
                info.builder(p);
                break;
            case "navigation":
                info.navigation(p);
                break;
            case "gladiator":
                info.gladiator(p);
                break;
            case "teamspeak":
                info.teamspeak(p);
                break;
            case "claiming":
                info.claiming(p);
                break;
            case "cm":
                if (args.length <= 0) {
                    help.sethelp(p);
                }
                if (args.length >= 1) {
                    if (args[0].equalsIgnoreCase("set")) {
                        if (p.hasPermission("cleggehmessage.admin")) {
                            String type = args[1];
                            String message = makeMessage(args);
                            commands.setMessage(type, message);
                            p.sendMessage(ChatColor.GREEN + type + " message set to: " + ChatColor.WHITE + message);
                            return true;
                        }
                    }
                    if (args[0].equalsIgnoreCase("reload")) {
                        if (p.hasPermission("cleggehmessage.admin")) {
                            reloadConfig();
                            settings.reloadData();
                            p.sendMessage(ChatColor.GREEN + "Configs reloaded");
                        }
                    }
                    if (args[0].equalsIgnoreCase("save")) {
                        if (p.hasPermission("cleggehmessage.admin")) {
                            saveConfig();
                            settings.saveData();
                            p.sendMessage(ChatColor.GREEN + "Configs saved");
                        }

                    } else {
                        p.sendMessage(ChatColor.RED + setnoperms);
                    }
                }
                break;
            case "color":
                if (args.length >= 1) {
                    if (p.hasPermission("cleggehmessage.color")) {
                        try {
                            String ColorName = args[0].toUpperCase();
                            String code = settings.getData().getString(ColorName);
                            ChatColor color = ChatColor.valueOf(ColorName);
                            switch (color) {
                                case WHITE:
                                    p.sendMessage("Whatcha need that for bud, it's &r or &f");
                                    break;
                                default:
                                    p.sendMessage(color + code);
                            }
                        } catch (IllegalArgumentException e) {
                            help.colorhelp(p);
                        }
                        return true;
                    } else {
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', ColorNoPerms));
                        return false;
                    }

                } else {
                    help.allcolor(p);
                    return false;
                }
        }

        return true;
    }

    private String makeMessage(String[] args) {
        StringBuilder message = new StringBuilder();
        for (int i = 2; i < args.length; ++i) {
            String appended = args[i] + " ";
            message.append(appended);
        }
        return message.toString();
    }

}
