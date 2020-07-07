package kim.mical.micallib;

import kim.mical.micallib.utils.I18n;
import org.bukkit.plugin.java.JavaPlugin;

public final class MicalLib extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        I18n.log("&7[&3Mical&bLib&7] &aINFO &7| &fPlugin Loaded, Author &3Mical&f, Version &3" + getDescription().getVersion());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        I18n.log("&7[&3Mical&bLib&7] &aINFO &7| &fPlugin Disabled.");
    }
}
