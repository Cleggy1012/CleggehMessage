package org.matecraft.cleggeh.cleggehmessage2;

public class AddCommand {

    private final CleggehMessage plugin;
    public AddCommand(CleggehMessage plugin) {
        this.plugin = plugin;
    }

    void addcmd(String cmdadd) {
        plugin.getConfig().createSection(cmdadd + "message");
        plugin.getConfig().set(cmdadd + "message", "This is the Default Message");
    }
}
