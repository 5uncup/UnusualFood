package net.uebishe.govnishe.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponent {
    public static final FoodComponent ASSOFANT = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 200), 0.25f).build();
    public static final FoodComponent ASSOFSQUID = new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 200), 0.25f).build();
}
