package tk.meowmc.slippery.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import tk.meowmc.slippery.Slippery;

import static me.shedaniel.autoconfig.AutoConfig.getConfigHolder;

@Config(name = Slippery.MODID)
public class SlipperyConfig implements ConfigData {
    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Sliding")
    @ConfigEntry.Gui.Tooltip
    public float slideValue = 0f;

    public static void register() {
        AutoConfig.register(SlipperyConfig.class, GsonConfigSerializer::new);
    }

    public static SlipperyConfig get() {
        return getConfigHolder(SlipperyConfig.class).getConfig();
    }

    public static void save() {
        getConfigHolder(SlipperyConfig.class).save();
    }
}
