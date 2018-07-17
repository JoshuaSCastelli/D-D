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
public class Spells {
    Random rand = new Random();
    public void Spells(){
    }
    public String Cantrips(){
        String[] cantrip = {"Blade Ward","Dancing Lights","Friends","Light",
        "Mage Hand","Mending","Message","Minor Illusion","Prestidigitation",
        "True Strike","Vicious Mockery","Guidance","Resistance","Sacred Flame",
        "Spare the Dying","Thaumaturgy","Druidcraft","Poison Spray",
        "Produce Flame","Shillelagh","Thorn Whip","Acid Splash","Chill Touch",
        "Fire Bolt","Ray of Frost","Shocking Grasp","Eldritch Blast"};
        for(int i=0;i<cantrip.length;i++)
            cantrip[i]+="(Cantrip)";
        return cantrip[rand.nextInt(cantrip.length-1)];
    }
    public String FirstLevel(){
        String[] firstLevel = {"Animal Friendship","Bane","Charm Person",
        "Comprehend Languages","Cure Wounds","Detect Magic","Disguise Self",
        "Dissonant Whispers","Faerie Fire","Feather Fall","Healing Word",
        "Heroism","Identify","Illusory Script","Longstrider","Silent Image",
        "Sleep","Speak with Animals","Tasha's Hideous Laughter","Thunderwave",
        "Unseen Servant","Bless","Command","Create or Destroy Water","Detect "
      + "Evil and Good","Detect Poison and Disease","Guiding Bolt","Inflict "
      + "wounds","Protection from Evil and Good","Purify Food and Drink","Santu"
      + "ary","Shield of Faith","Entangle","Fog Cloud","Goodberry","Jump",
        "Compelled Duel","Divine Favor","Searing Smite","Thunderous Smite",
        "Wrathful Smite","Alarm","Ensnaring Strike","Hail of Thorns","Hunter's"
      + " Mark","Burning Hands","Chromatic Orb","Color Spray","Expeditious "
      + "Retreat","False Life","Mage Armor","Magic Missle","Ray of Sickness",
        "Shield","Silent Image","Witch Bolt","Armor of Agathys","Arms of Hadar",
        "Hellish Rebuke","Hex","Find Familiar","Grease","Tenser's Floating Disk"
        };
        for(int i=0;i<firstLevel.length;i++)
            firstLevel[i]+="(1st Lvl)";
        return firstLevel[rand.nextInt(firstLevel.length-1)];
    }
    public String SecondLevel(){
        String[] secondLevel = {"Animal Messenger","Blindness/Deafness","Calm "
      + "Emotions","Cloud of Daggers","Crown of Madness","Detect Thoughts",
        "Enhance Ability","Enthrall","Heat Metal","Hold Person","Invisibility",
        "Knock","Lesser Restoration","Locate Animals or Plants","Locate Object",
        "Magic Mouth","Phantasmal Force","See Invisibility","Shatter","Silence",
        "Suggestion","Zone of Truth","Aid","Augury","Continual Flame","Find "
      + "Traps","Gentle Repose","Prayer of Healing","Protection from Poison",
        "Spiritual Weapon","Warding Bond","Barkskin","Beast Sense","Darkvision",
        "Flame Blade","Flaming Sphere","Gust of Wind","Moonbeam","Pass without "
      + "Trace","Spike Growth","Branding Smite","Find Steed","Magic Weapon",
        "Cordon of Arrows","Alter Self","Blur","Darkness","Enlarge/Reduce",
        "Levitate","Mirror Image","Misty Step","Scorching Ray","Spider Climb",
        "Web","Ray of Enfeeblement","Arcane Lock","Melf's Acid Arrow","Nystul's "
      + "Magic Aura","Rope Trick"};
        for(int i=0;i<secondLevel.length;i++)
            secondLevel[i]+="(2nd Lvl)";
        return secondLevel[rand.nextInt(secondLevel.length-1)];
    }
    public String ThirdLevel(){
        String[] thirdLevel = {"Bestow Curse","Clairvoyance","Dispel Magic",
        "Fear","Feign Death","Glyph of Warding","Hypnotic Pattern","Leomund's "
      + "Tiny Hut","Major Image","Nondetection","Plant Growth","Sending","Speak"
      + " with Dead","Speak with Plants","Strinking Cloud","Tongues","Animate "
      + "Dead","Beacon of Hope","Create Food and Water","Daylight","Magic " +
        "Circle","Mass Healing Word","Meld into Stone","Protection from Energy",
        "Remove Curse","Revivify","Sending","Spirit Guardians","Water Walk",
        "Call Lightning","Conjure Animals","Sleet Storm","Water Breathing",
        "Wind Wall","Aura of Vitality","Blinding Smite","Cursader's Mantle",
        "Elemental Weapon","Conjure Barrage","Lightning Arrow","Blink","Counter"
      + " Spell","Fireball","Fly","Gaseous Form","Haste","Lightning Bolt","Slow"
        ,"Stinking Cloud","Hunger of Hadar","Vampiric Touch","Phantom Steed"};
        for(int i=0;i<thirdLevel.length;i++)
            thirdLevel[i]+="(3rd Lvl)";
        return thirdLevel[rand.nextInt(thirdLevel.length-1)];
    }   
    public String FourthLevel(){
        String[] fourthLevel = {"Compulsion","Confusion","Dimension Door",
        "Freeom of Movement","Greater Invisibility","Hallucinatory Terrain",
        "Locate Creature","Polymorph","Banishment","Control Water","Death Ward",
        "Divination","Guardian of Faith","Stone Shape","Blight","Conjure Minor "
      + "Elementals","Conjure Woodland Beings","Dominate Beast","Giant Insect",
        "Grasping Vine","Ice Storm","Stoneskin","Wall of Fire","Aura of Life",
        "Aura of Purity","Staggering Smite","Arcane Eye","Evard's Black Tentacl"
      + "es","Fabricate","Fire Shield","Leomund's Secret Chest","Mordenkainen's"
      + " Faithful Hound","Mordenkainen's Private Sanctum","Otiluke's Resilient"
      + " Sphere","Phantasmal Killer"};
        
        for(int i=0;i<fourthLevel.length;i++){
            fourthLevel[i]+="(4th Lvl)";
        }
        return fourthLevel[rand.nextInt(fourthLevel.length-1)];
    }
    public String FifthLevel(){
        String[] fifthLevel ={"Animate Objects","Awaken","Dominate Person",
        "Dream","Geas","Greater Restoration","Hold Monster","Legend Lore","Mass"
      + " Cure Wounds","Mislead","Modify Memory","Planar Binding","Raise Dead",
        "Scrying","Seeming","Teleportation Circle","Commune","Contagion",
        "Dispel Evil and Good","Flame Strike","Hallow","Insect Plague","Anti"
      + "life Shell","Commune with Nature","Conjure Elemental","Reincarnate",
        "Tree Stride","Wall of Stone","Banishing Smite","Circle of Power","Dest"
      + "ructive Smite","Conjure Volley","Swift Quiver","Cloudkill","Cone of "
      + "Cold","Creation","Telekinesis","Contact Other Plane","Bigby's Hand",
        "Passwall","Rary's Telepathic Bond","Wall of Force"};
        for(int i=0;i<fifthLevel.length;i++)
            fifthLevel[i]+="(5th Lvl)";
        return fifthLevel[rand.nextInt(fifthLevel.length-1)];
    }
    public String SixthLevel(){
        String[] sixthLevel = {"Eyebite","Find the Path","Guards and Wards",
        "Mass Suggestion","Otto's Irresistible Dance","Programmed Illusion",
        "True Seeing","Blade Barrier","Create Undead","Forbiddance","Harm",
        "Heal","Heoes' Feast","Planar Ally","Word of Recall","Conjure Fey",
        "Move Earth","Sunbeam","Transport via Plants","Wall of Thorns","Wind "
      + "Walk","Arcane Gate","Chain Lightning","Circle of Death","disintegrate",
        "Globe of Invulnerability","Flesh to Stone","Contingency","Drawmij's "
      + "Instant Summons","Magic Jar","Otiluke's Freezing Sphere","Wall of Ice"
        };
        for(int i=0;i<sixthLevel.length;i++)
            sixthLevel[i]+="(6th Lvl)";
        return sixthLevel[rand.nextInt(sixthLevel.length-1)];
    }
    public String SeventhLevel(){
        String[] seventhLevel = {"Etherealness","Forceage","Mirage Arcane",
        "Mordenkainen's Magnificent Mansion","Mordenkainen's Sword","Project "
      + "Image","Regenerate","Resurrection","Symbol","Teleport","Conjure Celest"
      + "ial","Divine Word","Fire Storm","Plane Shift","Reverse Gravity",
        "Delayed Blast Fireball","Finger of Death","Prismatic Spray","Sequester"
        ,"Simulacrum"};
        for(int i=0;i<seventhLevel.length;i++)
            seventhLevel[i]+="(7th Lvl)";
        return seventhLevel[rand.nextInt(seventhLevel.length-1)];
    }
    public String EigthLevel(){
        String[] eigthLevel = {"Dominate Monster","Feeblemind","Glibness","Mind"
      + " Blank","Power Word Stun","Antimagic Field","Control Weather","Earthqu"
      + "ake","Holy Aura","Animal Shapes","Antipathy/Sympathy","Sunburst","Tsun"
      + "ami","Incendiary Cloud","Damiplane","Clone","Maze","Telepathy","Trap t"
      + "he Soul"};
        for(int i=0;i<eigthLevel.length;i++)
            eigthLevel[i]+="(8th Lvl)";
        return eigthLevel[rand.nextInt(eigthLevel.length-1)];
    }
    public String NinthLevel(){
        String[] ninthLevel = {"Foresight","Power Word Heal","Power Word Kill",
        "True Polymorph","Astral Projection","Gate","Mass Heal","True Ressurect"
      + "ion","Shapechange","Storm of Vengeance","Meteor Swarm","Time Stop",
        "Wish","Imprisonment","Prismatic Wall","Weird"};
        for(int i=0;i<ninthLevel.length;i++)
            ninthLevel[i]+="(9th Lvl)";
        return ninthLevel[rand.nextInt(ninthLevel.length-1)];
    }
}
