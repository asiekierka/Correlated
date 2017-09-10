package com.elytradev.correlated.proxy;

import com.elytradev.correlated.CorrelatedPluralRulesLoader;
import com.elytradev.correlated.entity.EntityAutomaton;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.text.PluralRules.PluralType;
import com.ibm.icu.util.ULocale;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.translation.I18n;

public class Proxy {
	public void preInit() {

	}
	
	public void postInit() {

	}

	public void weldthrowerTick(EntityPlayer player) {
		
	}

	public void weldthrowerHeal(EntityAutomaton ent) {
		
	}

	public void smokeTick(EntityAutomaton entityAutomaton) {
		
	}

	public int getColor(String group, int index) {
		return 0;
	}

	public void showAPNChangeMenu(BlockPos pos, boolean multiple, boolean client) {
		
	}

	public void clearShapes() {
		
	}
	
	public String i18nFormat(String key, Object[] format) {
		return I18n.translateToLocalFormatted(key, format);
	}

	public boolean i18nContains(String key) {
		return I18n.canTranslate(key);
	}

	public PluralRules getPluralRules() {
		return CorrelatedPluralRulesLoader.loader.forLocale(ULocale.ENGLISH, PluralType.CARDINAL);
	}
}
