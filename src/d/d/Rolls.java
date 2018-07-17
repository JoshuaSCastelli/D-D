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
public class Rolls {
    private Random rand = new Random();
    
    public Rolls(){ 
    }
    public int d4(){
        int rolld4;
        rolld4 = rand.nextInt(4)+1;
        return rolld4;
    }
    public int d6(){
        int rolld6;
        rolld6 = rand.nextInt(6)+1;
        return rolld6;
    }
    public int d8(){
        int rolld8;
        rolld8 = rand.nextInt(8)+1;
        return rolld8;
    }
    public int d10(){
        int rolld10;
        rolld10 = rand.nextInt(10)+1;
        return rolld10;
    }
    public int d12(){
        int rolld12;
        rolld12 = rand.nextInt(12)+1;
        return rolld12;
    }
    public int d20(){
        int rolld20;
        rolld20 = rand.nextInt(20)+1;
        return rolld20;
    }
    public int d30(){
        int rolld30;
        rolld30 = rand.nextInt(30)+1;
        return rolld30;
    }
    public int d100(){
        int rolld100;
        rolld100 = rand.nextInt(100)+1;
        return rolld100;
    }
    public int CustomRoll(int c){
        int custRoll;
        custRoll = rand.nextInt(c)+1;
        return custRoll;
    }
}
