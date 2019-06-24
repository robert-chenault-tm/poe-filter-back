package chenaurj.poefilterback.poefilterback.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.stereotype.Service;

import chenaurj.poefilterback.poefilterback.model.Armor;
import chenaurj.poefilterback.poefilterback.model.Common;
import chenaurj.poefilterback.poefilterback.model.Currency;
import chenaurj.poefilterback.poefilterback.model.Essence;
import chenaurj.poefilterback.poefilterback.model.Fossil;
import chenaurj.poefilterback.poefilterback.model.Gem;
import chenaurj.poefilterback.poefilterback.model.Jewelry;
import chenaurj.poefilterback.poefilterback.model.Map;
import chenaurj.poefilterback.poefilterback.model.PoeFilter;
import chenaurj.poefilterback.poefilterback.model.Quest;
import chenaurj.poefilterback.poefilterback.model.Weapon;

@Service
public class FilterService {

    public byte[] generateFilter(PoeFilter filterData) throws IOException {
        File out = new File("custom.filter");
        out.createNewFile();
        FileWriter writer = new FileWriter(out);
        Common common;

        for(Armor armor : filterData.getArmorList()) {
            common = armor.getCommon();
            writer.write((common.getHide() ? "Hide" : "Show") + " #" + common.getDescription() + "\n");
            if(armor.getShaper() != "Either") {
                writer.write("\t" + "ShaperItem " + armor.getShaper() + "\n");
            }
            if(armor.getElder() != "Either") {
                writer.write("\t" + "ElderItem " + armor.getElder() + "\n");
            }
            if(armor.getFractured() != "Either") {
                writer.write("\t" + "FracturedItem " + armor.getFractured() + "\n");
            }
            if(armor.getSynthesized() != "Either") {
                writer.write("\t" + "SynthesisedItem " + armor.getSynthesized() + "\n");
            }
            if(armor.getCorrupted() != "Either") {
                writer.write("\t" + "Corrupted " + armor.getCorrupted() + "\n");
            }
            if(armor.getIdentified() != "Either") {
                writer.write("\t" + "Identified " + armor.getIdentified() + "\n");
            }
            if(armor.getColors() != "") {
                writer.write("\t" + "SocketGroup " + armor.getColors() + "\n");
            }
            if(armor.getIlvl() != "") {
                writer.write("\t" + "ItemLevel " + armor.getIlvl() + "\n");
            }
            if(armor.getRarity() != "") {
                writer.write("\t" + "Rarity " + armor.getRarity() + "\n");
            }
            if(armor.getHeight() != "") {
                writer.write("\t" + "Height " + armor.getHeight() + "\n");
            }
            if(armor.getWidth() != "") {
                writer.write("\t" + "Width " + armor.getWidth() + "\n");
            }
            if(armor.getItemType() != "") {
                writer.write("\t" + "Class " + armor.getItemType() + "\n");
            }
            if(common.getBackground() != "") {
                writer.write("\t" + "SetBackgroundColor " + common.getBackground() + "\n");
            }
            if(common.getBorder() != "") {
                writer.write("\t" + "SetBorderColor " + common.getBorder() + "\n");
            }
            if(common.getFont() != "") {
                writer.write("\t" + "SetTextColor " + common.getFont() + "\n");
            }
            writer.write("\n");
        }

        for(Currency currency : filterData.getCurrencyList()) {
            common = currency.getCommon();
            writer.write((common.getHide() ? "Hide" : "Show") + " #" + common.getDescription() + "\n");
            if(currency.getBaseType() != "") {
                writer.write("\t" + "BaseType " + currency.getBaseType() + "\n");
            }
            if(common.getBackground() != "") {
                writer.write("\t" + "SetBackgroundColor " + common.getBackground() + "\n");
            }
            if(common.getBorder() != "") {
                writer.write("\t" + "SetBorderColor " + common.getBorder() + "\n");
            }
            if(common.getFont() != "") {
                writer.write("\t" + "SetTextColor " + common.getFont() + "\n");
            }
            writer.write("\n");
        }

        for(Essence essence : filterData.getEssenceList()) {
            common = essence.getCommon();
            writer.write((common.getHide() ? "Hide" : "Show") + " #" + common.getDescription() + "\n");
            if(essence.getBaseType() != "") {
                writer.write("\t" + "BaseType " + essence.getBaseType() + "\n");
            }
            if(common.getBackground() != "") {
                writer.write("\t" + "SetBackgroundColor " + common.getBackground() + "\n");
            }
            if(common.getBorder() != "") {
                writer.write("\t" + "SetBorderColor " + common.getBorder() + "\n");
            }
            if(common.getFont() != "") {
                writer.write("\t" + "SetTextColor " + common.getFont() + "\n");
            }
            writer.write("\n");
        }

        for(Fossil fossil : filterData.getFossilList()) {
            common = fossil.getCommon();
            writer.write((common.getHide() ? "Hide" : "Show") + " #" + common.getDescription() + "\n");
            if(fossil.getBaseType() != "") {
                writer.write("\t" + "BaseType " + fossil.getBaseType() + "\n");
            }
            if(common.getBackground() != "") {
                writer.write("\t" + "SetBackgroundColor " + common.getBackground() + "\n");
            }
            if(common.getBorder() != "") {
                writer.write("\t" + "SetBorderColor " + common.getBorder() + "\n");
            }
            if(common.getFont() != "") {
                writer.write("\t" + "SetTextColor " + common.getFont() + "\n");
            }
            writer.write("\n");
        }

        for(Gem gem : filterData.getGemList()) {
            common = gem.getCommon();
            writer.write((common.getHide() ? "Hide" : "Show") + " #" + common.getDescription() + "\n");
            if(gem.getLevel() != "") {
                writer.write("\t" + "GemLevel " + gem.getLevel() + "\n");
            }
            if(gem.getCorrupted() != "Either") {
                writer.write("\t" + "Corrupted " + gem.getCorrupted() + "\n");
            }
            if(gem.getQuality() != "") {
                writer.write("\t" + "Quality " + gem.getQuality() + "\n");
            }
            if(common.getBackground() != "") {
                writer.write("\t" + "SetBackgroundColor " + common.getBackground() + "\n");
            }
            if(common.getBorder() != "") {
                writer.write("\t" + "SetBorderColor " + common.getBorder() + "\n");
            }
            if(common.getFont() != "") {
                writer.write("\t" + "SetTextColor " + common.getFont() + "\n");
            }
            writer.write("\n");
        }

        for(Jewelry jewelry : filterData.getJewelryList()) {
            common = jewelry.getCommon();
            writer.write((common.getHide() ? "Hide" : "Show") + " #" + common.getDescription() + "\n");
            if(jewelry.getShaper() != "Either") {
                writer.write("\t" + "ShaperItem " + jewelry.getShaper() + "\n");
            }
            if(jewelry.getElder() != "Either") {
                writer.write("\t" + "ElderItem " + jewelry.getElder() + "\n");
            }
            if(jewelry.getFractured() != "Either") {
                writer.write("\t" + "FracturedItem " + jewelry.getFractured() + "\n");
            }
            if(jewelry.getSynthesized() != "Either") {
                writer.write("\t" + "SynthesisedItem " + jewelry.getSynthesized() + "\n");
            }
            if(jewelry.getCorrupted() != "Either") {
                writer.write("\t" + "Corrupted " + jewelry.getCorrupted() + "\n");
            }
            if(jewelry.getIdentified() != "Either") {
                writer.write("\t" + "Identified " + jewelry.getIdentified() + "\n");
            }
            if(jewelry.getIlvl() != "") {
                writer.write("\t" + "ItemLevel " + jewelry.getIlvl() + "\n");
            }
            if(jewelry.getRarity() != "") {
                writer.write("\t" + "Rarity " + jewelry.getRarity() + "\n");
            }
            if(jewelry.getItemType() != "") {
                writer.write("\t" + "Class " + jewelry.getItemType() + "\n");
            }
            if(common.getBackground() != "") {
                writer.write("\t" + "SetBackgroundColor " + common.getBackground() + "\n");
            }
            if(common.getBorder() != "") {
                writer.write("\t" + "SetBorderColor " + common.getBorder() + "\n");
            }
            if(common.getFont() != "") {
                writer.write("\t" + "SetTextColor " + common.getFont() + "\n");
            }
            writer.write("\n");
        }

        for(Map map : filterData.getMapList()) {
            common = map.getCommon();
            writer.write((common.getHide() ? "Hide" : "Show") + " #" + common.getDescription() + "\n");
            if(map.getShaped() != "Either") {
                writer.write("\t" + "ShapedMap " + map.getShaped() + "\n");
            }
            if(map.getCorrupted() != "Either") {
                writer.write("\t" + "Corrupted " + map.getCorrupted() + "\n");
            }
            if(map.getTier() != "") {
                writer.write("\t" + "MapTier " + map.getTier() + "\n");
            }
            if(map.getRarity() != "") {
                writer.write("\t" + "Rarity " + map.getRarity() + "\n");
            }
            if(map.getQuality() != "") {
                writer.write("\t" + "Quality " + map.getQuality() + "\n");
            }
            if(common.getBackground() != "") {
                writer.write("\t" + "SetBackgroundColor " + common.getBackground() + "\n");
            }
            if(common.getBorder() != "") {
                writer.write("\t" + "SetBorderColor " + common.getBorder() + "\n");
            }
            if(common.getFont() != "") {
                writer.write("\t" + "SetTextColor " + common.getFont() + "\n");
            }
            writer.write("\n");
        }

        for(Quest quest : filterData.getQuestList()) {
            common = quest.getCommon();
            writer.write((common.getHide() ? "Hide" : "Show") + " #" + common.getDescription() + "\n");
            if(quest.getBaseType() != "") {
                writer.write("\t" + "BaseType " + quest.getBaseType() + "\n");
            }
            if(common.getBackground() != "") {
                writer.write("\t" + "SetBackgroundColor " + common.getBackground() + "\n");
            }
            if(common.getBorder() != "") {
                writer.write("\t" + "SetBorderColor " + common.getBorder() + "\n");
            }
            if(common.getFont() != "") {
                writer.write("\t" + "SetTextColor " + common.getFont() + "\n");
            }
            writer.write("\n");
        }

        for(Weapon weapon : filterData.getWeaponList()) {
            common = weapon.getCommon();
            writer.write((common.getHide() ? "Hide" : "Show") + " #" + common.getDescription() + "\n");
            if(weapon.getShaper() != "Either") {
                writer.write("\t" + "ShaperItem " + weapon.getShaper() + "\n");
            }
            if(weapon.getElder() != "Either") {
                writer.write("\t" + "ElderItem " + weapon.getElder() + "\n");
            }
            if(weapon.getFractured() != "Either") {
                writer.write("\t" + "FracturedItem " + weapon.getFractured() + "\n");
            }
            if(weapon.getSynthesized() != "Either") {
                writer.write("\t" + "SynthesisedItem " + weapon.getSynthesized() + "\n");
            }
            if(weapon.getCorrupted() != "Either") {
                writer.write("\t" + "Corrupted " + weapon.getCorrupted() + "\n");
            }
            if(weapon.getIdentified() != "Either") {
                writer.write("\t" + "Identified " + weapon.getIdentified() + "\n");
            }
            if(weapon.getColors() != "") {
                writer.write("\t" + "SocketGroup " + weapon.getColors() + "\n");
            }
            if(weapon.getIlvl() != "") {
                writer.write("\t" + "ItemLevel " + weapon.getIlvl() + "\n");
            }
            if(weapon.getRarity() != "") {
                writer.write("\t" + "Rarity " + weapon.getRarity() + "\n");
            }
            if(weapon.getHeight() != "") {
                writer.write("\t" + "Height " + weapon.getHeight() + "\n");
            }
            if(weapon.getWidth() != "") {
                writer.write("\t" + "Width " + weapon.getWidth() + "\n");
            }
            if(weapon.getItemType() != "") {
                writer.write("\t" + "Class " + weapon.getItemType() + "\n");
            }
            if(common.getBackground() != "") {
                writer.write("\t" + "SetBackgroundColor " + common.getBackground() + "\n");
            }
            if(common.getBorder() != "") {
                writer.write("\t" + "SetBorderColor " + common.getBorder() + "\n");
            }
            if(common.getFont() != "") {
                writer.write("\t" + "SetTextColor " + common.getFont() + "\n");
            }
            writer.write("\n");
        }


        writer.flush();
        writer.close();
        return Files.readAllBytes(out.toPath());
    }
    
}