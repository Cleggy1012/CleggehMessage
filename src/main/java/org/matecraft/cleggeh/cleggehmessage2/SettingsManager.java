package org.matecraft.cleggeh.cleggehmessage2;

import com.google.common.io.ByteStreams;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
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

    private boolean copyDefault(String source, String dest) {
        File destFile = new File(plugin.getDataFolder(), dest);
        if (!destFile.exists()) {
            try {
                destFile.getParentFile().mkdirs();
                InputStream in = getClass().getClassLoader().getResourceAsStream(source);
                if (in != null) {
                    try {
                        try (OutputStream out = new FileOutputStream(destFile)) {
                            ByteStreams.copy(in, out);
                        }
                    } finally {
                        in.close();
                    }
                    return true;
                }
            } catch (IOException e) {
                plugin.getLogger().log(Level.WARNING, "Error copying default " + dest, e);
            }
        }

        return false;
    }

    public void setup(Plugin p) {
        copyDefault("config.yml", "config.yml");
        copyDefault("data.yml", "data.yml");
    }

    public FileConfiguration getData() {
        return data;
    }

    public void saveData() {
        try {
            data.save(dfile);
        } catch (IOException e) {
            plugin.getLogger().severe(ChatColor.RED + "Could not save data.yml");
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
        } catch (IOException e) {
            plugin.getLogger().severe(ChatColor.RED + "Could not save config.yml");
        }
    }

    public void reloadConfig() {
        config = YamlConfiguration.loadConfiguration(cfile);
    }
}
