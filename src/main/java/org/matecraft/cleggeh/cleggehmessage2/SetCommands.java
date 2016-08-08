package org.matecraft.cleggeh.cleggehmessage2;

public class SetCommands {

    private final CleggehMessage plugin;

    public SetCommands(CleggehMessage plugin) {
        this.plugin = plugin;
    }

    void setMessage(String type, String message) {
        plugin.getConfig().set(type + "message", message);
        plugin.saveConfig();
    }
}
