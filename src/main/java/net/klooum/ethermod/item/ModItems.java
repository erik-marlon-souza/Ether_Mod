package net.klooum.ethermod.item;

//Aqui é onde eu devo adicionar meus items primeiro

import net.klooum.ethermod.EtherMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EtherMod.MOD_ID);

    //Ether essence
    public static final RegistryObject<Item> ETHER = ITEMS.register("ether_essence",
            () -> new Item(new Item.Properties()));

    //Chaos Essence
    public static final RegistryObject<Item> CHAOS = ITEMS.register("chaos_essence",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
