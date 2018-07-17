/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.d;

import java.util.Random;

/**
 *
 * @author Joshua
 */
public class MagicItemTable extends DD {
    int rollNumber;
    String item,weapon,ammo,armor;
    public void MagicItemTable(){
        item = "";
    }   
    public String MagicItemTableA(){
        Spells spells = new Spells();
        rollNumber = roll.d100();
        if(rollNumber<=50){
            item = "Potion of Healing";
        }
        if(rollNumber>50&&rollNumber <=60){
            item = spells.Cantrips();
        }
        if(rollNumber>60&&rollNumber<=70){
            item = "Potion of Climbing";
        }
        if(rollNumber>70&&rollNumber<=90){
            item = spells.FirstLevel();
        }
        if(rollNumber>90&&rollNumber<=94){
            item = spells.SecondLevel();
        }
        if(rollNumber>94&&rollNumber<=98){
            item = "Potion of Greater Healing";
        }
        if(rollNumber==99){
            item = "Bag of Holding";
        }
        if(rollNumber==100){
            item = "Driftglobe";
        }
        return item;
    }
    public String MagicItemTableB(){
        rollNumber=roll.d100();
        int ammoRoll = roll.CustomRoll(4);
        Spells spells = new Spells();
        
        if(rollNumber <=15){
            item = "Potion of Greater Healing";
        }
        if(rollNumber>15&&rollNumber<=22){
            item = "Potion of Fire Breath";
        }
        if(rollNumber>22&&rollNumber<=29){
            item = "Potion of Resistance";
        }
        if(rollNumber>29&&rollNumber<=34){
            switch(ammoRoll){
                case 1:
                    ammo="Arrows(20)";
                    break;
                case 2:
                    ammo="Blowgun needles(50)";
                    break;
                case 3:
                    ammo="Crossbow bolts(20)";
                    break;
                case 4:
                    ammo="Sling bullets(20)";
                    break;
            }
            item = ammo+",+1";
        }
        if(rollNumber>34&&rollNumber<=39){
            item = "Potion of Animal Friendship";
        }
        if(rollNumber>39&&rollNumber<=44){
            item = "Potion of Hill Giant Strength";
        }
        if(rollNumber>44&&rollNumber<=49){
            item = "Potion of Growth";
        }
        if(rollNumber>49&&rollNumber<=54){
            item = "Potion of Water Breathing";
        }
        if(rollNumber>54&&rollNumber<=59){
            item = spells.SecondLevel();
        }
        if(rollNumber>59&&rollNumber<=64){
            item = spells.ThirdLevel();
        }
        if(rollNumber>64&&rollNumber<=67){
            item = "Bag of Holding";
        }
        if(rollNumber>67&&rollNumber<=70){
            item = "Keoghtom's ointment";
        }
        if(rollNumber>70&&rollNumber<=73){
            item = "Oil of Slipperiness";
        }
        if(rollNumber>73&&rollNumber<=75){
            item = "Dust of Disappearance";
        }
        if(rollNumber>75&&rollNumber<=77){
            item = "Dust of Dryness";
        }
        if(rollNumber>77&&rollNumber<=79){
            item = "Dust of Sneezing and Choking";
        }
        if(rollNumber>79&&rollNumber<=81){
            Random rand = new Random();
            int x;
            x=rand.nextInt(4+1);
            item = "Elemental Gem";
            if(x==1){
                item+="(Blue Sapphire/Air elemental)";
            }
            if(x==2){
                item+="(Yellow Diamond/Earth elemental)";
            }
            if(x==3){
                item+="(Red Corundum/Fire elemental)";
            }
            if(x==4){
                item+="(Emerald/Water elemental)";
            }
        }
        if(rollNumber>81&&rollNumber<=83){
            item = "Philter of Love";
        }
        switch(rollNumber){
            case 84:
                item = "Alchemy Jug";
                break;
            case 85:
                item = "Cap of Water Breathing";
                break;
            case 86:
                item = "Cloak of the Manta Ray";
                break;
            case 87:
                item = "Driftglobe";
                break;
            case 88:
                item = "Goggles of Night";
                break;
            case 89:
                item = "helm of Comprehending Languages";
                break;
            case 90:
                item = "Immovable rod";
                break;
            case 91:
                item = "Lantern of Revealing";
                break;
            case 92:
                item = "Mariner's armor";
                break;
            case 93:
                item = "Mithral armor";
                break;
            case 94:
                item = "Potion of Poison";
                break;
            case 95:
                item = "Ring of Swimming";
                break;
            case 96:
                item = "Robe of Useful items";
                break;
            case 97:
                item = "Rope of Climbing";
                break;
            case 98:
                item = "Saddle of the Cavalier";
                break;
            case 99:
                item = "Wand of Magic Detection";
                break;
            case 100:
                item = "Wand of Secrets";
                break;
        }
        return item;
    }
    public String MagicItemTableC(){
        rollNumber = roll.d100();
        int ammoRoll = roll.CustomRoll(4);
        Spells spells = new Spells();
        if(rollNumber<=15){
            item = "Potion of Superior Healing";
        }
        if(rollNumber>15&&rollNumber<=22){
            item = spells.FourthLevel();
        }
        if(rollNumber>22&&rollNumber<=27){
            switch(ammoRoll){
                case 1:
                    ammo="Arrows(20)";
                    break;
                case 2:
                    ammo="Blowgun needles(50)";
                    break;
                case 3:
                    ammo="Crossbow bolts(20)";
                    break;
                case 4:
                    ammo="Sling bullets(20)";
                    break;
            }
            item = ammo+",+2";
        }
        if(rollNumber>27&&rollNumber<=32){
            item = "Potion of Clairvoyance";
        }
        if(rollNumber>32&&rollNumber<=37){
            item = "Potion of Diminution";
        }
        if(rollNumber>37&&rollNumber<=42){
            item = "Potion of Gaseous Form";
        }
        if(rollNumber>42&&rollNumber<=47){
            item = "Potion of Frost Giant Strength";
        }
        if(rollNumber>47&&rollNumber<=52){
            item = "Poton of Stone Giant Strength";
        }
        if(rollNumber>52&&rollNumber<=57){
            item = "Potion of Heroism";
        }
        if(rollNumber>57&&rollNumber<=62){
            item = "Potion of Invulnerablility";
        }
        if(rollNumber>62&&rollNumber<=67){
            item = "Potion of Mind Reading";
        }
        if(rollNumber>67&&rollNumber<=72){
            item = spells.FifthLevel();
        }
        if(rollNumber>72&&rollNumber<=75){
            item = "Elixir of Health";
        }
        if(rollNumber>75&&rollNumber<=78){
            item = "Oil of Etherealness";
        }
        if(rollNumber>78&&rollNumber<=81){
            item = "Potion of Fire Giant Strength";
        }
        if(rollNumber>81&&rollNumber<=84){
            item = "Quaal's Feather Token";
        }
        if(rollNumber>84&&rollNumber<=87){
            item = "Scroll of Protection";
        }
        if(rollNumber>87&&rollNumber<=89){
            item = "Bag of Beans";
        }
        if(rollNumber>89&&rollNumber<=91){
            item = "Bead of Force";
        }
        if(rollNumber==92){
            item = "Chime of Opening";
        }
        if(rollNumber==93){
            item = "Decanter of Endless Water";
        }
        if(rollNumber==94){
            item = "Eyes of Minute Seeing";
        }
        if(rollNumber==95){
            item = "Folding Boat";
        }
        if(rollNumber==96){
            item = "Heward's Handy Haversack";
        }
        if(rollNumber==97){
            item = "Horseshoes of Speel";
        }
        if(rollNumber==98){
            item = "Necklace of Fireballs";
        }
        if(rollNumber==99){
            item = "Periapt of Health";
        }
        if(rollNumber==100){
            item = "Sending Stones";
        }
        
        return item;
    }
    public String MagicItemTableD(){
        rollNumber = roll.d100();
        int ammoRoll = roll.CustomRoll(4);
        Spells spells = new Spells();
        if(rollNumber<=20){
            item = "Potion of Supreme Healing";
        }
        if(rollNumber>20&&rollNumber<=30){
            item = "Potion of Invisibility";
        }
        if(rollNumber>30&&rollNumber<=40){
            item = "Potion of Speed";
        }
        if(rollNumber>40&&rollNumber<=50){
            item = spells.SixthLevel();
        }
        if(rollNumber>50&&rollNumber<=57){
            item = spells.SeventhLevel();
        }
        if(rollNumber>57&&rollNumber<=62){
            switch(ammoRoll){
                case 1:
                    ammo="Arrows(20)";
                    break;
                case 2:
                    ammo="Blowgun needles(50)";
                    break;
                case 3:
                    ammo="Crossbow bolts(20)";
                    break;
                case 4:
                    ammo="Sling bullets(20)";
                    break;
            }
            item = ammo+",+3";
        }
        if(rollNumber>62&&rollNumber<=67){
            item = "Oil of Sharpness";
        }
        if(rollNumber>67&&rollNumber<=72){
            item = "Potion of Flying";
        }
        if(rollNumber>72&&rollNumber<=77){
            item = "Potion of Cloud Giant Strength";
        }
        if(rollNumber>77&&rollNumber<=82){
            item = "Potion of Longevity";
        }
        if(rollNumber>82&&rollNumber<=87){
            item = "Potion of Vitality";
        }
        if(rollNumber>87&&rollNumber<=92){
            item = spells.EigthLevel();
        }
        if(rollNumber>92&&rollNumber<=95){
            item = "Horseshoes of Zephr";
        }
        if(rollNumber>95&&rollNumber<=98){
            item = "Nolzur's Marvelous Pigments";
        }
        if(rollNumber==99){
            item = "Bag of Devouring";
        }
        if(rollNumber==100){
            item = "Portable Hole";
        }
        return item;
    }
    public String MagicItemTableE(){
        rollNumber = roll.d100();
        Spells spells = new Spells();
        if(rollNumber<=30){
            item = spells.EigthLevel();
        }
        if(rollNumber>30&&rollNumber<=55){
            item = "Potion of Storm Giant Strength";
        }
        if(rollNumber>55&&rollNumber<=70){
            item = "Potion of Supreme Healing";
        }
        if(rollNumber>70&&rollNumber<=85){
            item = spells.NinthLevel();
        }
        if(rollNumber>85&&rollNumber<=93){
            item = "Universal Solvent";
        }
        if(rollNumber>93&&rollNumber<=98){
            item = "Arrow of Slaying";
        }
        if(rollNumber>98&&rollNumber<=100){
            item = "Sovereign Glue";
        }
        return item;
    }
    public String MagicItemTableF(){
        rollNumber = roll.d100();
        int weapRoll = roll.CustomRoll(35);
        if(rollNumber<=15){
            switch(weapRoll){
            case 1: 
                weapon="Club";
                break;
            case 2: 
                weapon="Dagger";
                break;
            case 3:
                weapon="Greatclub";
                break;
            case 4:
                weapon="Handaxe";
                break;
            case 5:
                weapon="Javelin";
                break;
            case 6:
                weapon="Light Hammer";
                break;
            case 7:
                weapon="Mace";
                break;
            case 8:
                weapon="Quarterstaff";
                break;
            case 9:
                weapon="Sickle";
                break;
            case 10:
                weapon="Spear";
                break;
            case 11:
                weapon="Light Crossbow";
                break;
            case 12:
                weapon="Shortbow";
                break;
            case 13:
                weapon="Sling";
                break;
            case 14:
                weapon="Battleaxe";
                break;
            case 15:
                weapon="Flail";
                break;
            case 16:
                weapon="Glaive";
                break;
            case 17:
                weapon="Greataxe";
                break;
            case 18:
                weapon="Greatsword";
                break;
            case 19:
                weapon="Halberd";
                break;
            case 20:
                weapon="Lance";
                break;
            case 21:
                weapon="Longsword";
                break;
            case 22:
                weapon="Maul";
                break;
            case 23:
                weapon="Morningstar";
                break;
            case 24:
                weapon="Pike";
                break;
            case 25:
                weapon="Rapier";
                break;
            case 26:
                weapon="Scimitar";
                break;
            case 27:
                weapon="Shortsword";
                break;
            case 28:
                weapon="Trident";
                break;
            case 29:
                weapon="War Pick";
                break;
            case 30:
                weapon="Warhammer";
                break;
            case 31:
                weapon="Whip";
                break;
            case 32:
                weapon="Blowgun";
                break;
            case 33:
                weapon="Hand Crossbow";
                break;
            case 34:
                weapon="Heavy Crossbow";
                break;
            case 35:
                weapon="Longbow";
                break;
        }
            item = weapon+",+1";
        }
        if(rollNumber>15&&rollNumber<=18){
            item = "Shield,+1";
        }
        if(rollNumber>18&&rollNumber<=21){
            item = "Sentinel Shield";
        }
        if(rollNumber>21&&rollNumber<=23){
            item = "Amulet of Proof against Detection and Location";
        }
        if(rollNumber>23&&rollNumber<=25){
            item = "Boots of Elvenkind";
        }
        if(rollNumber>25&&rollNumber<=27){
            item = "Boots of Striding and Springing";
        }
        if(rollNumber>27&&rollNumber<=29){
            item = "Bracers of Archery";
        }
        if(rollNumber>29&&rollNumber<=31){
            item = "Brooch of Shielding";
        }
        if(rollNumber>31&&rollNumber<=33){
            item = "Broom of Flying";
        }
        if(rollNumber>33&&rollNumber<=35){
            item = "Cloak of Elvenkind";
        }
        if(rollNumber>35&&rollNumber<=37){
            item = "Cloak of Protection";
        }
        if(rollNumber>37&&rollNumber<=39){
            item = "Gauntlets of Ogre Power";
        }
        if(rollNumber>39&&rollNumber<=41){
            item = "Hat of Disguise";
        }
        if(rollNumber>41&&rollNumber<=43){
            item = "Javelin of Lightning";
        }
        if(rollNumber>43&&rollNumber<=45){
            item = "Pearl of Power";
        }
        if(rollNumber>45&&rollNumber<=47){
            item = "Rod of Pact Keeper,+1";
        }
        if(rollNumber>47&&rollNumber<=49){
            item = "Slippers of Spider Climbing";
        }
        if(rollNumber>49&&rollNumber<=51){
            item = "Staff of the Adder";
        }
        if(rollNumber>51&&rollNumber<=53){
            item = "Staff of the Python";
        }
        if(rollNumber>53&&rollNumber<=55){
            item = "Sword of Vengeance";
        }
        if(rollNumber>55&&rollNumber<=57){
            item = "Trident of Fish Command";
        }
        if(rollNumber>57&&rollNumber<=59){
            item = "Wand of Magic Missiles";
        }
        if(rollNumber>59&&rollNumber<=61){
            item = "Wand of the War Mage,+1";
        }
        if(rollNumber>61&&rollNumber<=63){
            item = "Wand of Web";
        }
        if(rollNumber>63&&rollNumber<=65){
            item = "Weapon of Warning";
        }
        switch(rollNumber){
            case 66:
                item = "Adamantine armor(Chain mail)";
                break;
            case 67: 
                item = "Adamantine armor(Chain shirt)";
                break;
            case 68:
                item = "Adamantine armor(Scale mail)";
                break;
            case 69:
                item = "Bag of Tricks (gray)";
                break;
            case 70:
                item = "Bag of Tricks (rust)";
                break;
            case 71:
                item = "Bag of Tricks (tan)";
                break;
            case 72:
                item = "Boots of the Winterlands";
                break;
            case 73:
                item = "Circlet of Blasting";
                break;
            case 74:
                item = "Deck of Illusions";
                break;
            case 75:
                item = "Eversmoking Bottle";
                break;
            case 76:
                item = "Eyes of Charming";
                break;
            case 77:
                item = "Eyes of the Eagle";
                break;
            case 78:
                item = "Figurine of Wondrous Power (Silver Raven)";
                break;
            case 79:
                item = "Gem of Brightness";
                break;
            case 80:
                item = "Gloves of Missile Snaring";
                break;
            case 81:
                item = "Gloves of Swimming and Climbing";
                break;
            case 82:
                item = "Gloves of Thievery";
                break;
            case 83:
                item = "Headband of Intellect";
                break;
            case 84:
                item = "Helm of Telepathy";
                break;
            case 85:
                item = "Intrument of the Bards (Doss Lute)";
                break;
            case 86:
                item = "Instrument of the Bards (Fochlucan Bandore)";
                break;
            case 87:
                item = "Instrument of the Bards (Mac-Fuimidh Cittern)";
                break;
            case 88:
                item = "Medallion of Thoughts";
                break;
            case 89:
                item = "Necklace of Adaptation";
                break;
            case 90:
                item = "Periapt of Wound Closure";
                break;
            case 91:
                item = "Pipes of Haunting";
                break;
            case 92:
                item = "Pipes of the Sewers";
                break;
            case 93:
                item = "Ring of Jumping";
                break;
            case 94:
                item = "Ring of Mind Shielding";
                break;
            case 95:
                item = "Ring of Warmth";
                break;
            case 96:
                item = "Ring of Water Walking";
                break;
            case 97:
                item = "Quiver of Ehlonna";
                break;
            case 98:
                item = "Stone of Good Luck";
                break;
            case 99:
                item = "Wind Fan";
                break;
            case 100:
                item = "Winged Boots";
                break;
        }
        return item;
    }
    public String MagicItemTableG(){
        rollNumber = roll.d100();
        int weapRoll = roll.CustomRoll(35);
        if(rollNumber<=11){
            switch(weapRoll){
            case 1: 
                weapon="Club";
                break;
            case 2: 
                weapon="Dagger";
                break;
            case 3:
                weapon="Greatclub";
                break;
            case 4:
                weapon="Handaxe";
                break;
            case 5:
                weapon="Javelin";
                break;
            case 6:
                weapon="Light Hammer";
                break;
            case 7:
                weapon="Mace";
                break;
            case 8:
                weapon="Quarterstaff";
                break;
            case 9:
                weapon="Sickle";
                break;
            case 10:
                weapon="Spear";
                break;
            case 11:
                weapon="Light Crossbow";
                break;
            case 12:
                weapon="Shortbow";
                break;
            case 13:
                weapon="Sling";
                break;
            case 14:
                weapon="Battleaxe";
                break;
            case 15:
                weapon="Flail";
                break;
            case 16:
                weapon="Glaive";
                break;
            case 17:
                weapon="Greataxe";
                break;
            case 18:
                weapon="Greatsword";
                break;
            case 19:
                weapon="Halberd";
                break;
            case 20:
                weapon="Lance";
                break;
            case 21:
                weapon="Longsword";
                break;
            case 22:
                weapon="Maul";
                break;
            case 23:
                weapon="Morningstar";
                break;
            case 24:
                weapon="Pike";
                break;
            case 25:
                weapon="Rapier";
                break;
            case 26:
                weapon="Scimitar";
                break;
            case 27:
                weapon="Shortsword";
                break;
            case 28:
                weapon="Trident";
                break;
            case 29:
                weapon="War Pick";
                break;
            case 30:
                weapon="Warhammer";
                break;
            case 31:
                weapon="Whip";
                break;
            case 32:
                weapon="Blowgun";
                break;
            case 33:
                weapon="Hand Crossbow";
                break;
            case 34:
                weapon="Heavy Crossbow";
                break;
            case 35:
                weapon="Longbow";
                break;
        }
            item=weapon+",+2";
        }
        if(rollNumber>11&&rollNumber<=14){
            int statue;
            statue = roll.d8();
            item = "Figurine of Wondrous Power ";
            switch(statue){
                case 1: 
                    item += "(Bronze Griffon)";
                    break;
                case 2:
                    item += "(Ebony Fly)";
                    break;
                case 3:
                    item += "(Golden Lions)";
                    break;
                case 4:
                    item += "(Ivory Goats)";
                    break;
                case 5:
                    item += "(Marble Elephant)";
                    break;
                case 6:
                    item += "(Onyx Dog)";
                    break;
                case 7:
                    item += "(Onyx Dog)";
                    break;
                case 8:
                    item += "(Serpentine Owl)";
                    break;
            }
        }
        switch(rollNumber){
            case 15:
                item = "Adamantine armor (Breastplate)";
                break;
            case 16:
                item = "Adamantine armor (Spling)";
                break;
            case 17:
                item = "Amulet of Health";
                break;
            case 18:
                item = "Armor of Vulnerability";
                break;
            case 19:
                item = "Arrow-Catching Shield";
                break;
            case 20:
                item = "Belt of Dwarvenkind";
                break;
            case 21:
                item = "Belt of Hill Giant Strength";
                break;
            case 22:
                item = "Berserker Axe";
                break;
            case 23:
                item = "Boots of Levitation";
                break;
            case 24:
                item = "Boots of Speed";
                break;
            case 25:
                item = "Bowl of Commanding Water Elementals";
                break;
            case 26:
                item = "Bracers of Defense";
                break;
            case 27:
                item = "Brazier of commanding Fire Elementals";
                break;
            case 28:
                item = "Cape of the Mountebank";
                break;
            case 29:
                item = "Censer of Controlling Air Elementals";
                break;
            case 30:
                item = "Armor,+1 Chain mail";
                break;
            case 31:
                item = "Armor of Resistance (Chain Mail)";
                break;
            case 32:
                item = "Armor,+1 chain shirt";
                break;
            case 33:
                item = "Armor of Resistance (Chain Shirt)";
                break;
            case 34:
                item = "Cloak of displacement";
                break;
            case 35:
                item = "Cloak of the Bat";
                break;
            case 36:
                item = "Cube of Force";
                break;
            case 37:
                item = "Daern's Instant Fortress";
                break;
            case 38:
                item = "Dagger of Venom";
                break;
            case 39:
                item = "Dimensional Shackles";
                break;
            case 40:
                item = "Dragon Slayer";
                break;
            case 41:
                item = "Elven Chain";
                break;
            case 42:
                item = "Flame Tongue";
                break;
            case 43:
                item = "Gem of Seeeing";
                break;
            case 44:
                item = "Giant Slayer";
                break;
            case 45:
                item = "Glamoured Studded Leather";
                break;
            case 46:
                item = "Helm of Teleportation";
                break;
            case 47:
                item = "Horn of Blasting";
                break;
            case 48:
                item = "Horn of Valhalla (silver or Brass)";
                break;
            case 49:
                item = "Instrument of the Bards (Canaith Mandolin)";
                break;
            case 50:
                item = "Instrument of the Bards (Cli Lyre)";
                break;
            case 51:
                item = "Ioun Stone (awareness)";
                break;
            case 52:
                item = "Ioun Stone (Protection)";
                break;
            case 53:
                item = "Ioun Stone (Reserve)";
                break;
            case 54:
                item = "Ioun Stone (Sustenance)";
                break;
            case 55:
                item = "Iron Bands of Bilarro";
                break;
            case 56:
                item = "Armor,+1 Leather";
                break;
            case 57:
                item = "Armor of Resistance (Leather)";
                break;
            case 58:
                item = "Mace of Disruption";
                break;
            case 59:
                item = "Mace of Smiting";
                break;
            case 60:
                item = "Mace of Terror";
                break;
            case 61:
                item = "Mantle of Spell Resistance";
                break;
            case 62:
                item = "Necklace of Prayer beads";
                break;
            case 63:
                item = "Periapt of Proof Against Poison";
                break;
            case 64:
                item = "Ring of Animal Influence";
                break;
            case 65:
                item = "Ring of Evasion";
                break;
            case 66:
                item = "Ring of Feather Falling";
                break;
            case 67:
                item = "Ring of Free Action";
                break;
            case 68:
                item = "Ring of Protection";
                break;
            case 69:
                item = "Ring of Resistance";
                break;
            case 70:
                item = "Ring of Spell Storing";
                break;
            case 71:
                item = "Ring of the Ram";
                break;
            case 72:
                item = "Ring of X-Ray Vision";
                break;
            case 73:
                item = "Robe of Eyes";
                break;
            case 74:
                item = "Rod of Rulership";
                break;
            case 75:
                item = "Rod of the Pact Keeper,+2";
                break;
            case 76:
                item = "Rope of Entanglement";
                break;
            case 77:
                item = "Armor,+1 Scale Mail";
                break;
            case 78:
                item = "Armor of Resistance (Scale Mail)";
                break;
            case 79:
                item = "Shield,+2";
                break;
            case 80:
                item = "Shield of Missile Attaction";
                break;
            case 81:
                item = "Staff of Charming";
                break;
            case 82:
                item = "Staff of Healing";
                break;
            case 83:
                item = "Staff of Swarming Insects";
                break;
            case 84:
                item = "Staff of the Woodlands";
                break;
            case 85:
                item = "Staff of Withering";
                break;
            case 86:
                item = "Stone of Controlling Earth elementals";
                break;
            case 87:
                item = "Sun Blade";
                break;
            case 88:
                item = "Sword of Life Stealing";
                break;
            case 89:
                item = "Sword of Wounding";
                break;
            case 90:
                item = "Tentacle Rod";
                break;
            case 91:
                item = "Vicious Weapon";
                break;
            case 92:
                item = "Wand of Binding";
                break;
            case 93:
                item = "Wand of Enemy Detection";
                break;
            case 94:
                item = "Wand of Fear";
                break;
            case 95:
                item = "Wand of Fireballs";
                break;
            case 96:
                item = "Wand of Lightning Bolts";
                break;
            case 97:
                item = "Wand of Paralysis";
                break;
            case 98:
                item = "Wand of the War Mage,+2";
                break;
            case 99:
                item = "Wand of Wonder";
                break;
            case 100:
                item = "Wings of Flying";
                break;
        }
        return item;
    }
    public String MagicItemTableH(){
        rollNumber=roll.d100();
        int weapRoll = roll.CustomRoll(35);
        if(rollNumber<=10){
            switch(weapRoll){
            case 1: 
                weapon="Club";
                break;
            case 2: 
                weapon="Dagger";
                break;
            case 3:
                weapon="Greatclub";
                break;
            case 4:
                weapon="Handaxe";
                break;
            case 5:
                weapon="Javelin";
                break;
            case 6:
                weapon="Light Hammer";
                break;
            case 7:
                weapon="Mace";
                break;
            case 8:
                weapon="Quarterstaff";
                break;
            case 9:
                weapon="Sickle";
                break;
            case 10:
                weapon="Spear";
                break;
            case 11:
                weapon="Light Crossbow";
                break;
            case 12:
                weapon="Shortbow";
                break;
            case 13:
                weapon="Sling";
                break;
            case 14:
                weapon="Battleaxe";
                break;
            case 15:
                weapon="Flail";
                break;
            case 16:
                weapon="Glaive";
                break;
            case 17:
                weapon="Greataxe";
                break;
            case 18:
                weapon="Greatsword";
                break;
            case 19:
                weapon="Halberd";
                break;
            case 20:
                weapon="Lance";
                break;
            case 21:
                weapon="Longsword";
                break;
            case 22:
                weapon="Maul";
                break;
            case 23:
                weapon="Morningstar";
                break;
            case 24:
                weapon="Pike";
                break;
            case 25:
                weapon="Rapier";
                break;
            case 26:
                weapon="Scimitar";
                break;
            case 27:
                weapon="Shortsword";
                break;
            case 28:
                weapon="Trident";
                break;
            case 29:
                weapon="War Pick";
                break;
            case 30:
                weapon="Warhammer";
                break;
            case 31:
                weapon="Whip";
                break;
            case 32:
                weapon="Blowgun";
                break;
            case 33:
                weapon="Hand Crossbow";
                break;
            case 34:
                weapon="Heavy Crossbow";
                break;
            case 35:
                weapon="Longbow";
                break;
        }
            item=weapon+", +3";
        }
        if(rollNumber>10&&rollNumber<=12){
            item="Amulet of the planes";
        }
        if(rollNumber>12&&rollNumber<=14){
            item="Carpet of flying";
        }
        if(rollNumber>14&&rollNumber<=16){
            item="Crystal ball(very rare version)";
        }
        if(rollNumber>16&&rollNumber<=18){
            item="Ring of regeneration";
        }
        if(rollNumber>18&&rollNumber<=20){
            item="Ring of shooting stars";
        }
        if(rollNumber>20&&rollNumber<=22){
            item="Ring of telekinesis";
        }
        if(rollNumber>22&&rollNumber<=24){
            item="Robe of scintillation colors";
        }
        if(rollNumber>24&&rollNumber<=26){
            item="Robe of stars";
        }
        if(rollNumber>26&&rollNumber<=28){
            item="Rod of absorbtion";
        }
        if(rollNumber>28&&rollNumber<=30){
            item="Rod of alertness";
        }
        if(rollNumber>30&&rollNumber<=32){
            item="Rod of security";
        }
        if(rollNumber>32&&rollNumber<=34){
            item="Rod of the pact keeper, +3";
        }
        if(rollNumber>34&&rollNumber<=36){
            item="Scimitar of speed";
        }
        if(rollNumber>36&&rollNumber<=38){
            item="Shield, +3";
        }
        if(rollNumber>38&&rollNumber<=40){
            item="Staff of fire";
        }
        if(rollNumber>40&&rollNumber<=42){
            item="Staff of frost";
        }
        if(rollNumber>42&&rollNumber<=44){
            item="Staff of power";
        }
        if(rollNumber>44&&rollNumber<=46){
            item="Staff of striking";
        }
        if(rollNumber>46&&rollNumber<=48){
            item="Staff of thunder and lightning";
        }
        if(rollNumber>48&&rollNumber<=50){
            item="Sword of sharpness";
        }
        if(rollNumber>50&&rollNumber<=52){
            item="Wand of polymorph";
        }
        if(rollNumber>52&&rollNumber<=54){
            item="Wand of the war mage, +3";
        }
        switch(rollNumber){
            case 55:
                item = "Adamantine armor (half plate)";
                break;
            case 56:
                item = "Adamantine armor (plate)";
                break;
            case 57:
                item = "Animated shield";
                break;
            case 58:
                item = "Belf of fire giant strength";
                break;
            case 59:
                String belt="";
                int beltRoll;
                beltRoll=roll.CustomRoll(2);
                if(beltRoll==1)
                    belt="frost";
                if(beltRoll==2)
                    belt="stone";
                item = "Belf of "+belt+" giant strength";
                break;
            case 60:
                item = "Armor, +1 (breastplate)";
                break;
            case 61:
                item = "Armor of resistance (breastplate)";
                break;
            case 62:
                item = "Candle of invocation";
                break;
            case 63:
                item = "Armor, +2 (chain mail)";
                break;
            case 64:
                item = "Armor, +2 (chain shirt)";
                break;
            case 65:
                item = "Cloak of arachnida";
                break;
            case 66:
                item = "Dancing sword";
                break;
            case 67:
                item = "Demon armor";
                break;
            case 68:
                item = "Dragon scale mail";
                break;
            case 69:
                item = "Dwarven plate";
                break;
            case 70:
                item = "Dwarven thrower";
                break;
            case 71:
                item = "Efreeti bottle";
                break;
            case 72:
                item = "Figurine of wondrous power (obsidian steed)";
                break;
            case 73:
                item = "Frost brand";
                break;
            case 74:
                item = "Helm of brilliance";
                break;
            case 75:
                item = "Horn of Valhalla (bronze)";
                break;
            case 76:
                item = "Instrument of the bards (Anstruth harp)";
                break;
            case 77:
                item = "Ioun Stone (absorption)";
                break;
            case 78:
                item = "Ioun Stone (agility)";
                break;
            case 79:
                item = "Ioun Stone (fortitude)";
                break;
            case 80:
                item = "Ioun Stone (insight)";
                break;
            case 81:
                item = "Ioun Stone (intellect)";
                break;
            case 82:
                item = "Ioun Stone (leadership)";
                break;
            case 83:
                item = "Ioun Stone (strength)";
                break;
            case 84:
                item = "Armor, +2 (leather)";
                break;
            case 85:
                item = "Manual of bodily of health";
                break;
            case 86:
                item = "Manual of gainful exercise";
                break;
            case 87:
                item = "Manual of golems";
                break;
            case 88:
                item = "Manual of quickness of action";
                break;
            case 89:
                item = "Mirror of life trapping";
                break;
            case 90:
                item = "Nine lives stealer";
                break;
            case 91:
                item = "Oathbow";
                break;
            case 92:
                item = "Armor, +2 (scale mail)";
                break;
            case 93:
                item = "Spellguard shield";
                break;
            case 94:
                item = "Armor, +1 (splint)";
                break;
            case 95:
                item = "Armor of resistance (splint)";
                break;
            case 96:
                item = "Armor, +1 (studded leather)";
                break;
            case 97:
                item = "Armor of resistance (studded leather)";
                break;
            case 98:
                item = "Tome of clear thought";
                break;
            case 99:
                item = "Tome of leadership and influence";
                break;
            case 100:
                item = "Tome of understanding";
                break;
        }
        return item;
    }
    public String MagicItemTableI(){
        rollNumber=roll.d100();
        int armorRoll= roll.d12();
        if(rollNumber<=5){
            item="Defender";
        }
        if(rollNumber>5&&rollNumber<=10){
            item="Hammer of thunderbolts";
        }
        if(rollNumber>10&&rollNumber<=15){
            item="Luck blade";
        }
        if(rollNumber>15&&rollNumber<=20){
            item="Sword of answering";
        }
        if(rollNumber>20&&rollNumber<=23){
            item="Holy avenger";
        }
        if(rollNumber>23&&rollNumber<=26){
            item="Ring of djinni summoning";
        }
        if(rollNumber>26&&rollNumber<=29){
            item="Ring of invisibility";
        }
        if(rollNumber>29&&rollNumber<=32){
            item="Ring of spell turning";
        }
        if(rollNumber>32&&rollNumber<=35){
            item="Rod of lordly might";
        }
        if(rollNumber>35&&rollNumber<=38){
            item="Staff of the magi";
        }
        if(rollNumber>38&&rollNumber<=41){
            item="Vorpal sword";
        }
        if(rollNumber>41&&rollNumber<=43){
            item="Belt of cloud giant strength";
        }
        if(rollNumber>43&&rollNumber<=45){
            item="Armor, +2 (breastplate)";
        }
        if(rollNumber>45&&rollNumber<=47){
            item="Armor, +3 (chain mail)";
        }
        if(rollNumber>47&&rollNumber<=49){
            item="Armor, +3 (chain shirt)";
        }
        if(rollNumber>49&&rollNumber<=51){
            item="Cloak of invisibility";
        }
        if(rollNumber>51&&rollNumber<=53){
            item="Crystal ball (legendary version)";
        }
        if(rollNumber>53&&rollNumber<=55){
            item="Armor, +1 (half plate)";
        }
        if(rollNumber>55&&rollNumber<=57){
            item="Iron flask";
        }
        if(rollNumber>57&&rollNumber<=59){
            item="Armor, +3 (leather)";
        }
        if(rollNumber>59&&rollNumber<=61){
            item="Armor, +1 (plate)";
        }
        if(rollNumber>61&&rollNumber<=63){
            item="Robe of the archmagi";
        }
        if(rollNumber>63&&rollNumber<=65){
            item="Rod of resurrection";
        }
        if(rollNumber>65&&rollNumber<=67){
            item="Armor, +1 (scale mail)";
        }
        if(rollNumber>67&&rollNumber<=69){
            item="Scarab of protection";
        }
        if(rollNumber>69&&rollNumber<=71){
            item="Armor, +2 (splint)";
        }
        if(rollNumber>71&&rollNumber<=73){
            item="Armor, +2 (studded leather)";
        }
        if(rollNumber>73&&rollNumber<=75){
            item="Well of many worlds";
        }
        switch(rollNumber){
            case 76:
                if(armorRoll<=2)
                    armor="Armor, +2 (half plate)";
                if(armorRoll>2&&armorRoll<=4)
                    armor="Armor, +2 (plate)";
                if(armorRoll>4&&armorRoll<=6)
                    armor="Armor, +3 (studded leather)";
                if(armorRoll>6&&armorRoll<=8)
                    armor="Armor, +3 (breastplate)";
                if(armorRoll>8&&armorRoll<=10)
                    armor="Armor, +3 (splint)";
                if(armorRoll==11)
                    armor="Armor, +3 (half plate)";
                if(armorRoll==12)
                    armor="Armor, +3 (plate)";
                item = armor;
                break;
            case 77:
                item = "Apparatus of Kwalish";
                break;
            case 78:
                item = "Armor of invulnerability";
                break;
            case 79:
                item = "Belt of storm giant strength";
                break;
            case 80:
                item = "Cubic gate";
                break;
            case 81:
                item = "Deck of many things";
                break;
            case 82:
                item = "Efreeti chain";
                break;
            case 83:
                item = "Armor of resistance (half plate)";
                break;
            case 84:
                item = "Horn of Valhalla (iron)";
                break;
            case 85:
                item = "Instrument of the bards (Ollamh harp)";
                break;
            case 86:
                item = "Ioun stone (greater absorption)";
                break;
            case 87:
                item = "Ioun stone (mastery)";
                break;
            case 88:
                item = "Ioun stone (regeneration)";
                break;
            case 89:
                item = "Plate armor of etherealness";
                break;
            case 90:
                item = "Plate armor of resistance";
                break;
            case 91:
                item = "Ring of air elemental command";
                break;
            case 92:
                item = "Ring of earth elemental command";
                break;
            case 93:
                item = "Ring of fire elemental command";
                break;
            case 94:
                item = "Ring of three wishes";
                break;
            case 95:
                item = "Ring of water elemental command";
                break;
            case 96:
                item = "Sphere of annihilation";
                break;
            case 97:
                item = "Talisman of pure good";
                break;
            case 98:
                item = "Talisman of the sphere";
                break;
            case 99:
                item = "Talisman of ultimate evil";
                break;
            case 100:
                item = "Tome of the stilled tongue";
                break;
        }
        return item;
    }
}