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
                    switch (args[0].toLowerCase()) {
                        case "enchanted":
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set Enchanted:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set survivalworld:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set survivalworld_nether:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set survivalworld_the_end:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set ResourceWorld:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set EnderDoors:" + args[2] + " " + args[3]);
                            break;
                        case "cast-away":
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set skyblock:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set skyblock_nether:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set skyblock_the_end:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set ASkyBlock:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set ASkyBlock_nether:" + args[2] + " " + args[3]);
                            break;
                        case "inspire":
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set spawn:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set Builderexamples:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set Terrain-Plots:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set TerrainFree:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set WorldShapers:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set freebuild:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set plotworld:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set plotworldlarge:" + args[2] + " " + args[3]);
                            break;
                        case "bombermate":
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set Bomber2:" + args[2] + " " + args[3]);
                            break;
                        case "continuity":
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set world:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set world_nether:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set world_the_end:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set Flat:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set jres:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set njres:" + args[2] + " " + args[3]);
                            break;
                        case "prison":
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set Prison2:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set Freeworld:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set Hub:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set Plots:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set Quest:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set Quest1:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set Quests:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set Plot:" + args[2] + " " + args[3]);
                            break;
                        case "aasgard":
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set aasgard" + args[2] + " " + args[3]);
                            break;
                        case "nexus":
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set world:" + args[2] + " " + args[3]);
                            Bukkit.getServer().dispatchCommand(p, "zperms group " + args[1] + " set world_nether:" + args[2] + " " + args[3]);
                            break;
                        default:
                            p.sendMessage(ChatColor.RED + "Invalid Server " + args[0]);
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
