/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.d;

//This will be my driver file
//import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

public class DD{
    
    Rolls roll = new Rolls();
    Character character = new Character();
    //DocumentException IOException
    public static void main(String[] args){
        
        //editPDF charSheet = new editPDF();
        //charSheet.manipulatePdf("/empty charsheet/charSheet.pdf", "/newCharSheet.pdf");
        
        //Character c = new Character();
        //c.Character();
        
        //Jform
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });

        
        /*TEST ROLLS CLASS
        Rolls rolls = new Rolls();
        //JOptionPane.showMessageDialog(null,rolls.d4() + "\n" + rolls.d6() + 
        //        rolls.d8() + "\n" + rolls.d10() + "\n" + rolls.d12() + "\n" +
        //        rolls.d20() + "\n" + rolls.d30() + "\n" + rolls.d100());
        for(int i=0;i<=500;i++){
            System.out.println(rolls.d100());
        }
        */
        
        
        
        /*TEST TREASURE CLASS
        Treasure loot = new Treasure();
        loot.TreasureZeroToFour();
        loot.TreasureFiveToTen();
        loot.TreasureElevenToSixteen();
        loot.TreasureSeventeenPlus();
        */
        
        /*TEST TURN CLASS
        Turns turn = new Turns();
        for(int i=1;i<=100;i++){
            System.out.println(turn.turns());
        }
        */
        
        /*TEST CONDITIONS CLASS
        Conditions condition = new Conditions();
        System.out.println(condition.blinded());
        System.out.println(condition.charmed());
        System.out.println(condition.deafened());
        System.out.println(condition.frightened());
        System.out.println(condition.grappled());
        System.out.println(condition.incapacitated());
        System.out.println(condition.invisible());
        System.out.println(condition.paralyzed());
        System.out.println(condition.petrified());
        System.out.println(condition.poisoned());
        System.out.println(condition.prone());
        System.out.println(condition.restrained());
        System.out.println(condition.stunned());
        System.out.println(condition.unconcious());
        */
        
        
        /*TEST SPELLS CLASS
        Spells spell = new Spells();
        System.out.println("Cantrips"+"\n"+"=================================");
        for(int i=0;i<=10;i++){
            System.out.println(spell.Cantrips());
        }
        System.out.println("1st"+" "+"======================================");
        for(int i=0;i<=10;i++){
            System.out.println(spell.FirstLevel());
        }
        System.out.println("2nd"+" "+"======================================");
        for(int i=0;i<=10;i++){
            System.out.println(spell.SecondLevel());
        }
        */
        
        /*TREASURE CLASS TEST
        Treasure treasure = new Treasure();
        treasure.TreasureHoardZeroToFour();
        treasure.TreasureHoardFiveToTen();
        treasure.TreasureHoardElevenToSixteen();
        treasure.TreasureHoardSeventeenPlus();
        */
        
        /*MAGIC ITEM TABLE TEST
        MagicItemTable table = new MagicItemTable();
        System.out.println(table.MagicItemTableA());
        System.out.println(table.MagicItemTableB());
        System.out.println(table.MagicItemTableC());
        System.out.println(table.MagicItemTableD());
        System.out.println(table.MagicItemTableE());
        System.out.println(table.MagicItemTableF());
        System.out.println(table.MagicItemTableG());
        */
       //System.exit(0);
    }

}
