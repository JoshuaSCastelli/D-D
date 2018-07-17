/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.d;

//Treasure generator

import javax.swing.JOptionPane;

public class Treasure {
    
    int[] coin = new int[4];
    String[] hoard;
    

    int gemstones=0,art=0,magicItems=0;
    int copper,silver,gold,platinum,rollNumber;
    
    Rolls roll = new Rolls();
    Gemstones gems = new Gemstones();
    Art artPieces = new Art();
    MagicItemTable magic = new MagicItemTable();
    
    public void Treasure(){
        for(int i=0;i< coin.length;i++){
            coin[i]=0;
        }
    }
    public int[] TreasureZeroToFour(){
        rollNumber = roll.d100();
        
        if(rollNumber <= 35){
            for(int i=1;i<=5;i++){
               copper += roll.d6();//Roll for Copper Pieces
            }
        }
        
        if(rollNumber > 35 && rollNumber <= 70){
            for(int i=1;i<=4;i++){
                silver += roll.d6();//Roll for Silver Pieces
            }
        }
        
        if(rollNumber > 70 && rollNumber <= 95){
            for(int i=1;i<=3;i++){
                gold += roll.d6(); //Roll for Gold Pieces
            }
        }
        
        if(rollNumber >95){
            platinum = roll.d6();//Roll for Platinum Pieces
        }
        coin[0]=copper;
        coin[1]=silver;
        coin[2]=gold;
        coin[3]=platinum;
            
        return coin;
    }
    public int[] TreasureFiveToTen(){
        rollNumber = roll.d100();
        
        if(rollNumber <= 35){
            for(int i=1;i<=4;i++){
               copper += roll.d6();//Roll for Copper Pieces
            }
            copper=copper*100;
            silver = roll.d6()*10;//Roll for Silver pieces
        }
        
        if(rollNumber > 35 && rollNumber <= 70){
            for(int i=1;i<=6;i++){
                silver += roll.d6(); //Roll for Silver Pieces
            }
            for(int j=1;j<=2;j++){
                gold += roll.d6(); //Roll for Gold Pieces
            }
            silver = silver*10;
            gold = gold*10;
        }
        
        if(rollNumber > 70 && rollNumber <= 95){
            for(int i=1;i<=4;i++){
                gold += roll.d6();
            }
            gold = gold*10;
        }
        
        if(rollNumber >95){
            for(int i=1;i<=2;i++){
                gold += roll.d6(); 
            }
            for(int j=1;j<=3;j++){
                platinum += roll.d6();
            }
            gold = gold*10;
        }
        coin[0]=copper;
        coin[1]=silver;
        coin[2]=gold;
        coin[3]=platinum;
        return coin;
    }
    public int[] TreasureElevenToSixteen(){
        rollNumber = roll.d100();
        
        if(rollNumber <= 25){
            for(int i=1;i<=4;i++){
                silver += roll.d6();
            }
            gold = roll.d6();
            silver = silver*100;
            gold = gold*100;
        }
        if(rollNumber > 25 && rollNumber <= 50){
            for(int i=1;i<=2;i++){
                gold += roll.d6();
            }
            gold = gold*100;
        }
        if(rollNumber > 50 && rollNumber <= 75){
            for(int i=1;i<=2;i++){
                gold += roll.d6();
            }
            platinum = roll.d6()*10;
            gold = gold*100;
        }
        if(rollNumber >75){
            for(int i=1;i<=2;i++){
                gold += roll.d6();
                platinum = roll.d6();
            }
            gold = gold*100;
            platinum = platinum*10;
        }
        coin[0]=copper;
        coin[1]=silver;
        coin[2]=gold;
        coin[3]=platinum;
        return coin;
    }
    public int[] TreasureSeventeenPlus(){
        rollNumber = roll.d100();
        
        if(rollNumber <=15){
            for(int i=1;i<=9;i++){
                gold += roll.d6();
            }
            gold = gold*100;
        }
        if(rollNumber >15 && rollNumber <= 55){
            gold = roll.d6()*1000;
            platinum = roll.d6()*100;
        }
        if(rollNumber > 55){
           gold = roll.d6()*1000;
           for(int i=1;i<=2;i++){
               platinum += roll.d6();
           }
           platinum = platinum*100;
        }
        coin[0]=copper;
        coin[1]=silver;
        coin[2]=gold;
        coin[3]=platinum;
        return coin;
    }
    public String[] TreasureHoardZeroToFour(){
        rollNumber = roll.d100();
        int twoD4=0;
        int twoD6=0;
        for(int i=1;i<=2;i++){
            twoD4+=roll.d4();
            twoD6+=roll.d6();
        }
        
        //Coins
        for(int i=1;i<=6;i++){
                copper+=roll.d6();
        }
        for(int j=1;j<=3;j++){
                silver+=roll.d6();
        }
        for(int k=1;k<=2;k++){
                gold+=roll.d6();
        }   
        copper = copper*100;
        silver = silver*100;
        gold = gold*10;
        
        //items
        if(rollNumber<=6){
            hoard = new String[5];
        }
        if(rollNumber>6&&rollNumber<=16){
            gemstones = twoD6;
            hoard = new String[gemstones+4];            
            for(int i=4;i<hoard.length;i++){
                hoard[i] = gems.Gemstones10();
            }
        }
        if(rollNumber>16&&rollNumber<=26){
            art = twoD4;
            hoard = new String[art+4];
            for(int i=4;i<hoard.length;i++){
                hoard[i] = artPieces.Art25();
            }
        }
        if(rollNumber>26&&rollNumber<=36){
            gemstones = twoD6;
            hoard = new String[gemstones+4];
            for(int i=4;i<hoard.length;i++){
                hoard[i] = gems.Gemstones50();
            }
        }
        if(rollNumber>36&&rollNumber<=44){
            gemstones = twoD6;
            magicItems = roll.d6();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones10();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableA();
            }
        }
        if(rollNumber>44&&rollNumber<=52){
            art = twoD4;
            magicItems = roll.d6();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art25();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableA();
            }
        }
        if(rollNumber>52&&rollNumber<=60){
            gemstones = twoD6;
            magicItems = roll.d6();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones50();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableA();
            }
        }
        if(rollNumber>60&&rollNumber<=65){
            gemstones = twoD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones10();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableA();
            }
        }
        if(rollNumber>65&&rollNumber<=70){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art25();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableB();
            }
        }
        if(rollNumber>70&&rollNumber<=75){
            gemstones = twoD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones50();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableB();
            }
        }
        if(rollNumber>75&&rollNumber<=78){
            gemstones = twoD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones10();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableC();
            }
        }
        if(rollNumber>78&&rollNumber<=80){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art25();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableC();
            }
        }
        if(rollNumber>80&&rollNumber<=85){
            gemstones = twoD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones50();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableC();
            }
        }
        if(rollNumber>85&&rollNumber<=92){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art25();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableF();
            }
        }
        if(rollNumber>92&&rollNumber<=97){
            gemstones = twoD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones50();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableF();
            }
        }
        if(rollNumber>97&&rollNumber<=99){
            art = twoD4;
            magicItems = 1;
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art25();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableG();
            }
        }
        if(rollNumber==100){
            gemstones = twoD6;
            magicItems = 1;
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones50();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableF();
            }
        }
        hoard[0]=""+copper;
        hoard[1]=""+silver;
        hoard[2]=""+gold;
        hoard[3]=""+platinum;
        return hoard;
        
    }
    public String[] TreasureHoardFiveToTen(){
        rollNumber = roll.d100();
        int twoD4=0;
        int threeD6=0;
        
        for(int i=1;i<=3;i++){
            threeD6+=roll.d6();
        }
        for(int i=1;i<=2;i++){
            twoD4+=roll.d4();
        }
        //Coins
        for(int i=1;i<=2;i++){
                copper+=roll.d6();
        }
        for(int j=1;j<=2;j++){
                silver+=roll.d6();
        }
        for(int k=1;k<=6;k++){
                gold+=roll.d6();
        } 
        for(int l=1;l<=3;l++){
                platinum+=roll.d6();
        }
        copper = copper*100;
        silver = silver*1000;
        gold = gold*100;
        platinum = platinum*10;
        //items
        if(rollNumber<=4){
            hoard = new String[4];
        }
        if(rollNumber>4&&rollNumber<=10){
            hoard = new String[twoD4+4];            
            for(int i=4;i<hoard.length;i++){
                hoard[i] = artPieces.Art25();
            }
        }
        if(rollNumber>10&&rollNumber<=16){
            hoard = new String[threeD6+4];
            for(int i=4;i<hoard.length;i++){
                hoard[i] = gems.Gemstones50();
            }
        }
        if(rollNumber>16&&rollNumber<=22){
            hoard = new String[threeD6+4];
            for(int i=4;i<hoard.length;i++){
                hoard[i] = gems.Gemstones100();
            }
        }
        if(rollNumber>22&&rollNumber<=28){
            hoard = new String[twoD4+4];
            for(int i=4;i<hoard.length;i++){
               hoard[i] = artPieces.Art250();
            }
        }
        if(rollNumber>28&&rollNumber<=32){
            art = twoD4;
            magicItems = roll.d6();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art25();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableA();
            }
        }
        if(rollNumber>32&&rollNumber<=36){
            gemstones = threeD6;
            magicItems = roll.d6();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones50();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableA();
            }
        }
        if(rollNumber>36&&rollNumber<=40){
            gemstones = threeD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones100();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableA();
            }
        }
        if(rollNumber>40&&rollNumber<=44){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art250();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableB();
            }
        }
        if(rollNumber>44&&rollNumber<=49){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art25();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableB();
            }
        }
        if(rollNumber>49&&rollNumber<=54){
            gemstones = threeD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones50();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableB();
            }
        }
        if(rollNumber>54&&rollNumber<=59){
            gemstones = threeD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones100();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableB();
            }
        }
        if(rollNumber>59&&rollNumber<=63){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art250();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableB();
            }
        }
        if(rollNumber>63&&rollNumber<=66){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art25();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableC();
            }
        }
        if(rollNumber>66&&rollNumber<=69){
            gemstones = threeD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones50();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableC();
            }
        }
        if(rollNumber>69&&rollNumber<=72){
            gemstones = threeD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones100();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableC();
            }
        }
        if(rollNumber>72&&rollNumber<=74){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art250();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableC();
            }
        }
        if(rollNumber>74&&rollNumber<=76){
            art = twoD4;
            magicItems = 1;
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art25();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableD();
            }
        }
        if(rollNumber>76&&rollNumber<=78){
            gemstones = threeD6;
            magicItems = 1;
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones50();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableD();
            }
        }
        if(rollNumber==79){
            gemstones = threeD6;
            magicItems = 1;
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones100();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableD();
            }
        }
        if(rollNumber==80){
            art = twoD4;
            magicItems = 1;
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art250();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableD();
        }

        }
        if(rollNumber>80&&rollNumber<=84){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art25();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableF();
            }
        }
        if(rollNumber>84&&rollNumber<=88){
            gemstones = threeD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones50();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableF();
            }
        }
        if(rollNumber>88&&rollNumber<=91){
            gemstones = threeD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones100();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableF();
            }
        }
        if(rollNumber>91&&rollNumber<=94){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art250();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableF();
            }
        }
        if(rollNumber>94&&rollNumber<=96){
            gemstones = threeD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones100();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableG();
            }
        }
        if(rollNumber>96&&rollNumber<=98){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art250();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableG();
            }
        }
        if(rollNumber==99){
            gemstones = threeD6;
            magicItems = 1;
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones100();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableH();
            }
        }
        if(rollNumber==100){
            art = twoD4;
            magicItems = 1;
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art250();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableH();
            }
        }
        hoard[0]=""+copper;
        hoard[1]=""+silver;
        hoard[2]=""+gold;
        hoard[3]=""+platinum;
        return hoard;
    }
    public String[] TreasureHoardElevenToSixteen(){
        rollNumber = roll.d100();
        int twoD4 = roll.d4()+roll.d4();
        int threeD6 = roll.d6()+roll.d6()+roll.d6();
        for(int i=0;i<=3;i++){
            gold+=roll.d6();
        }
        for(int i=0;i<=4;i++){
            platinum+=roll.d6();
        }
        gold=gold*1000;
        platinum=platinum*100;

        if(rollNumber<=3){
            hoard = new String[4];
        }
        if(rollNumber>3&&rollNumber<=6){
            hoard = new String[twoD4+4];            
            for(int i=4;i<hoard.length;i++){
                hoard[i] = artPieces.Art250();
            }
        }
        if(rollNumber>6&&rollNumber<=9){
            hoard = new String[twoD4+4];
            for(int i=4;i<hoard.length;i++){
                hoard[i] = artPieces.Art750();
            }
        }
        if(rollNumber>9&&rollNumber<=12){
            hoard = new String[threeD6+4];
            for(int i=4;i<hoard.length;i++){
                hoard[i] = gems.Gemstones500();
            }
        }
        if(rollNumber>12&&rollNumber<=15){
            hoard = new String[threeD6+4];
            for(int i=4;i<hoard.length;i++){
               hoard[i] = gems.Gemstones1000();
            }
        }
        if(rollNumber>15&&rollNumber<=19){
            art = twoD4;
            int magicItemsA = roll.d4();
            int magicItemsB = roll.d6();
            hoard = new String[art+magicItemsA+magicItemsB+4];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art250();
            }
            for(int i=4+art;i<4+art+magicItemsA;i++){
               hoard[i] = magic.MagicItemTableA();
            }
            for(int i=4+art+magicItemsA;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableB();
            }
        }
        if(rollNumber>19&&rollNumber<=23){
            art = twoD4;
            int magicItemsA = roll.d4();
            int magicItemsB = roll.d6();
            hoard = new String[art+magicItemsA+magicItemsB+4];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art750();
            }
            for(int i=4+art;i<4+art+magicItemsA;i++){
               hoard[i] = magic.MagicItemTableA();
            }
            for(int i=4+art+magicItemsA;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableB();
            }
        }
        if(rollNumber>23&&rollNumber<=26){
            gemstones = threeD6;
            int magicItemsA = roll.d4();
            int magicItemsB = roll.d6();
            hoard = new String[gemstones+magicItemsA+magicItemsB+4];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones500();
            }
            for(int i=4+art;i<4+gemstones+magicItemsA;i++){
               hoard[i] = magic.MagicItemTableA();
            }
            for(int i=4+gemstones+magicItemsA;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableB();
            }
        }
        if(rollNumber>26&&rollNumber<=29){
            gemstones = threeD6;
            int magicItemsA = roll.d4();
            int magicItemsB = roll.d6();
            hoard = new String[gemstones+magicItemsA+magicItemsB+4];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones1000();
            }
            for(int i=4+art;i<4+gemstones+magicItemsA;i++){
               hoard[i] = magic.MagicItemTableA();
            }
            for(int i=4+gemstones+magicItemsA;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableB();
            }
        }
        if(rollNumber>29&&rollNumber<=35){
            art = twoD4;
            magicItems = roll.d6();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art250();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableC();
            }
        }
        if(rollNumber>35&&rollNumber<=40){
            art = twoD4;
            magicItems = roll.d6();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art750();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableC();
            }
        }
        if(rollNumber>40&&rollNumber<=45){
            gemstones = threeD6;
            magicItems = roll.d6();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones500();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableC();
            }
        }
        if(rollNumber>45&&rollNumber<=50){
            gemstones = threeD6;
            magicItems = roll.d6();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones1000();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableC();
            }
        }
        if(rollNumber>50&&rollNumber<=54){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art250();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableD();
            }
        }
        if(rollNumber>54&&rollNumber<=58){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art750();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableD();
            }
        }
        if(rollNumber>58&&rollNumber<=62){
            gemstones = threeD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones500();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableD();
            }
        }
        if(rollNumber>62&&rollNumber<=66){
            gemstones = threeD6;
            magicItems = roll.d6();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones1000();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableD();
            }
        }
        if(rollNumber>66&&rollNumber<=68){
            art = twoD4;
            magicItems = 1;
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art250();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableE();
            }
        }
        if(rollNumber>68&&rollNumber<=70){
            art = twoD4;
            magicItems = 1;
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art750();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableE();
            }
        }
        if(rollNumber>70&&rollNumber<=72){
            gemstones = threeD6;
            magicItems = 1;
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones500();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableE();
            }
        }
        if(rollNumber>72&&rollNumber<=74){
            gemstones = threeD6;
            magicItems = 1;
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones1000();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableE();
            }
        }
        if(rollNumber>74&&rollNumber<=76){
            art = twoD4;
            int magicItemsF = 1;
            int magicItemsG = roll.d4();
            hoard = new String[art+magicItemsF+magicItemsG+4];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art250();
            }
            for(int i=4+art;i<4+art+magicItemsF;i++){
               hoard[i] = magic.MagicItemTableF();
            }
            for(int i=4+art+magicItemsF;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableG();
            }
        }
        if(rollNumber>76&&rollNumber<=78){
            art = twoD4;
            int magicItemsF = 1;
            int magicItemsG = roll.d4();
            hoard = new String[art+magicItemsF+magicItemsG+4];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art750();
            }
            for(int i=4+art;i<4+art+magicItemsF;i++){
               hoard[i] = magic.MagicItemTableF();
            }
            for(int i=4+art+magicItemsF;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableG();
            }
        }
        if(rollNumber>78&&rollNumber<=80){
            gemstones = threeD6;
            int magicItemsF = 1;
            int magicItemsG = roll.d4();
            hoard = new String[gemstones+magicItemsF+magicItemsG+4];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones500();
            }
            for(int i=4+gemstones;i<4+gemstones+magicItemsF;i++){
               hoard[i] = magic.MagicItemTableF();
            }
            for(int i=4+gemstones+magicItemsF;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableG();
            }
        }
        if(rollNumber>80&&rollNumber<=82){
            gemstones = threeD6;
            int magicItemsF = 1;
            int magicItemsG = roll.d4();
            hoard = new String[gemstones+magicItemsF+magicItemsG+4];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones1000();
            }
            for(int i=4+gemstones;i<4+gemstones+magicItemsF;i++){
               hoard[i] = magic.MagicItemTableF();
            }
            for(int i=4+gemstones+magicItemsF;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableG();
            }
        }
        if(rollNumber>82&&rollNumber<=85){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art250();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableH();
            }
        }
        if(rollNumber>85&&rollNumber<=88){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art750();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableH();
            }
        }
        if(rollNumber>88&&rollNumber<=90){
            gemstones = threeD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones500();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableH();
            }
        }
        if(rollNumber>90&&rollNumber<=92){
            gemstones = threeD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones1000();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableH();
            }
        }
        if(rollNumber>92&&rollNumber<=94){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art250();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableI();
            }
        }
        if(rollNumber>94&&rollNumber<=96){
            art = twoD4;
            magicItems = roll.d4();
            hoard = new String[art+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = artPieces.Art750();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableI();
            }
        }
        if(rollNumber>96&&rollNumber<=98){
            gemstones = threeD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones500();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableI();
            }
        }
        if(rollNumber>98){
            gemstones = threeD6;
            magicItems = roll.d4();
            hoard = new String[gemstones+magicItems+4];
            for(int i=4;i<hoard.length-magicItems;i++){
               hoard[i] = gems.Gemstones1000();
            }
            for(int i=hoard.length-magicItems;i<hoard.length;i++){
                hoard[i] = magic.MagicItemTableI();
            }
        }
        hoard[0]=""+copper;
        hoard[1]=""+silver;
        hoard[2]=""+gold;
        hoard[3]=""+platinum;
        return hoard;
    }
    public String[] TreasureHoardSeventeenPlus(){
        rollNumber = roll.d100();
        int threeD6=roll.d6()+roll.d6()+roll.d6();
        
        for(int i=0;i<=11;i++)
            gold+=roll.d6();
        for(int i=0;i<=7;i++)
            platinum+=roll.d6();
        
        
        if(rollNumber<=2){
            hoard = new String[4];
        }
        if(rollNumber>2&&rollNumber<=5){
            gemstones=threeD6;
            magicItems=roll.d8();
            hoard = new String[4+gemstones+magicItems];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones1000();
            }
            for(int i=4+gemstones;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableC();
            }
        }
        if(rollNumber>5&&rollNumber<=8){
            art=roll.d10();
            magicItems=roll.d8();
            hoard = new String[4+art+magicItems];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art2500();
            }
            for(int i=4+art;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableC();
            }
        }
        if(rollNumber>8&&rollNumber<=11){
            art=roll.d4();
            magicItems=roll.d8();
            hoard = new String[4+art+magicItems];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art7500();
            }
            for(int i=4+art;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableC();
            }
        }
        if(rollNumber>11&&rollNumber<=14){
            gemstones=roll.d8();
            magicItems=roll.d8();
            hoard = new String[4+gemstones+magicItems];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones5000();
            }
            for(int i=4+gemstones;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableC();
            }
        }
        if(rollNumber>14&&rollNumber<=22){
            gemstones=threeD6;
            magicItems=roll.d6();
            hoard = new String[4+gemstones+magicItems];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones1000();
            }
            for(int i=4+gemstones;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableD();
            }
        }
        if(rollNumber>22&&rollNumber<=30){
            art=roll.d10();
            magicItems=roll.d6();
            hoard = new String[4+art+magicItems];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art2500();
            }
            for(int i=4+art;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableD();
            }
        }
        if(rollNumber>30&&rollNumber<=38){
            art=roll.d4();
            magicItems=roll.d6();
            hoard = new String[4+art+magicItems];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art7500();
            }
            for(int i=4+art;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableD();
            }
        }
        if(rollNumber>38&&rollNumber<=46){
            gemstones=roll.d8();
            magicItems=roll.d6();
            hoard = new String[4+gemstones+magicItems];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones5000();
            }
            for(int i=4+gemstones;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableD();
            }
        }
        if(rollNumber>46&&rollNumber<=52){
            gemstones=threeD6;
            magicItems=roll.d6();
            hoard = new String[4+gemstones+magicItems];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones1000();
            }
            for(int i=4+gemstones;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableE();
            }
        }
        if(rollNumber>52&&rollNumber<=58){
            art=roll.d10();
            magicItems=roll.d6();
            hoard = new String[4+art+magicItems];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art2500();
            }
            for(int i=4+art;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableE();
            }
        }
        if(rollNumber>58&&rollNumber<=63){
            art=roll.d4();
            magicItems=roll.d6();
            hoard = new String[4+art+magicItems];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art7500();
            }
            for(int i=4+art;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableE();
            }
        }
        if(rollNumber>63&&rollNumber<=68){
            gemstones=roll.d8();
            magicItems=roll.d6();
            hoard = new String[4+gemstones+magicItems];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones5000();
            }
            for(int i=4+gemstones;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableE();
            }
        }
        if(rollNumber==69){
            gemstones=threeD6;
            magicItems=roll.d4();
            hoard = new String[4+gemstones+magicItems];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones1000();
            }
            for(int i=4+gemstones;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableG();
            }
        }
        if(rollNumber==70){
            art=roll.d10();
            magicItems=roll.d4();
            hoard = new String[4+art+magicItems];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art2500();
            }
            for(int i=4+art;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableG();
            }
        }
        if(rollNumber==71){
            art=roll.d4();
            magicItems=roll.d4();
            hoard = new String[4+art+magicItems];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art7500();
            }
            for(int i=4+art;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableG();
            }
        }
        if(rollNumber==72){
            gemstones=roll.d8();
            magicItems=roll.d4();
            hoard = new String[4+gemstones+magicItems];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones5000();
            }
            for(int i=4+gemstones;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableG();
            }
        }
        if(rollNumber>72&&rollNumber<=74){
            gemstones=threeD6;
            magicItems=roll.d4();
            hoard = new String[4+gemstones+magicItems];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones1000();
            }
            for(int i=4+gemstones;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableH();
            }
        }
        if(rollNumber>74&&rollNumber<=76){
            art=roll.d10();
            magicItems=roll.d4();
            hoard = new String[4+art+magicItems];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art2500();
            }
            for(int i=4+art;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableH();
            }
        }
        if(rollNumber>76&&rollNumber<=78){
            art=roll.d4();
            magicItems=roll.d4();
            hoard = new String[4+art+magicItems];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art7500();
            }
            for(int i=4+art;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableH();
            }
        }
        if(rollNumber>78&&rollNumber<=80){
            gemstones=roll.d8();
            magicItems=roll.d4();
            hoard = new String[4+gemstones+magicItems];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones5000();
            }
            for(int i=4+gemstones;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableH();
            }
        }
        if(rollNumber>80&&rollNumber<=85){
            gemstones=threeD6;
            magicItems=roll.d4();
            hoard = new String[4+gemstones+magicItems];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones1000();
            }
            for(int i=4+gemstones;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableI();
            }
        }
        if(rollNumber>85&&rollNumber<=90){
            art=roll.d10();
            magicItems=roll.d4();
            hoard = new String[4+art+magicItems];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art2500();
            }
            for(int i=4+art;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableI();
            }
        }
        if(rollNumber>90&&rollNumber<=95){
            art=roll.d4();
            magicItems=roll.d4();
            hoard = new String[4+art+magicItems];
            for(int i=4;i<4+art;i++){
                hoard[i]=artPieces.Art7500();
            }
            for(int i=4+art;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableI();
            }
        }
        if(rollNumber>95&&rollNumber<=100){
            gemstones=roll.d8();
            magicItems=roll.d4();
            hoard = new String[4+gemstones+magicItems];
            for(int i=4;i<4+gemstones;i++){
                hoard[i]=gems.Gemstones5000();
            }
            for(int i=4+gemstones;i<hoard.length;i++){
                hoard[i]=magic.MagicItemTableI();
            }
        }
        
        
        
        
        
        
        gold=gold*1000;
        platinum=platinum*1000;
        
        hoard[0]=""+copper;
        hoard[1]=""+silver;
        hoard[2]=""+gold;
        hoard[3]=""+platinum;
        return hoard;
    }
    public int getGems(){
        return gemstones;
    }
    public int getArt(){
        return art;
    }
    public int getMagic(){
        return magicItems;
    }
}

