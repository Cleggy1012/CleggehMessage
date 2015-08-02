
package org.matecraft.cleggeh.cleggehmessage2;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CleggehMessage extends JavaPlugin {
    
    @Override
    public boolean  onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("staff")) {
                InfoCommands.staff();
        }
            else if (cmd.getName().equalsIgnoreCase("member")) {
                InfoCommands.member();
            }
            else if (cmd.getName().equalsIgnoreCase("cm")) {
                if (args[0].equalsIgnoreCase("set")) {
                    if (args[1].equalsIgnoreCase("staff")) {
                       SetCommands.setstaff(p.getName());
                    }
                    else if (args[1].equalsIgnoreCase("member")) {
                        SetCommands.setmember(p.getName());
                    }
                    else {
                        String commands = getConfig().getString("commands");
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', commands));
                    }
                }
                else {
                    p.sendMessage(ChatColor.RED  + "Use of command /cm set <Command>");
                }
                    

            }
        return true;
    }
    
}
