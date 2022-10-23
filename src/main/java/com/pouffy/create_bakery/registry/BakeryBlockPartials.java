package com.pouffy.create_bakery.registry;

import com.jozufozu.flywheel.core.PartialModel;
import com.pouffy.create_bakery.CreateBakery;

public class BakeryBlockPartials {
    public static final PartialModel
            DOUGH_MIXER_HEAD = block("dough_mixer/head");

    private static PartialModel block(String path) {
        return new PartialModel(CreateBakery.genRL("block/" + path));
    }

    public static void register() {
    }

}
