
package org.matecraft.cleggeh.cleggehmessage2;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CleggehMessage extends JavaPlugin {
    SettingsManager settings = new SettingsManager(this);
    
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
        SetCommands commands = new SetCommands(this);
        InfoCommands info = new InfoCommands(this);
        String setnoperms = (settings.getData().getString("SetNoPerms"));
        String ColorNoPerms = (settings.getData().getString("ColorNoPerms"));
        
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
                        }
                        else {
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', setnoperms));
                        }
                    }
                        else {
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', setnoperms));
                    } 
                }
                else {
                    p.sendMessage(ChatColor.RED  + "Usage: /cm set <Command>");
                    return false;
                }
                break;
            default:
                p.sendMessage(ChatColor.RED + "Sorry, you cant do that.");
                break;
            case "color":
                if (args.length >= 1) {
                    if (p.hasPermission("cleggehmessage.color")) {
                        String ColorName = args[0];
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getData().getString(ColorName + "code")));
                    }
                    else {
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', ColorNoPerms));
                    }
                }
                else {
                    p.sendMessage(ChatColor.RED + "Usage: /color <Color>");
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
    private void color(String ColorName) {
        settings.getData().getString(ColorName + "code");
    }

}
