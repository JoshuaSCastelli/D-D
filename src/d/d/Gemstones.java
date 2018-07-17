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
public class Gemstones extends DD{
    Random rand = new Random();
    public void Gemstones(){
    }
    public String Gemstones10(){
        String[] gemstone10 = {"Azurite","Banded agate","Blue quartz","Eye agat"
      + "e","Hematite","Lapix lazuli","Malachite","Moss agate","Obsidian","Rhod"
      + "ochrosite","Tiger eye","Turquoise"};
        for(int i=0;i<gemstone10.length;i++)
            gemstone10[i]+="(10GP)";
        return gemstone10[rand.nextInt(gemstone10.length-1)];
    }
    public String Gemstones50(){
        String[] gemstone50 = {"Bloodstone","Carnelian","Chalcedony","Chrysopra"
      + "se","Citrine","Jasper","Moonstone","Onyx","Quartz","Sardonyx","Star ro"
      + "se quartz","Zircon"};
        for(int i=0;i<gemstone50.length;i++)
            gemstone50[i]+="(50GP)";
        return gemstone50[rand.nextInt(gemstone50.length-1)];
    }
    public String Gemstones100(){
        String[] gemstone100 = {"Amber","Amethyst","Chrysoberyl","Coral","Garne"
      + "t","Jade","Jet","Pearl","Spinel","Tourmaline"};
        for(int i=0;i<gemstone100.length;i++)
            gemstone100[i]+="(100GP)";
        return gemstone100[rand.nextInt(gemstone100.length-1)];
    }
    public String Gemstones500(){
        String[] gemstone500 = {"Alexandrite","Aquamarine","Black pearl","Blue "
      + "spinel","Peridot","Topaz"};
        for(int i=0;i<gemstone500.length;i++)
            gemstone500[i]+="(500GP)";
        return gemstone500[rand.nextInt(gemstone500.length-1)];
    }
    public String Gemstones1000(){
        String[] gemstone1000 = {"Black opal","Blue sapphire","Emerald","Fire o"
      + "pal","Opal","Star ruby","Star sapphire","Yellow sapphire"};
        for(int i=0;i<gemstone1000.length;i++)
            gemstone1000[i]+="(1000GP)";
        return gemstone1000[rand.nextInt(gemstone1000.length-1)];
    }
    public String Gemstones5000(){
        String[] gemstone5000 = {"Black sapphire","Diamond","Jacinth","Ruby"};
        for(int i=0;i<gemstone5000.length;i++)
            gemstone5000[i]+="(5000GP)";
        return gemstone5000[rand.nextInt(gemstone5000.length-1)];
    }
}
