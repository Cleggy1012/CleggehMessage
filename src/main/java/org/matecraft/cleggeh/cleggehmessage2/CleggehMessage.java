package org.matecraft.cleggeh.cleggehmessage2;

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
    String addnoperms = settings.getData().getString("AddNoPerms");
    String ColorNoPerms = settings.getData().getString("ColorNoPerms");
    AddCommand addcmd = new AddCommand(this);
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
            case "cm":
                if (args.length >= 2) {
                    if (args[0].equalsIgnoreCase("set")) {
                        if (p.hasPermission("cleggehmessage.set")) {
                            String type = args[1];
                            String message = makeMessage(args);
                            commands.setMessage(type, message);
                            p.sendMessage(ChatColor.GREEN + type + " message set to: " + ChatColor.WHITE + message);
                            return true;
                        } else {
                            p.sendMessage(ChatColor.RED + setnoperms);
                            return true;
                        }
                    } else {
                        p.sendMessage(ChatColor.RED + setnoperms);
                    }
                    if (args[0].equalsIgnoreCase("add")) {
                        if (p.hasPermission("cleggehmessage.add")) {
                            String cmdadd = args[1];
                            addcmd.addcmd(cmdadd);
                            return true;
                        } else {
                            p.sendMessage(ChatColor.RED + addnoperms);
                            return true;
                        }
                    } else {
                        p.sendMessage(ChatColor.RED + addnoperms);
                    }
                }
                if (args[0].equalsIgnoreCase("help")) {
                    help.sethelp(p);
                    return true;
                } else {
                    help.sethelp(p);
                }
                break;
            case "color":
                if (args.length >= 1) {
                    if (p.hasPermission("cleggehmessage.color")) {
                        try {
                            String ColorName = args[0];
                            String code = args[0];
                            ChatColor color = ChatColor.valueOf(ColorName.toUpperCase());
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

                    }
                    if (args[0].equalsIgnoreCase("list")) {
                        help.allcolor(p);
                    }
                    if (args[0].equalsIgnoreCase("all")) {
                        help.allcolor(p);
                    }
                    
                    else {
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', ColorNoPerms));
                    }

                } else {
                    help.colorhelp(p);
                }
            case "format":
                if (args.length >= 1) {
                    if (p.hasPermission("cleggehmessage.color")) {

                    }
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
