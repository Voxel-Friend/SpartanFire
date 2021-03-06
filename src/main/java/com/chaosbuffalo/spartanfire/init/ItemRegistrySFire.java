package com.chaosbuffalo.spartanfire.init;

import com.chaosbuffalo.spartanfire.IAFMatConverter;
import com.chaosbuffalo.spartanfire.SpartanFire;
import com.chaosbuffalo.spartanfire.utils;
import com.github.alexthe666.iceandfire.core.ModItems;
import com.oblivioussp.spartanweaponry.api.DamageHelper;
import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import com.oblivioussp.spartanweaponry.client.gui.CreativeTabsSW;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jacob on 7/20/2018.
 */@Mod.EventBusSubscriber
public class ItemRegistrySFire {
    public static final Set<IAFMatConverter> MATERIALS_TO_REGISTER = new HashSet<>();

    public static final String DRAGONBONE = "dragonbone";
    static {
        MATERIALS_TO_REGISTER.add(new IAFMatConverter(DRAGONBONE,
                utils.spartanMatFromToolMat(DRAGONBONE, ModItems.boneTools,
                9867904, 14999238)));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> ev) {
        // Don't know why this was left out from ice and fire
        OreDictionary.registerOre("ingotDragonbone", ModItems.dragonbone);
        Set<Item> item_set = new HashSet<>();
        for (IAFMatConverter mat : MATERIALS_TO_REGISTER){
            Item katana = SpartanWeaponryAPI.createKatana(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.KATANA,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
                    );
            ModelRenderRegistrySFire.addItemToRegistry(katana, "katana_" + mat.material.getUnlocName());
            item_set.add(katana);
            Item greatsword = SpartanWeaponryAPI.createGreatsword(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.GREATSWORD,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(greatsword, "greatsword_" + mat.material.getUnlocName());
            item_set.add(greatsword);
            Item longsword = SpartanWeaponryAPI.createLongsword(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.LONGSWORD,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(longsword, "longsword_" + mat.material.getUnlocName());
            item_set.add(longsword);
            Item saber = SpartanWeaponryAPI.createSaber(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.SABER,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(saber, "saber_" + mat.material.getUnlocName());
            item_set.add(saber);
            Item rapier = SpartanWeaponryAPI.createRapier(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.RAPIER,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(rapier, "rapier_" + mat.material.getUnlocName());
            item_set.add(rapier);
            Item dagger = SpartanWeaponryAPI.createDagger(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.DAGGER,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(dagger,"dagger_" + mat.material.getUnlocName());
            item_set.add(dagger);
            Item spear = SpartanWeaponryAPI.createSpear(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.SPEAR,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(spear,"spear_" + mat.material.getUnlocName());
            item_set.add(spear);
            Item pike = SpartanWeaponryAPI.createPike(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.PIKE,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(pike, "pike_" + mat.material.getUnlocName());
            item_set.add(pike);
            Item lance = SpartanWeaponryAPI.createLance(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.LANCE,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(lance, "lance_" + mat.material.getUnlocName());
            item_set.add(lance);
            Item halberd = SpartanWeaponryAPI.createHalberd(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.HALBERD,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(halberd, "halberd_" + mat.material.getUnlocName());
            item_set.add(halberd);
            Item warhammer = SpartanWeaponryAPI.createWarhammer(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.WARHAMMER,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(warhammer, "warhammer_" + mat.material.getUnlocName());
            item_set.add(warhammer);
            Item hammer = SpartanWeaponryAPI.createHammer(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.HAMMER,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(hammer,"hammer_" + mat.material.getUnlocName());
            item_set.add(hammer);
            Item throwing_axe = SpartanWeaponryAPI.createThrowingAxe(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.THROWING_AXE,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(throwing_axe,
                    "throwing_axe_" + mat.material.getUnlocName());
            item_set.add(throwing_axe);
            Item throwing_knife = SpartanWeaponryAPI.createThrowingKnife(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.THROWING_KNIFE,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(throwing_knife,
                    "throwing_knife_" + mat.material.getUnlocName());
            item_set.add(throwing_knife);
            Item longbow = SpartanWeaponryAPI.createLongbow(
                    mat.material,
                    SpartanFire.MODID,
                    CreativeTabsSW.TAB_SW,
                    null
            );

            ModelRenderRegistrySFire.addItemToRegistry(longbow, "longbow_" + mat.material.getUnlocName());
            item_set.add(longbow);
            Item crossbow = SpartanWeaponryAPI.createCrossbow(
                    mat.material,
                    SpartanFire.MODID,
                    CreativeTabsSW.TAB_SW,
                    null
            );

            ModelRenderRegistrySFire.addItemToRegistry(crossbow,"crossbow_" + mat.material.getUnlocName());
            item_set.add(crossbow);
            Item javelin = SpartanWeaponryAPI.createJavelin(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.JAVELIN,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(javelin,"javelin_" + mat.material.getUnlocName());
            item_set.add(javelin);
            Item battleaxe = SpartanWeaponryAPI.createBattleaxe(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.BATTLEAXE,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(battleaxe, "battleaxe_" + mat.material.getUnlocName());
            item_set.add(battleaxe);
            Item mace = SpartanWeaponryAPI.createMace(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.MACE,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(mace, "mace_" + mat.material.getUnlocName());
            item_set.add(mace);
            Item boomerang = SpartanWeaponryAPI.createBoomerang(
                    mat.material,
                    SpartanFire.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.BOOMERANG,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistrySFire.addItemToRegistry(boomerang,
                    "boomerang_" + mat.material.getUnlocName());
            item_set.add(boomerang);

        }
        for (Item it : item_set){
            it.setCreativeTab(CreativeTabsSW.TAB_SW);
            ev.getRegistry().register(it);
        }
    }
}
