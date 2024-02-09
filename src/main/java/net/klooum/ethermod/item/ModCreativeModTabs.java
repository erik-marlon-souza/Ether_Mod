package net.klooum.ethermod.item;

import net.klooum.ethermod.EtherMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

//esse arquivo serve para adicionar items no criativo em menus do criativo que eu criar
//esse arquivo tambem serve para eu criar novos menus para o criativo

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EtherMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ETHER_TAB = CREATIVE_MODE_TABS.register("ether_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHAOS.get()))
                    .title(Component.translatable("creativetab.ether_tab"))
                    .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(ModItems.ETHER.get());
                            pOutput.accept(ModItems.CHAOS.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
