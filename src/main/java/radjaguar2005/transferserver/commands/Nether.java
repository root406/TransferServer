package radjaguar2005.transferserver.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Nether extends Command {

    public Nether(String name) {
        super("nether");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        ProxiedPlayer proxiedPlayer = (ProxiedPlayer) sender;
        if (proxiedPlayer.getServer() == null || !proxiedPlayer.getServer().getInfo().getName().equals("Nether-1")) {
            sender.sendMessage("§aDu wurdest erfolgreich in den Nether gesendet!");
            ServerInfo serverInfo = ProxyServer.getInstance().getServerInfo("Nether-1");
            proxiedPlayer.connect(serverInfo);
        } else {
            sender.sendMessage("§cDu bist bereits im Nether");
        }
    }
}
