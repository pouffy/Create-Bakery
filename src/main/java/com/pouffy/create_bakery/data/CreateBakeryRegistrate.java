package com.pouffy.create_bakery.data;

import com.pouffy.create_bakery.CreateBakery;
import com.simibubi.create.repack.registrate.AbstractRegistrate;
import com.simibubi.create.repack.registrate.Registrate;
import com.simibubi.create.repack.registrate.builders.FluidBuilder;
import com.simibubi.create.repack.registrate.util.nullness.NonNullSupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.function.BiFunction;

import static com.pouffy.create_bakery.CreateBakery.MODID;

public class CreateBakeryRegistrate extends AbstractRegistrate<CreateBakeryRegistrate> {

    protected CreateBakeryRegistrate(String modid) {
        super(modid);
    }
    public static final Registrate REGISTRATE = Registrate.create(MODID).creativeModeTab(() -> CreateBakery.BASE_CREATIVE_TAB);
    public static NonNullSupplier<CreateBakeryRegistrate> lazy(String modid) {
        return NonNullSupplier
                .lazy(() -> new CreateBakeryRegistrate(MODID).registerEventListeners(FMLJavaModLoadingContext.get()
                        .getModEventBus()));
    }
}
