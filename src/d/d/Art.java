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
public class Art {
    Random rand = new Random();
    public void Art(){
    }
    public String Art25(){
        String[] art25 = {"Silver ewer","Carved bone statuette","Small gold bra"
      + "celet","Cloth-of-gold vestments","Black velvet mask stitched with silv"
      + "er thread","Copper chalice with silver filigree","Piar of engraved bon"
      + "e dice","Small mirror set in a painted wooden frame","Embroidered silk"
      + " handkerchief","Gold locket with a painted portrait inside"};
        for(int i=0;i<art25.length;i++)
            art25[i]+="(25GP)";
        return art25[rand.nextInt(art25.length-1)];
    }
    public String Art250(){
        String[] art250 ={"Gold ring set with bloodstones","Carved ivory statue"
      + "tte","Large gold bracelet","Silver necklace with a gemstone pendant",
        "Bronze crown","Silk robe with gold embroidery","Large well-made tapest"
      + "ry","Brass mug with jade inlay","Box of turquoiseanimal figurines","Go"
      + "ld bird cage with electrum filigree"};
        for(int i=0;i<art250.length;i++)
            art250[i]+="(250GP)";
        return art250[rand.nextInt(art250.length-1)];
    }
    public String Art750(){
        String[] art750 = {"Silver chalice set with moonstones","Silver-plated "
      + "steel longsword with jet set in hilt","Carved harp of exotic wood with"
      + " ivory inlay and zircon gems","Small gold idol","Gold dragon comb set "
      + "with red garnets as eyes","Bottle stopper cork embossed with gold leaf"
      + " and set with amethysts","Ceremonial electrum dagger with a black pear"
      + "l in the pommel","Silver and gold brooch","Obsidian statuette with gol"
      + "d fittings and inlay","Painted gold war mask"};
        for(int i=0;i<art750.length;i++)
            art750[i]+="(750GP)";
        return art750[rand.nextInt(art750.length-1)];
    }
    public String Art2500(){
        String[] art2500 = {"Find gold chain set with a fire opal","Old masterp"
      + "iece painting","Embroidered silk and velvet mantle set with numerous m"
      + "oonstones","Platinum bracelet set with a sapphire","Embroidered glove "
      + "set with jewel chips","Jeweled anklet","Gold music box","Gold circle s"
      + "et with four aquamarines","Eye patch with a mock eye set in blue sapph"
      + "ire and moonstone","A necklace string of small pink pearls"};
        for(int i=0;i<art2500.length;i++)
            art2500[i]+="(2500GP)\n";
        return art2500[rand.nextInt(art2500.length-1)];
    }
    public String Art7500(){
        String[] art7500 = {"Jeweled gold crown","Jeweled platinum ring","Small"
      + " gold statuette set with rubies","Gold cup set with emeralds","Gold je"
      + "welry box with platinum filigree","Painted gold child's sarcophagus",
        "Jade game board with solid gold playing pieces","Bejeweled ivory drink"
      + "ing horn with gold filigree"};
        for(int i=0;i<art7500.length;i++)
            art7500[i]+="(7500GP)";
        return art7500[rand.nextInt(art7500.length-1)];
    }
}
