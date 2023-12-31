package com.addis.testmod.item;

import com.addis.testmod.TestMod;
import com.addis.testmod.block.ModBlocks;
import com.addis.testmod.item.custom.EightBallItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB).stacksTo(63)));
    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball", () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BLUEBERRY_SEED = ITEMS.register("blueberry_seeds", () -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_CROP.get() ,
            new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)
            .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
