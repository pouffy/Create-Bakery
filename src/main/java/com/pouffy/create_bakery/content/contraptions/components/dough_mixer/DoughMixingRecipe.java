package com.pouffy.create_bakery.content.contraptions.components.dough_mixer;

import com.pouffy.create_bakery.registry.AllRecipeTypes;
import com.simibubi.create.AllTags;
import com.simibubi.create.content.contraptions.processing.BasinRecipe;
import com.simibubi.create.content.contraptions.processing.ProcessingRecipeBuilder;

public class DoughMixingRecipe extends BasinRecipe {
    public DoughMixingRecipe(ProcessingRecipeBuilder.ProcessingRecipeParams params) {
        super(AllRecipeTypes.DOUGH_MIXING, params);
    }
}
