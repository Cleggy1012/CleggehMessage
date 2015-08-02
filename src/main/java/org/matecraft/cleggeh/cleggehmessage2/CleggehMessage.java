
package org.matecraft.cleggeh.cleggehmessage2;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CleggehMessage extends JavaPlugin {
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player p = (Player) sender;
        SetCommands commands = new SetCommands(this);
        
        String cmdName = args[1].toLowerCase();

        switch (cmdName) {
            case "staff":
                InfoCommands.staff();
                break;
            case "member":
                InfoCommands.member();
                break;
            case "cm":
                if (args[0].equalsIgnoreCase("set")) {
                    String type = args[1];
                    String message = makeMessage(args);
                    commands.setMessage(type, message);
                    p.sendMessage(ChatColor.GREEN + type + " message set to: " + ChatColor.WHITE + message);
                }
                else {
                    p.sendMessage(ChatColor.RED  + "Usage: /cm set <Command>");
                    return false;
                }
                break;
            default:
                p.sendMessage(ChatColor.RED + "Sorry, you cant do that.");
                break;
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
