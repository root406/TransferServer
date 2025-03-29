package radjaguar2005.transferserver;

import net.md_5.bungee.api.plugin.Plugin;
import radjaguar2005.transferserver.commands.CityBuild;
import radjaguar2005.transferserver.commands.Farmwelt;
import radjaguar2005.transferserver.commands.Nether;

public final class Transferserver extends Plugin {

    private static Transferserver instance;

    @Override
    public void onEnable() {
        getProxy().getLogger().info("Das TransferServer Plugin wurde geladen");
        getProxy().getPluginManager().registerCommand(this, new Farmwelt("fw"));
        getProxy().getPluginManager().registerCommand(this, new CityBuild("cb"));
        getProxy().getPluginManager().registerCommand(this, new Nether("nether"));
    }

    @Override
    public void onDisable() {
        getProxy().getLogger().info("Das TransferServer Plugin wurde entladen.");
    }

    public static Transferserver getInstance() {return instance;};
}
