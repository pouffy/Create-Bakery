package com.pouffy.create_bakery.content.contraptions.components.dough_mixer;

import com.jozufozu.flywheel.api.Instancer;
import com.jozufozu.flywheel.api.MaterialManager;
import com.jozufozu.flywheel.api.instance.DynamicInstance;
import com.jozufozu.flywheel.core.materials.FlatLit;
import com.jozufozu.flywheel.core.materials.oriented.OrientedData;
import com.pouffy.create_bakery.registry.BakeryBlockPartials;
import com.simibubi.create.AllBlockPartials;
import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.content.contraptions.base.flwdata.RotatingData;
import com.simibubi.create.content.contraptions.components.mixer.MechanicalMixerTileEntity;
import com.simibubi.create.content.contraptions.relays.encased.EncasedCogInstance;
import com.simibubi.create.foundation.render.AllMaterialSpecs;
import com.simibubi.create.foundation.utility.AnimationTickHolder;
import net.minecraft.core.Direction;

//public class DoughMixerInstance extends EncasedCogInstance implements DynamicInstance {
//    private final RotatingData doughMixerHead;
//    private final OrientedData mixerPole;
//    private final DoughMixerTileEntity doughMixer;
//
//    public DoughMixerInstance(MaterialManager dispatcher, DoughMixerTileEntity tile) {
//        super(dispatcher, tile, false);
//        this.doughMixer = tile;
//        this.doughMixerHead = (RotatingData)this.getRotatingMaterial().getModel(BakeryBlockPartials.DOUGH_MIXER_HEAD, this.blockState).createInstance();
//        this.doughMixerHead.setRotationAxis(Direction.Axis.Y);
//        this.mixerPole = (OrientedData)this.getOrientedMaterial().getModel(AllBlockPartials.MECHANICAL_MIXER_POLE, this.blockState).createInstance();
//        float renderedHeadOffset = this.getRenderedHeadOffset();
//        this.transformPole(renderedHeadOffset);
//        this.transformHead(renderedHeadOffset);
//    }
//
//
//    protected Instancer<RotatingData> getCogModel() {
//        return this.materialManager.defaultSolid().material(AllMaterialSpecs.ROTATING).getModel(AllBlockPartials.SHAFTLESS_COGWHEEL, ((KineticTileEntity)this.blockEntity).getBlockState());
//    }
//
//    public void beginFrame() {
//        float renderedHeadOffset = this.getRenderedHeadOffset();
//        this.transformPole(renderedHeadOffset);
//        this.transformHead(renderedHeadOffset);
//    }
//
//    private void transformHead(float renderedHeadOffset) {
//        float speed = this.doughMixer.getRenderedHeadRotationSpeed(AnimationTickHolder.getPartialTicks());
//        this.doughMixerHead.setPosition(this.getInstancePosition()).nudge(0.0F, -renderedHeadOffset, 0.0F).setRotationalSpeed(speed * 2.0F);
//    }
//
//    private void transformPole(float renderedHeadOffset) {
//        this.mixerPole.setPosition(this.getInstancePosition()).nudge(0.0F, -renderedHeadOffset, 0.0F);
//    }
//
//    private float getRenderedHeadOffset() {
//        return this.doughMixer.getRenderedHeadOffset(AnimationTickHolder.getPartialTicks());
//    }
//
//    public void updateLight() {
//        super.updateLight();
//        this.relight(this.pos.below(), this.doughMixerHead);
//        this.relight(this.pos, this.mixerPole);
//    }
//
//    public void remove() {
//        super.remove();
//        this.doughMixerHead.delete();
//        this.mixerPole.delete();
//    }
//}
