package radjaguar2005.transferserver.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import radjaguar2005.transferserver.Transferserver;
import net.md_5.bungee.api.ProxyServer;

public class Farmwelt extends Command {

    public Farmwelt(String name) {
        super("fw", "", "farmwelt");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        ProxiedPlayer proxiedPlayer = (ProxiedPlayer) sender;
        if (proxiedPlayer.getServer() == null || !proxiedPlayer.getServer().getInfo().getName().equals("Farmwelt-1")) {
            sender.sendMessage("§aDu wurdest erfolgreich in die Farmwelt gesendet!");
            ServerInfo serverInfo = ProxyServer.getInstance().getServerInfo("Farmwelt-1");
            proxiedPlayer.connect(serverInfo);
        } else {
            sender.sendMessage("§cDu bist bereits in der Farmwelt");
        }
    }
}
