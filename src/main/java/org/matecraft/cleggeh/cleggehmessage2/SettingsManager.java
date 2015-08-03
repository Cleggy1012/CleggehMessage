package org.matecraft.cleggeh.cleggehmessage2;

import java.io.File;
import java.io.IOException;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public class SettingsManager {
        private final CleggehMessage plugin;
        public SettingsManager(CleggehMessage plugin) {
        this.plugin = plugin;
    }
        FileConfiguration config;
        File cfile;
        
        FileConfiguration data;
        File dfile;
        
        
        public void setup(Plugin p) {
            cfile = new File(p.getDataFolder(), "config.yml");
                if (!cfile.exists()) {
                    try {
                        cfile.createNewFile();
                    }
                    catch (IOException e) {
                        Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not create Config.yml");
                    }
                }
            dfile = new File(p.getDataFolder(), "data.yml");
                if (!dfile.exists()) {
                    try {
                        dfile.createNewFile();
                    }
                    catch (IOException e) {
                        Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not create data.yml!");
                    }
                }
                data = YamlConfiguration.loadConfiguration(dfile);
        }
        
        public FileConfiguration getData() {
            return data;
        }
        
        public void saveData(){
            try {
                data.save(dfile);
            }
            catch (IOException  e) {
                Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not save data.yml");
            }
        }
        
        public void reloadData() {
            data = YamlConfiguration.loadConfiguration(dfile);
        }
        
        public FileConfiguration getConfig() {
            return config;
        }
        
        public void saveConfig() {
            try {
                config.save(cfile);
            }
            catch (IOException e) {
                Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not save config.yml");
            }            
        }
        
        public void reloadConfig(){
            config = YamlConfiguration.loadConfiguration(cfile);
        }
}

