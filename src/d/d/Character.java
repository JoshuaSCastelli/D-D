/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.d;

//Character generator

import javax.swing.JOptionPane;

public class Character extends Window{
   public String[] charInfo=new String[31];//0-5 Attributes(high to low), 5-?
   public int[] attRoll= new int[4];
   public int[] attrib = new int[6];
   String alignment,background;
   
   int str=0,con=0,dex=0,intel=0,wis=0,cha=0,hp=0;
   int strMod=0,conMod=0,dexMod=0,intMod=0,wisMod=0,chaMod=0,prof=2;
    public void Character(){
        Character c = new Character();
        c.Attributes(attrib);
    }

    private String[] Background(){
        String[] charBackground=null;
        return charBackground;
    }
    private int[] Attributes(int[] a){
        int temp;
        for(int j=0;j<=5;j++){
            for(int i=0;i<=3;i++){
                attRoll[i]=roll.d6();
            }
            attRollDescending(a);
            temp=attRoll[0]+attRoll[1]+attRoll[2];
            a[j]=temp;
        }
        attributesDescending(a);
        return a;
    }
    private int[] attRollDescending(int[] a){
        int temp;
        while(a[0]<a[1]||a[1]<a[2]||a[2]<a[3]){
            if(a[0]>=a[1]){//move on
                if(a[1]>=a[2]){//move on
                    if(a[2]>=a[3]){
                        //stay there
                    }
                    else{
                        temp = a[3];
                        a[3]=a[2];
                        a[2]=temp;
                    }
                }
                else{
                    temp = a[2];
                    a[2]=a[1];
                    a[1]=temp;
                }
            }
            else{
                temp = a[1];
                a[1]=a[0];
                a[0]=temp;
            }
        }
        return a;
    }
    private int[] attributesDescending(int[] a){
        int temp;
        while(a[0]<a[1]||a[1]<a[2]||a[2]<a[3]||
              a[3]<a[4]||a[4]<a[5]){
            if(a[0]>=a[1]){
                if(a[1]>=a[2]){
                    if(a[2]>=a[3]){
                        if(a[3]>=a[4]){
                            if(a[4]>=a[5]){
                                //stay
                            }
                            else{
                                temp=a[5];
                                a[5]=a[4];
                                a[4]=temp;
                            }
                        }
                        else{
                            temp=a[4];
                            a[4]=a[3];
                            a[3]=temp;
                        }
                    }
                    else{
                        temp=a[3];
                        a[3]=a[2];
                        a[2]=temp;
                    }
                }
                else{
                    temp=a[2];
                    a[2]=a[1];
                    a[1]=temp;
                }
            }
            else{
                temp=a[1];
                a[1]=a[0];
                a[0]=temp;
            }
        }
        return a;
    }
    private int attribMod(int a){
        int mod=0;
        if(a<2){
            mod=-5; 
        }
        if(a<=3&&a>=2){
            mod=-4;
        }
        if(a<=5&&a>=4){
            mod=-3;
        }
        if(a<=7&&a>=6){
            mod=-2;
        }
        if(a<=9&&a>=8){
            mod=-1;
        }
        if(a<=11&&a>=10){
            mod=0;
        }
        if(a<=13&&a>=12){
            mod=+1;
        }
        if(a<=15&&a>=14){
            mod=+2;
        }
        if(a<=17&&a>=16){
            mod=+3;
        }
        if(a<=19&&a>=18){
            mod=+4;
        }
        if(a<=21&&a>=20){
            mod=+5;
        }
        if(a<=23&&a>=22){
            mod=+6;
        }
        if(a<=25&&a>=24){
            mod=+7;
        }
        if(a<=27&&a>=26){
            mod=+8;
        }
        if(a<=29&&a>=28){
            mod=+9;
        }
        if(a==30){
            mod=+10;
        }
        return mod;
    }
    
    public void dwarfRace(){
        String[] dwarfTypes = {"Hill Dwarf","Mountain Dwarf"};
        String[] toolProfs={"Smith's Tools","Brewer's Supplies","Mason's to"
                + "ols"};
        con=2;//+2 to constitution. Strength is main attribute Con 2nd.
        String choice=JOptionPane.showInputDialog(null, 
                "Dwarf Type?", "Dwarf", 
                JOptionPane.PLAIN_MESSAGE, null, dwarfTypes, 0).toString();
        charInfo[6]=choice;            
        charInfo[7]="25ft";
        charInfo[8]="Racial Feats:\n";
        charInfo[8]+="-Darkvision\n-Dwarven Resilience:(Adv. on saves againt p"
                + "oison and poison DMG)\n-Stone Cunning: Ont he origin of s"
                + "tone work x2 prof. bonus to INT check";
        charInfo[9]="Weapon/Armor Profs:\n-Battle-axe\n-Hand axe\n-Light hammer"
                + "\n-Warhammer";
        String tool=JOptionPane.showInputDialog(null,"Choose one tool Proficien"
                + "cy","Tools",JOptionPane.PLAIN_MESSAGE,null,toolProfs,
                0).toString();
        charInfo[10]="Tool Profs:"+"\n-"+tool;
        int twoDFour=roll.d4()+roll.d4();
        int twoDSix=roll.d6()+roll.d6();
        if(race == "Hill Dwarf"){
            int height=44;
            int weight=115;
            weight+=twoDFour*twoDSix;
            height+=twoDFour;
            int feet=height/12;
            int inches=height%12;
            wis=1;
            hp=1;
            charInfo[8]+="\n+1 HP per lvl";
            charInfo[28]=""+feet+"'"+inches+"\"";
            charInfo[29]=""+weight+" lbs";
        }
        else{//Mountain Dwarf
            int height = 48;
            int weight = 130;
            weight+=twoDFour*twoDSix;
            height+=twoDFour;
            int feet=height/12;
            int inches=height%12;
            
            str=2;
            charInfo[9]+="\n-Light armor\n-Medium armor";
            charInfo[28]=""+feet+"'"+inches+"\"";
            charInfo[29]=""+weight+" lbs";
        }
    }
    public void elfRace(){
        String[] elfTypes = {"High Elf","Wood Elf","Dark Elf(Drow)"};
        dex=2;
        String race=JOptionPane.showInputDialog(null, 
                "Elf Type?", "Elf", 
                JOptionPane.PLAIN_MESSAGE, null, elfTypes, 0).toString();
        charInfo[6]=race;
        charInfo[7]="30ft";
        charInfo[8]="Racial Feats:\n";
        charInfo[8]+="-Keen Senses: Prof. w/ Perception\n-Fey Ancestry"
                + ":(Adv on saves against charmed; magic cannot put you to "
                + "sleep\n-Trance:(4 hours of meditation = 8 hours of sleep"
                + "";
        charInfo[9]="Weapon/Armor Profs:";
        charInfo[10]="Tool Profs:";
        int twoDTen=roll.d10()+roll.d10();
        if(race=="High Elf"){
            int height = 54;
            height+=twoDTen;
            int feet=height/12;
            int inches=height%12;
            int weight =90+(twoDTen*roll.d4());
            intel=1;
            charInfo[8]+="\n-Darkvision\n-Choose one cantrip of choice from wizard"
                    + "s spell list\n-Choose one language of choice";
            charInfo[9]+="\n-Longsword\n-Shortsword\n-Longbow\n-Shortbow";
            charInfo[28]=""+feet+"'"+inches+"\"";
            charInfo[29]=""+weight+" lbs";
        }
        if(race=="Wood Elf"){
            int height = 54;
            height+=twoDTen;
            int feet=height/12;
            int inches=height%12;
            int weight =100+(twoDTen*roll.d4());
            wis=1;
            charInfo[7]="35ft";
            charInfo[8]+="\n-Darkvision\n-Can attepmt to hide when only lightly obs"
                    + "cured";
            charInfo[9]+="\n-Longsword\n-Shortsword\n-Longbow\n-Shortbow";
            charInfo[28]=""+feet+"'"+inches+"\"";
            charInfo[29]=""+weight+" lbs";
        }
        if(race=="Dark Elf(Drow)"){
            int height = 53;
            int twoDSix=roll.d6()+roll.d6();
            height+=twoDSix;
            int feet=height/12;
            int inches=height%12;
            int weight =75+(twoDSix*roll.d6());
            cha=1;
            charInfo[8]+="\n-Superior Darkvision(120ft)\n-Sunlight Sensitivity:(Di"
                    + "sadv. on ATT rolls and WIS checks when target is in "
                    + "direct sunlight\n-Know 'Dancing Lights(cantrip 1/day"
                    + ")\n-Know 'Darkness' at lvl 5(1/day): Charisma is the"
                    + " spellcasting ability you use for these spells" ;
            charInfo[9]+="\n-Rapiers\n-Shortbows\n-Hand Crossbow";
            charInfo[28]=""+feet+"'"+inches+"\"";
            charInfo[29]=""+weight+" lbs";
        }
        charInfo[10]="-Tool Profs:";
    }
    public void halflingRace(){
        dex=2;
            String[] halflingTypes = {"Lightfoot Halfling","Stout Halfling"};
            String race = JOptionPane.showInputDialog(null,"Halfling Type?", "H"
                    + "alfling",JOptionPane.PLAIN_MESSAGE, null, halflingTypes, 
                    0).toString();
            charInfo[6]=race;
            charInfo[7]="25ft";
            charInfo[8]="Racial Feats:\n";
            charInfo[8]+="-Lucky: When you roll a 1 on ATT/Check/Save, reroll an"
                    + "d take the new number\n-Brave: Adv. on saves against bei"
                    + "ng frightened\n-Halfling Nimbleness: Can move through th"
                    + "e space of any creature this is of one size larger than "
                    + "your own.";
            charInfo[9]="Weapon/Armor Profs:";
            if(race=="Lightfoot Halfling"){
                cha=1;
                charInfo[8]+="\n-Can attempt to hide when obscured by a creatur"
                        + "e of at least one size larger than you";
            }
            else{
                con=1;
                charInfo[8]+="\n-Adv. on saves against poison\n-Resistence to p"
                        + "oison";
            }
            charInfo[10]="Tool Profs:";
            int twoDFour=roll.d4()+roll.d4();
            int height=31;
            int weight=35;
            height+=twoDFour;
            weight+=twoDFour;
            int feet=height/12;
            int inches=height%12;
            charInfo[28]=""+feet+"'"+inches+"\"";
            charInfo[29]=""+weight+" lbs";
    }
    public void humanRace(){
        str=1;con=1;dex=1;intel=1;wis=1;cha=1;
        String[] skills = {"Acrobatics","Animal Handling","Arcana","Athletics",
            "Deception","History","Insight","Intimidation","Investigation","Med"
                + "icine","Nature","Perception","Performance","Persuasion","Rel"
                + "igion","Sleight of Hand","Stealth","Survival"};
        charInfo[6]="Human";
        charInfo[7]="30ft";
        charInfo[8]="Racial Feats:\n";
        String choice = JOptionPane.showInputDialog(null,"Choose one skill to b"
                + "e proficient in:", "Skills",JOptionPane.PLAIN_MESSAGE, null,
                skills,0).toString();
        charInfo[8]+="Proficient in "+choice;
        charInfo[9]="Weapon/Armor Profs:";
        charInfo[10]="Tool Profs:";
        int twoDTen=roll.d10()+roll.d10();
        int twoDFour=roll.d4()+roll.d4();
        int height=56;
        int weight=110;
        height+=twoDTen;
        weight+=twoDTen*twoDFour;
        int feet=height/12;
        int inches=height%12;
        charInfo[28]=""+feet+"'"+inches+"\"";
        charInfo[29]=""+weight+" lbs";
    }
    public void dragonbornRace(){
        str=2;cha=1;
        String[] dragonTypes = {"Black/Acid(5x30ft Line)","Blue/Lightning(5x30f"
                + "t Line)","Brass/Fire(5x30ft Line)","Bronze/Lightning(5x30ft "
                + "Line)","Copper/Acid(5x30ft Line)","Gold/Fire(15ft Cone)","Gr"
                + "een/Poison(15ft Cone)","Red/Fire(15ft Cone)","Silver/Cold(15"
                + "ft Cone)","White/Cold(15ft Cone)"};
        charInfo[6]="Dragonborn";
        charInfo[7]="30ft";
        charInfo[8]="Racial Feats:\n";
        String choice =JOptionPane.showInputDialog(null,"Choose a dragon type f"
                + "or your Draconic Ancestry:", "Dragon",
                JOptionPane.PLAIN_MESSAGE, null, dragonTypes,0).toString();
        charInfo[8]+="-Dragon Ancestry: "+choice+"\n-Breath Weapon: Use your act"
                + "ion to exhale destructive energy determined by your Draconic"
                + " Ancestry. DC Save = 8+CON+PROF. 2d6 DMG on FAIL, HALF on sa"
                + "ve. DMG increases @ Lvl 6: 3d6; Lvl 11: 4d6; Lvl 16 5d6; (1/"
                + "Long Rest)\n-Damage Resistance: "+choice;
        charInfo[9]+="Weapon/Armor Profs:";
        charInfo[10]="Tool Profs:";
        int twoDEight=roll.d8()+roll.d8();
        int twoDSix=roll.d6()+roll.d6();
        int height=66;
        int weight=175;
        height+=twoDEight;
        weight+=twoDEight*twoDSix;
        int feet=height/12;
        int inches=height%12;
        charInfo[28]=""+feet+"'"+inches+"\"";
        charInfo[29]=""+weight+" lbs";
    }
    public void gnomeRace(){
        intel=2;
        String[] gnomeType = {"Forest Gnome","Rock Gnome"};
        String choice = JOptionPane.showInputDialog(null,"Gnome type?","Gnome",
                JOptionPane.PLAIN_MESSAGE,null,gnomeType,0).toString();
        charInfo[6]=choice;
        charInfo[7]="25ft";
        charInfo[8]="Racial Feats:\n";
        charInfo[8]+="-Gnome Cunning: Adv. on all INT/WIS/CHA saves against magic"
                + "\n-Darkvision";
        charInfo[9]="Weapon/Armor Profs:";
        charInfo[10]="Tool Profs:";
        if(choice=="Forest Gnome"){
            dex=1;
            charInfo[8]+="-Know 'Minor Illusion(cantrip)': CHA is spellcasting "
                    + "ability for this cantrip.\n-Can communicate simple ideas"
                    + " to Small and smaller beasts.";
        }
        else{
            con=1;
            charInfo[8]+="\n-Add double your proficiency to checks related to m"
                    + "agic items, alchemical objects, or technological devices"
                    + ".\n-Tinker: Proficient with artisans tools(tinker's tool"
                    + "s). Spend 1 hour and 10GP worth of materials to construc"
                    + "t a tiny clockwork device. Device stops working after 24"
                    + "hrs unless you spend 1hr repairing it. Dismantaling recl"
                    + "aims materials. Can have up to 3 devices at one time. De"
                    + "vices: Clockwork toy(animal), Fire starter(produces smal"
                    + "l flame), Music Box(plays a single song)";
            charInfo[10]+="\nArtisans(Tinker's Tools)";
        }
        int twoDFour=roll.d4()+roll.d4();
        int height=35;
        int weight=35;
        height+=twoDFour;
        weight+=twoDFour;
        int feet=height/12;
        int inches=height%12;
        charInfo[28]=""+feet+"'"+inches+"\"";
        charInfo[29]=""+weight+" lbs";
    }
    public void halfElfRace(){
        String[] abils = {"Strength","Dexterity","Constitution","Intelligence",
            "Wisdom","Charisma"};
        String[] skills = {"Acrobatics","Animal Handling","Arcana","Athletics",
            "Deception","History","Insight","Intimidation","Investigation","Med"
                + "icine","Nature","Perception","Performance","Persuasion","Rel"
                + "igion","Sleight of Hand","Stealth","Survival"};
        cha=2;
        String abil1=null,abil2=null;
        
        abil1=JOptionPane.showInputDialog(null,"You get to choose two abili"
                    + "ties to improve by 1\n Choose your first:","Ability Impr"
                            + "ovement",JOptionPane.PLAIN_MESSAGE,null,abils,
                    0).toString();
        abil2=JOptionPane.showInputDialog(null,"Choose your second:","Abili"
                + "ty Improvement",JOptionPane.PLAIN_MESSAGE,null,abils,
                0).toString();
        if(abil1=="Strength"){
            str=1;
            if(abil2=="Strength"){
                str+=1;
            }
        }
        if(abil1=="Dexterity"){
            dex=1;
            if(abil2=="Dexterity"){
                dex+=1;
            }
        }
        if(abil1=="Constitution"){
            con=1;
            if(abil2=="Constitution"){
                con+=1;
            }
        }
        if(abil1=="Intelligence"){
            intel=1;
            if(abil2=="Intelligence"){
                intel+=1;
            }
        }
        if(abil1=="Wisdom"){
            wis=1;
            if(abil2=="Wisdom"){
                wis+=1;
            }
        }
        if(abil1=="Charisma"){
            cha+=1;
            if(abil2=="Charisma"){
                cha+=1;
            }
        }
        charInfo[6]="Half-Elf";
        charInfo[7]="30ft";
        charInfo[8]="Racial Feats:\n";
        charInfo[8]+="-Immune to magic sleep effects.\n-Adv. on saves against be"
                + "ing charmed\n-Darkvision";
        String choice2;
        String choice1=JOptionPane.showInputDialog(null,"Choose two skills to b"
                + "e proficient in, first skill:", "Skills",
                JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
        boolean i = false;
        do{
            if(i==false){
                choice2=JOptionPane.showInputDialog(null,"Second skill:", "Skil"
                        + "ls",JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
                i=true;
            }
            else{
                choice2=JOptionPane.showInputDialog(null,"You've already"
                        + " picked "+choice1+" Try again", "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
            }
        }
        while(choice2==choice1);
        charInfo[8]+="\n-Proficient in "+choice1+" and "+choice2;
        charInfo[9]="Weapon/Armor Profs:";
        charInfo[10]="Tool Profs:";
        int twoDEight=roll.d8()+roll.d8();
        int twoDFour=roll.d4()+roll.d4();
        int height=57;
        int weight=110;
        height+=twoDEight;
        weight+=twoDEight*twoDFour;
        int feet=height/12;
        int inches=height%12;
        charInfo[28]=""+feet+"'"+inches+"\"";
        charInfo[29]=""+weight+" lbs";
    }
    public void halfOrcRace(){
        str=2;con=1;
        charInfo[6]="Half-Orc";
        charInfo[7]="30ft";
        charInfo[8]="Racial Feats:\n";
        charInfo[8]+="-Darkvision\n-Menacing: Proficient in Intimidation\n-Relen"
                + "tless Endurance: When you drop to 0HP but not killed outrigh"
                + "t, drop to 1 instead (1/Long Rest)\n-Saveage Attacks: On CRI"
                + "T roll ONE of the weapon's DMG die an additional time";
        charInfo[9]="Weapon/Armor Profs:";
        charInfo[10]="Tool Profs:";
        int twoDTen=roll.d10()+roll.d10();
        int twoDSix=roll.d6()+roll.d6();
        int height=58;
        int weight=140;
        height+=twoDTen;
        weight+=twoDTen*twoDSix;
        int feet=height/12;
        int inches=height%12;
        charInfo[28]=""+feet+"'"+inches+"\"";
        charInfo[29]=""+weight+" lbs";
    }
    public void tieflingRace(){
        intel=1;cha=2;
        charInfo[6]="Tiefling";
        charInfo[7]="30ft";
        charInfo[8]="Racial Feats:\n";
        charInfo[8]+="-Darkvision\n-Hellish Resistence: Resistence to fire\n-Inf"
                + "ernal Legacy: Know 'Thaumaturgy'(cantrip); Lvl 3 know 'Helli"
                + "sh Rebuke'(1/day, 2nd Lvl); Lvl 5 'Darkness'(1/day). Charism"
                + "a is spellcasting ability for these spells.";
        charInfo[9]="Weapon/Armor Profs:";
        charInfo[10]="Tool Profs:";
        int twoDEight=roll.d8()+roll.d8();
        int twoDFour=roll.d4()+roll.d4();
        int height=57;
        int weight=110;
        height+=twoDEight;
        weight+=twoDEight*twoDFour;
        int feet=height/12;
        int inches=height%12;
        charInfo[28]=""+feet+"'"+inches+"\"";
        charInfo[29]=""+weight+" lbs";
    }
    
    public void barbarianClass(){
        String[] skills = {"Animal Handling","Athletics","Intimidation","Nature"
                + "","Perception","Survival"};
        attrib[0]+=str;//Priority:str,con,dex,int,wis,cha
        charInfo[0]=""+attrib[0];
        attrib[1]+=con;
        charInfo[1]=""+attrib[1];
        attrib[2]+=dex;
        charInfo[2]=""+attrib[2];
        attrib[3]+=intel;
        charInfo[3]=""+attrib[3];
        attrib[4]+=wis;
        charInfo[4]=""+attrib[4];
        attrib[5]+=cha;
        charInfo[5]=""+attrib[5];
        String choice2;
        String choice1=JOptionPane.showInputDialog(null,"Choose two skills to b"
                + "e proficient in, first skill:", "Skills",
                JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
        boolean i = false;
        do{
            if(i==false){
                choice2=JOptionPane.showInputDialog(null,"Second skill:", "Skil"
                        + "ls",JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
                i=true;
            }
            else{
                choice2=JOptionPane.showInputDialog(null,"You've already"
                        + " picked "+choice1+" Try again", "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
            }
        }
        while(choice2==choice1);
        
        charInfo[8]+="\nClass Feats:\n-Rage:(2/Long Rest)Enter Rage as a bonus a"
                + "ction on your turn(1min). While in rage gain the following:"
                + "\n*Adv. on STR Checks/Saves\n*Bonus to DMG rolls w/ melee we"
                + "apons using STR(see Rage DMG in chart)\n*Resistence to bludg"
                + "eoning, piercing, and slashing DMG.\n*Cannot cast/concentrat"
                + "e on spells during rage.\n*Rage ends early if knocked uncons"
                + "cious or if your turn ends and you haven't attacked a hostil"
                + "e creature since last turn or haven't taken any DMG since th"
                + "en or by choice.\n-Unarmored Defense: While not wearing armo"
                + "r AC=10+Dex mod+Con mod.(can use a shield and still gain thi"
                + "s benefit\n-Proficient in "+choice1+ " and "+choice2+"\n-Sav"
                + "ing throws: STR and CON";//class feats
        charInfo[9]+="-Simple weapons\n-Martial weapons\n-Light armor\n-Medium"
                + " armor\n-Shields";//weapon/armor profs
        //no tools
        charInfo[11]=""+prof;
        strMod=attribMod(attrib[0]);
        conMod=attribMod(attrib[1]);
        dexMod=attribMod(attrib[2]);
        intMod=attribMod(attrib[3]);
        wisMod=attribMod(attrib[4]);
        chaMod=attribMod(attrib[5]);
        charInfo[12]=""+strMod;
        charInfo[13]=""+dexMod;
        charInfo[14]=""+conMod;
        charInfo[15]=""+intMod;
        charInfo[16]=""+wisMod;
        charInfo[17]=""+chaMod;
        hp+=12+conMod;
        charInfo[18]=""+hp;
        charInfo[19]="d12";
        charInfo[22]=alignment;
        charInfo[30]="Barbarian";
    }
    public void bardClass(){
        String[] skills = {"Acrobatics","Animal Handling","Arcana","Athletics",
            "Deception","History","Insight","Intimidation","Investigation","Med"
                + "icine","Nature","Perception","Performance","Persuasion","Rel"
                + "igion","Sleight of Hand","Stealth","Survival"};
        attrib[0]+=cha;//Priority:cha,dex,str,con,int,wis
        charInfo[0]=""+attrib[0];
        attrib[1]+=dex;
        charInfo[1]=""+attrib[1];
        attrib[2]+=str;
        charInfo[2]=""+attrib[2];
        attrib[3]+=con;
        charInfo[3]=""+attrib[3];
        attrib[4]+=intel;
        charInfo[4]=""+attrib[4];
        attrib[5]+=wis;
        charInfo[5]=""+attrib[5];
        String choice2="",choice3="";
        String choice1=JOptionPane.showInputDialog(null,"Choose three skills to"
                + " be proficient in, first skill:", "Skills",
                JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
        boolean i = false;
        do{
            if(i==false){
                choice2=JOptionPane.showInputDialog(null,"Second skill:", "Skil"
                        + "ls",JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
                i=true;
            }
            else{
                choice2=JOptionPane.showInputDialog(null,"You've already"
                        + " picked "+choice1+" Try again", "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
            }
        }
        while(choice2==choice1);
        boolean j=false;
        do{
            if(j==false){
                choice3=JOptionPane.showInputDialog(null,"Third skill:", "S"
                        + "kills",JOptionPane.PLAIN_MESSAGE, null,skills,
                            0).toString();
                j=true;
            }
            else{
                choice3=JOptionPane.showInputDialog(null,"You've already pi"
                        + "cked "+choice1+" and "+choice2, "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
            }
        }
        while(choice3==choice2||choice3==choice1);
        
        charInfo[8]+="\n-Bardic Inspiration: Use a bonus action and choose one "
                + "creature to gain an Inspiration die(d6;d8@Lvl5;d10@Lvl10;d12"
                + "@Lvl15). Once within 10 minutes the creature can roll the di"
                + "e and add it to an ATT/Check/Save(can use this a number of t"
                + "imes equal to your CHA modifier/Long Rest)\n-Proficient in "
                + ""+choice1+", "+choice2+", and "+choice3+"\n-Saving throws: D"
                + "EX and CHA";
        
        charInfo[9]+="\n-Simple weapons\n-Hand crossbow\n-Longsword\n-Rapiers\n"
                + "-Shortsword\n-Light armor";
        charInfo[10]+="\nThree musical instruments of choice.";
        charInfo[11]=""+prof;
        chaMod=attribMod(attrib[0]);
        dexMod=attribMod(attrib[1]);
        strMod=attribMod(attrib[2]);
        conMod=attribMod(attrib[3]);
        intMod=attribMod(attrib[4]);
        wisMod=attribMod(attrib[5]);
        charInfo[12]=""+strMod;
        charInfo[13]=""+dexMod;
        charInfo[14]=""+conMod;
        charInfo[15]=""+intMod;
        charInfo[16]=""+wisMod;
        charInfo[17]=""+chaMod;
        hp+=8+conMod;
        charInfo[18]=""+hp;
        charInfo[19]="d8";
        charInfo[22]=alignment;
        charInfo[30]="Bard";
        
    }
    public void clericClass(){
        String[] skills = {"History","Insight","Medicine","Persuasion","Religio"
                + "n"};
        String[] domain ={"Knowledge","Life","Light","Nature","Tempest","Tricke"
                + "ry","War"};
        attrib[0]+=wis;//Priority:wis,cha,str,dex,con,int
        charInfo[0]=""+attrib[0];
        attrib[1]+=cha;
        charInfo[1]=""+attrib[1];
        attrib[2]+=str;
        charInfo[2]=""+attrib[2];
        attrib[3]+=dex;
        charInfo[3]=""+attrib[3];
        attrib[4]+=con;
        charInfo[4]=""+attrib[4];
        attrib[5]+=intel;
        charInfo[5]=""+attrib[5];
        String choice2;
        String choice1=JOptionPane.showInputDialog(null,"Choose two skills to b"
                + "e proficient in, first skill:", "Skills",
                JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
        boolean i = false;
        do{
            if(i==false){
                choice2=JOptionPane.showInputDialog(null,"Second skill:", "Skil"
                        + "ls",JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
                i=true;
            }
            else{
                choice2=JOptionPane.showInputDialog(null,"You've already"
                        + " picked "+choice1+" Try again", "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
            }
        }
        while(choice2==choice1);
        
        charInfo[8]+="\nClass Feats:\n-Divine Domain:";
        
        String domainChoice=JOptionPane.showInputDialog(null,"Choose your Domai"
                + "n", "Divine Domain",JOptionPane.PLAIN_MESSAGE, null,domain,
                0).toString();
        if(domainChoice=="Knowledge"){
            boolean k = false;
            String[] domSkills={"Arcana","History","Nature","Religion"};
            String dom1="";String dom2="";
            do{
                if(k==false){
                    dom1=JOptionPane.showInputDialog(null,"Second skill:", "Dom"
                            + "ain skills",JOptionPane.PLAIN_MESSAGE, null,
                            domSkills,0).toString();
                    k=true;
                }
                else{
                    dom2=JOptionPane.showInputDialog(null,"You've already picke"
                            + "d "+dom1+" Try again", "Domain skills",
                            JOptionPane.PLAIN_MESSAGE, null,domSkills,
                            0).toString();
                }
            }
            while(dom2==dom1);
            charInfo[8]+="(Knowledge) Know 'Command' and 'Identify' spells, lea"
                    + "rn two languages of choice, and your proficiency bonus f"
                    + "or "+dom1+" and "+dom2+" is doubled for any ability chec"
                    + "k including these skills";
            
        }
        if(domainChoice=="Life"){
            charInfo[8]+="(Life) Know 'Bless' and 'Cure Wounds' spells, when us"
                    + "ing a healing spell of 1st Lvl or higher regain an addit"
                    + "ional HP equal to 2 + the spell's Lvl";
            charInfo[9]+="\n-Heavy armor";
        }
        if(domainChoice=="Light"){
            charInfo[8]+="(Light) Know 'Buring hands' and  'Faerie Fire' spells"
                    + ", know 'Light' cantrip. when you are attacked by a creat"
                    + "ure within 30ft that you can see impose disadvantage on "
                    + "the ATT roll unless creature is immune to being blinded("
                    + "can use this a number of times equal to your WIS modifie"
                    + "r/Long Rest, minimum of once)";
            
        }
        if(domainChoice=="Nature"){
            String[] nat = {"Animal Handling","Nature","Survival"};
            String natChoice=JOptionPane.showInputDialog(null,"Choose a skill t"
                    + "o be proficient in:", "Nature Skills",
                    JOptionPane.PLAIN_MESSAGE, null,nat,0).toString();
            charInfo[8]+="(Nature) Know 'Animal Friendship' and 'Speak with ani"
                    + "mals' spells, learn on druid cantrip of choice.\nProfici"
                    + "ent in "+natChoice;
            charInfo[9]+="\n-Heavy armor";
        }
        if(domainChoice=="Tempest"){
            charInfo[8]+="(Tempest) Know 'Fog Cloud' and 'Thunderwave' spells. "
                    + "When a creature within 5ft of you that you can see hits "
                    + "you with an ATT you can use reaction to cause the creatu"
                    + "re to make a DEX save; Creature takes 2d8 on fail and ha"
                    + "lf DMG on save";
            charInfo[9]+="\n-Martial Weapons\n-Heavy Armor";
                    
        }
        if(domainChoice=="Trickery"){
            charInfo[8]+="(Trickery) Know 'Charm person' and 'Disguise Self' sp"
                    + "ells. You can choose one willing creature other than you"
                    + "rself to give advante on Stealth checks(1hr or until use"
                    + "d again)";
        }
        if(domainChoice=="War"){
            charInfo[8]+="(War) Know 'Divine favor' and 'Shield of faith' spell"
                    + "s. When you use the ATT action you can make one weapon a"
                    + "ttack as a bonus action(you can use this a number of tim"
                    + "es equal to WIS modifier, mininum once/Long Rest)";
            charInfo[9]+="\n-Martial weapons\n-Heavy armor";
        }
        
        charInfo[8]+="\n-Saving throws:WIS and CHA\n-Proficient in"
                + " "+choice1+" and "+choice2;
        charInfo[9]+="\n-Simple weapons\n-Light armor\n-Medium armor\n-Shields";
        charInfo[11]=""+prof;
        wisMod=attribMod(attrib[0]);
        chaMod=attribMod(attrib[1]);
        strMod=attribMod(attrib[2]);
        dexMod=attribMod(attrib[3]);
        conMod=attribMod(attrib[4]);
        intMod=attribMod(attrib[5]);
        charInfo[12]=""+strMod;
        charInfo[13]=""+dexMod;
        charInfo[14]=""+conMod;
        charInfo[15]=""+intMod;
        charInfo[16]=""+wisMod;
        charInfo[17]=""+chaMod;
        hp+=8+conMod;
        charInfo[18]=""+hp;
        charInfo[19]="d8";
        charInfo[22]=alignment;
        charInfo[30]="Cleric";
    }
    public void druidClass(){
        String[] skills = {"Arcana","Animal handling","Insight","Medicine","Nat"
                + "ure","Religion","Survival"};
        attrib[0]+=wis;//Priority:wis,int,dex,str,cha,con
        charInfo[0]=""+attrib[0];
        attrib[1]+=intel;
        charInfo[1]=""+attrib[1];
        attrib[2]+=dex;
        charInfo[2]=""+attrib[2];
        attrib[3]+=str;
        charInfo[3]=""+attrib[3];
        attrib[4]+=cha;
        charInfo[4]=""+attrib[4];
        attrib[5]+=con;
        charInfo[5]=""+attrib[5];
        
        String choice2;
        String choice1=JOptionPane.showInputDialog(null,"Choose two skills to b"
                + "e proficient in, first skill:", "Skills",
                JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
        boolean i = false;
        do{
            if(i==false){
                choice2=JOptionPane.showInputDialog(null,"Second skill:", "Skil"
                        + "ls",JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
                i=true;
            }
            else{
                choice2=JOptionPane.showInputDialog(null,"You've already"
                        + " picked "+choice1+" Try again", "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
            }
        }
        while(choice2==choice1);
        
        charInfo[8]+="\n-Druidic: You know Druidic, the secret language of Drui"
                + "ds. You can use it to leave hidden messages. You and others "
                + "who know this language automatically spot such messages. Oth"
                + "ers spot the message's presence with a DC15 WIS(Perception) "
                + "check but can't decipher without magic.\n-Proficient in "+
                choice1+" and "+choice2+"\n-Saving Throws: INT and WIS";
        charInfo[9]+="\n-Clubs\n-Daggers\n-Darts\n-Javelins\n-Maces\n-Quarterst"
                + "affs\n-Scimitars\n-Sickles\n-Slings\n-Spears\n-Light armor\n"
                + "-Medium armor\n-Shields\n*Druids will not wear shields or ar"
                + "mor made of metal.";
        charInfo[10]+="\n-Herbalism kit";
        charInfo[11]=""+prof;
        wisMod=attribMod(attrib[0]);
        intMod=attribMod(attrib[1]);
        dexMod=attribMod(attrib[2]);
        strMod=attribMod(attrib[3]);
        chaMod=attribMod(attrib[4]);
        conMod=attribMod(attrib[5]);
        charInfo[12]=""+strMod;
        charInfo[13]=""+dexMod;
        charInfo[14]=""+conMod;
        charInfo[15]=""+intMod;
        charInfo[16]=""+wisMod;
        charInfo[17]=""+chaMod;
        hp+=8+conMod;
        charInfo[18]=""+hp;
        charInfo[19]="d8";
        charInfo[22]=alignment;
        charInfo[30]="Druid";
    }
    public void fighterClass(){
        String[] skills = {"Acrobatics","Animal handling","Athletics","History"
                + "","Insight","Intimidation","Perception","Survival"};
        String[] fightingStyle={"Archery","Defense","Dueling","Great Weapon Fig"
                + "hting","Protection","Two-Weapon Fighting"};
        attrib[0]+=str;//Priority:str,dex,con,cha,wis,int
        charInfo[0]=""+attrib[0];
        attrib[1]+=dex;
        charInfo[1]=""+attrib[1];
        attrib[2]+=con;
        charInfo[2]=""+attrib[2];
        attrib[3]+=cha;
        charInfo[3]=""+attrib[3];
        attrib[4]+=wis;
        charInfo[4]=""+attrib[4];
        attrib[5]+=intel;
        charInfo[5]=""+attrib[5];
        
        String choice2;
        String choice1=JOptionPane.showInputDialog(null,"Choose two skills to b"
                + "e proficient in, first skill:", "Skills",
                JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
        boolean i = false;
        do{
            if(i==false){
                choice2=JOptionPane.showInputDialog(null,"Second skill:", "Skil"
                        + "ls",JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
                i=true;
            }
            else{
                choice2=JOptionPane.showInputDialog(null,"You've already"
                        + " picked "+choice1+" Try again", "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
            }
        }
        while(choice2==choice1);
        
        String fight = JOptionPane.showInputDialog(null,"Choose two skills to b"
                + "e proficient in, first skill:", "Skills",
                JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
        charInfo[8]+="-Fighting Style:";
        if(fight=="Archery"){
            charInfo[8]+="(Archery) +2 to ATT rolls made with ranged weapons.";
        }
        if(fight=="Defense"){
            charInfo[8]+="(Defense) +1 to AC while wearing armor.";
        }
        if(fight=="Dueling"){
            charInfo[8]+="(Dueling) When wielding a melee weaon in one hand and"
                    + " no other weapon, +2 bonus to DMG rolls with that weapon"
                    + "";
        }
        if(fight=="Great Weapon Fighting"){
            charInfo[8]+="(Great Weapon Fighting) When you roll a 1 or 2 on a D"
                    + "MG die for an ATT you make with a two-handed melee weapo"
                    + "n, you can reroll the die and must use the new roll.";
        }
        if(fight=="Protection"){
            charInfo[8]+="(Protection) When a creature you can see attacks a ta"
                    + "rget other than you that is within 5ft of you, you can u"
                    + "se your reaction to impose disadvantage on the attack ro"
                    + "ll. *You must be wielding a shield.";
        }
        if(fight=="Two-Weapon Fighting"){
            charInfo[8]+="(Two-Weapon Fighting) When you engage in tww-weapon f"
                    + "ighting you can add your ability modifier to the DMG of "
                    + "the second attack";
        }
        charInfo[8]+="\n-Second Wind:On your turn you can use a bonus action to"
                + " regain HP equal to 1d10 + your fighter Lvl.(1/Short Rest)."
                + "\n-Proficent in "+choice1+" and "+choice2+"\n-Saving Throws:"
                + " STR and CON";
        charInfo[9]+="\n-Simple weapons\n-Martial weapons\n-All armor\n-Shields"
                + "";
        charInfo[10]+="";
        charInfo[11]=""+prof;
        strMod=attribMod(attrib[0]);
        dexMod=attribMod(attrib[1]);
        conMod=attribMod(attrib[2]);
        chaMod=attribMod(attrib[3]);
        wisMod=attribMod(attrib[4]);
        intMod=attribMod(attrib[5]);
        charInfo[12]=""+strMod;
        charInfo[13]=""+dexMod;
        charInfo[14]=""+conMod;
        charInfo[15]=""+intMod;
        charInfo[16]=""+wisMod;
        charInfo[17]=""+chaMod;
        hp+=10+conMod;
        charInfo[18]=""+hp;
        charInfo[19]="d10";
        charInfo[22]=alignment;
        charInfo[30]="Fighter";
    }
    public void monkClass(){
        String[] skills ={"Acrobatics","Athletics","History","Insight","Religio"
                + "n","Stealth"};
        String[] artTools={"Alchemist's Supplies","Brewer's Supplies","Caliligr"
                + "apher's Supplies","Carpenter's Tools","Cartographers's tool"
                + "s","Cobbler's tools","Cook's tools","Glassblowser's tools",""
                + "Jeweler's tools","Leatherworker's tools","Mason's tools","Pa"
                + "inter's tools","Potter's tools","Smith's tools","Tinker's to"
                + "ols","Weaver's tools","Woodcarving tools"};
        attrib[0]+=dex;//Priority:dex,wis,str,con,int,cha
        charInfo[0]=""+attrib[0];
        attrib[1]+=wis;
        charInfo[1]=""+attrib[1];
        attrib[2]+=str;
        charInfo[2]=""+attrib[2];
        attrib[3]+=con;
        charInfo[3]=""+attrib[3];
        attrib[4]+=intel;
        charInfo[4]=""+attrib[4];
        attrib[5]+=cha;
        charInfo[5]=""+attrib[5];
        
        String tools=JOptionPane.showInputDialog(null,"Choose a set of art too"
                + "ls to be proficient with:", "Artisan's Tools",
                JOptionPane.PLAIN_MESSAGE, null,artTools,0).toString();
        
        String choice2;
        String choice1=JOptionPane.showInputDialog(null,"Choose two skills to b"
                + "e proficient in, first skill:", "Skills",
                JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
        
        boolean i = false;
        do{
            if(i==false){
                choice2=JOptionPane.showInputDialog(null,"Second skill:", "Skil"
                        + "ls",JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
                i=true;
            }
            else{
                choice2=JOptionPane.showInputDialog(null,"You've already"
                        + " picked "+choice1+" Try again", "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
            }
        }
        while(choice2==choice1);
        
        charInfo[8]+="\n-Unarmored Defense: While wearing no armor and not wiel"
                + "ding a shield, AC=10+DEXmod + WISmod.\n-Martial Arts: Gain t"
                + "he following benefits while wielding Simple, one-handed mele"
                + "e weapon that isn't a heavy weapon; Can use DEX instead of S"
                + "TR for ATT/DMG rolls of unarmed strikes and monk weapons, Ca"
                + "n roll a d4 in place of unarmed or monk weapon DMG, When you"
                + " use the ATT action with unarmed strike or a monk weapon you"
                + " can make on unarmed strike as a bonus action.\n-Proficient "
                + "in "+choice1+" and "+choice2+"\n-Saving Throws: STR and DEX";
        charInfo[9]+="\n-Simple Weapons\n-Shortswords";
        charInfo[10]+="\n-"+tools;
        charInfo[11]=""+prof;
        dexMod=attribMod(attrib[0]);
        wisMod=attribMod(attrib[1]);
        strMod=attribMod(attrib[2]);
        conMod=attribMod(attrib[3]);
        intMod=attribMod(attrib[4]);
        chaMod=attribMod(attrib[5]);
        charInfo[12]=""+strMod;
        charInfo[13]=""+dexMod;
        charInfo[14]=""+conMod;
        charInfo[15]=""+intMod;
        charInfo[16]=""+wisMod;
        charInfo[17]=""+chaMod;
        hp+=8+conMod;
        charInfo[18]=""+hp;
        charInfo[19]="d8";
        charInfo[22]=alignment;
        charInfo[30]="Monk";
    }
    public void paladinClass(){
        String[] skills ={"Athletics","Insight","Intimidation","Medicine","Pers"
                + "uasion","Stealth"};
        attrib[0]+=str;//Priority:str,dex,cha,con,wis,int,
        charInfo[0]=""+attrib[0];
        attrib[1]+=dex;
        charInfo[1]=""+attrib[1];
        attrib[2]+=cha;
        charInfo[2]=""+attrib[2];
        attrib[3]+=con;
        charInfo[3]=""+attrib[3];
        attrib[4]+=wis;
        charInfo[4]=""+attrib[4];
        attrib[5]+=intel;
        charInfo[5]=""+attrib[5];
        
        String choice2;
        String choice1=JOptionPane.showInputDialog(null,"Choose two skills to b"
                + "e proficient in, first skill:", "Skills",
                JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
        
        boolean i = false;
        do{
            if(i==false){
                choice2=JOptionPane.showInputDialog(null,"Second skill:", "Skil"
                        + "ls",JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
                i=true;
            }
            else{
                choice2=JOptionPane.showInputDialog(null,"You've already"
                        + " picked "+choice1+" Try again", "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
            }
        }
        while(choice2==choice1);
        
        charInfo[8]+="\n-Divine Sense: As an action(1 turn) you can open your a"
                + "wareness to detect the location of any celestial, fiend, or "
                + "undead within 60ft of you that is not behind total cover. Yo"
                + "u know the type, but not it's identity. You can also detect "
                + "the presense of any place or object that has been consecrate"
                + "d or desecrated, as with the 'Hallow' spell.\n-Lay on Hands:"
                + " You have a pool of healing power equal to 5 x Pally Lvl. As"
                + " an action you can touch a creature and restore a number of "
                + "HP to that creature up to the max remaining in your pool. Al"
                + "ternately you can spend 5 points from your pool and cure one"
                + " disease or one poison effect. *No effect on undead/construc"
                + "ts.\n-Proficient in "+choice1+" and "+choice2+"\n-Saving "
                + "Throws: WIS and CHA";
        charInfo[9]+="\n-Simple weapons\n-Martial weapons\n-All armor\n-Shields"
                + "";
        charInfo[11]=""+prof;
        strMod=attribMod(attrib[0]);
        dexMod=attribMod(attrib[1]);
        chaMod=attribMod(attrib[2]);
        conMod=attribMod(attrib[3]);
        wisMod=attribMod(attrib[4]);
        intMod=attribMod(attrib[5]);
        charInfo[12]=""+strMod;
        charInfo[13]=""+dexMod;
        charInfo[14]=""+conMod;
        charInfo[15]=""+intMod;
        charInfo[16]=""+wisMod;
        charInfo[17]=""+chaMod;
        hp+=10+conMod;
        charInfo[18]=""+hp;
        charInfo[19]="d10";
        charInfo[22]=alignment;
        charInfo[30]="Paladin";
    }
    public void rangerClass(){
        String[] skills = {"Animal handling","Athletics","Insight","Investigati"
                + "on","Nature","Perception","Stealth","Survival"};
        String[] strOrDex={"Strength","Dexterity"};
        String[] favoredEnemy ={"Aberrations","Beasts","Celestials","Constructs"
                + "","Dragons","Elementals","Fey","Fiends","Giants","Monstrosit"
                + "ies","Oozes","Plants","Undead"};
        String[] naturalExplorer={"Arctic","Coast","Desert","Forest","Grassland"
                + "","Mountain","Swamp","Underdark"};
        String a = JOptionPane.showInputDialog(null,"Primary ability?", "Primar"
                + "y Ability",JOptionPane.PLAIN_MESSAGE, null,strOrDex,
                0).toString();
        if(a=="Dexterity"){
            attrib[0]+=dex;//Priority:dex,wis,intel,con,str,cha
            charInfo[0]=""+attrib[0];
            attrib[1]+=wis;
            charInfo[1]=""+attrib[1];
            attrib[2]+=intel;
            charInfo[2]=""+attrib[2];
            attrib[3]+=con;
            charInfo[3]=""+attrib[3];
            attrib[4]+=str;
            charInfo[4]=""+attrib[4];
            attrib[5]+=cha;
            charInfo[5]=""+attrib[5];
        }
        else{
            attrib[0]+=str;//Priority:str,wis,dex,con,intel,cha
            charInfo[0]=""+attrib[0];
            attrib[1]+=wis;
            charInfo[1]=""+attrib[1];
            attrib[2]+=dex;
            charInfo[2]=""+attrib[2];
            attrib[3]+=con;
            charInfo[3]=""+attrib[3];
            attrib[4]+=intel;
            charInfo[4]=""+attrib[4];
            attrib[5]+=cha;
            charInfo[5]=""+attrib[5];
        }
        
        String choice2="",choice3="";
        String choice1=JOptionPane.showInputDialog(null,"Choose three skills to"
                + " be proficient in, first skill:", "Skills",
                JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
        boolean i = false;
        do{
            if(i==false){
                choice2=JOptionPane.showInputDialog(null,"Second skill:", "Skil"
                        + "ls",JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
                i=true;
            }
            else{
                choice2=JOptionPane.showInputDialog(null,"You've already"
                        + " picked "+choice1+" Try again", "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
            }
        }
        while(choice2==choice1);
        boolean j=false;
        do{
            if(j==false){
                choice3=JOptionPane.showInputDialog(null,"Third skill:", "S"
                        + "kills",JOptionPane.PLAIN_MESSAGE, null,skills,
                            0).toString();
                j=true;
            }
            else{
                choice3=JOptionPane.showInputDialog(null,"You've already pi"
                        + "cked "+choice1+" and "+choice2, "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
            }
        }
        while(choice3==choice2||choice3==choice1);
        
        String enemy = JOptionPane.showInputDialog(null,"Choose a Favored Enemy", "Favored Ene"
                + "my",JOptionPane.PLAIN_MESSAGE, null,favoredEnemy,
                0).toString();
        
        String explorer = JOptionPane.showInputDialog(null,"Choose a favored te"
                + "rrian", "Terrian",JOptionPane.PLAIN_MESSAGE, null,
                naturalExplorer,0).toString();
        
        
        charInfo[8]+="\n-Favored Enemy: ("+enemy+") Adv. on WIS(Survival) checks"
                + " to track favored enemy. Adv. on INT checks to recall inform"
                + "ation about them. Learn language of choice that is spoken by"
                + " your favored enemy.\n-Natural Explorer: ("+explorer+") When"
                + " you make a WIS or INT check related to your favored terrian"
                + ", your proficiency bonus is doubled if you're using a skill "
                + "you're proficient in. While traveling for an hour or more in"
                + " your favored terrian: Difficult terrian doesn't slow your g"
                + "roup, group cannot become lost, remain alert even when engag"
                + "ed in another activity, when traveling alone move stealthily"
                + " at a normal pace, twice the yield when foraging for food, w"
                + "hile tracking creatures learn their exact number, sizes, and"
                + " how long ago they were here. \n-Proficient in "+choice1+", "
                + ""+choice2+", and "+choice3+"\n-Saving Throws: STR and DEX";
        charInfo[9]+="\n-Simple weapons\n-Martial weapons\n-Light armor\n-Medium"
                + " armor\n-Shields";
        charInfo[11]=""+prof;
        dexMod=attribMod(attrib[0]);
        wisMod=attribMod(attrib[1]);
        strMod=attribMod(attrib[2]);
        intMod=attribMod(attrib[3]);
        chaMod=attribMod(attrib[4]);
        conMod=attribMod(attrib[5]);
        charInfo[12]=""+strMod;
        charInfo[13]=""+dexMod;
        charInfo[14]=""+conMod;
        charInfo[15]=""+intMod;
        charInfo[16]=""+wisMod;
        charInfo[17]=""+chaMod;
        hp+=10+conMod;
        charInfo[18]=""+hp;
        charInfo[19]="d10";
        charInfo[22]=alignment;
        charInfo[30]="Ranger";
    }
    public void rogueClass(){
        String[] skills = {"Acrobatics","Athletics","Deception","Insight","Inti"
                + "midation","Investigation","Perception","Performance","Persua"
                + "sion","Sleight of Hand","Stealth"};
        attrib[0]+=dex;//Priority:dex,int,wis,str,cha,con
        charInfo[0]=""+attrib[0];
        attrib[1]+=intel;
        charInfo[1]=""+attrib[1];
        attrib[2]+=wis;
        charInfo[2]=""+attrib[2];
        attrib[3]+=str;
        charInfo[3]=""+attrib[3];
        attrib[4]+=cha;
        charInfo[4]=""+attrib[4];
        attrib[5]+=con;
        charInfo[5]=""+attrib[5];
        
        String choice2="",choice3="",choice4="";
        String choice1=JOptionPane.showInputDialog(null,"Choose Four skills to "
                + "be proficient in, first skill:", "Skills",
                JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
        
        boolean i = false;
        do{
            if(i==false){
                choice2=JOptionPane.showInputDialog(null,"Second skill:", "Skil"
                        + "ls",JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
                i=true;
            }
            else{
                choice2=JOptionPane.showInputDialog(null,"You've already"
                        + " picked "+choice1+" Try again", "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
            }
        }
        while(choice2==choice1);
        boolean j=false;
        do{
            if(j==false){
                choice3=JOptionPane.showInputDialog(null,"Third skill:", "S"
                        + "kills",JOptionPane.PLAIN_MESSAGE, null,skills,
                            0).toString();
                j=true;
            }
            else{
                choice3=JOptionPane.showInputDialog(null,"You've already pi"
                        + "cked "+choice1+" and "+choice2, "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
            }
        }
        while(choice3==choice2||choice3==choice1);
        boolean k=false;
        do{
            if(k==false){
                choice4=JOptionPane.showInputDialog(null,"Fourth skill:", "S"
                        + "kills",JOptionPane.PLAIN_MESSAGE, null,skills,
                            0).toString();
                k=true;
            }
            else{
                choice4=JOptionPane.showInputDialog(null,"You've already pi"
                        + "cked "+choice1+", "+choice2+", and "+choice3, "Skill"
                        + "s", JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
            }
        }
        while(choice4==choice3||choice4==choice2||choice4==choice1);
        
        charInfo[8]+="\n-Expertise: Choose two of your skill proficiences or on"
                + "e skill proficiency and proficiency with Thieve's tools and "
                + "double the your proficiency bonus for these skills/tools.\n-"
                + "Sneak Attack: Once per turn you can deal and extra 1d6 DMG t"
                + "o one creature you hit with an ATT if you have Adv. on the A"
                + "TT roll. *Must use finesse or ranged weapon. You don't need "
                + "Adv. if another enemy of the target is within 5ft of it, tha"
                + "t enemy isn't incapacitated and you don't have Disadv. on th"
                + "e ATT roll.\n-Thieves' Cant: You know the secrect code of Th"
                + "ieves'.\n-Proficient in "+choice1+", "+choice2+", "+choice3+
                ", and "+choice4+"\n-Saving Throws: DEX and INT.";
        
        charInfo[9]+="\n-Simple weapons\n-Hand Crossbows\n-Longswords\n-Rapier"
                + "s\n-Shortswords\n-Light armor";
        charInfo[10]+="\n-Thieves' tools";
        charInfo[11]=""+prof;
        dexMod=attribMod(attrib[0]);
        intMod=attribMod(attrib[1]);
        wisMod=attribMod(attrib[2]);
        strMod=attribMod(attrib[3]);
        chaMod=attribMod(attrib[4]);
        conMod=attribMod(attrib[5]);
        charInfo[12]=""+strMod;
        charInfo[13]=""+dexMod;
        charInfo[14]=""+conMod;
        charInfo[15]=""+intMod;
        charInfo[16]=""+wisMod;
        charInfo[17]=""+chaMod;
        hp+=8+conMod;
        charInfo[18]=""+hp;
        charInfo[19]="d8";
        charInfo[22]=alignment;
        charInfo[30]="Rogue";
    }
    public void sorcererClass(){
        String[] skills = {"Arcana","Deception","Insight","Intimidation","Persu"
                + "asion"};
        String[] sorcOrigin={"Draconic Bloodline","Wild Magic"};
        attrib[0]+=cha;//Priority:cha,con,dex,int,wis,str
        charInfo[0]=""+attrib[0];
        attrib[1]+=con;
        charInfo[1]=""+attrib[1];
        attrib[2]+=dex;
        charInfo[2]=""+attrib[2];
        attrib[3]+=intel;
        charInfo[3]=""+attrib[3];
        attrib[4]+=wis;
        charInfo[4]=""+attrib[4];
        attrib[5]+=str;
        charInfo[5]=""+attrib[5];
        
        String choice2;
        String choice1=JOptionPane.showInputDialog(null,"Choose two skills to b"
                + "e proficient in, first skill:", "Skills",
                JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
        boolean i = false;
        do{
            if(i==false){
                choice2=JOptionPane.showInputDialog(null,"Second skill:", "Skil"
                        + "ls",JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
                i=true;
            }
            else{
                choice2=JOptionPane.showInputDialog(null,"You've already"
                        + " picked "+choice1+" Try again", "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
            }
        }
        while(choice2==choice1);
        
        String origin = JOptionPane.showInputDialog(null,"Choose your Sorcerous"
                + " Origin", "Sorcerous Origin",JOptionPane.PLAIN_MESSAGE, null,
                sorcOrigin,0).toString();
        
        charInfo[8]+="Sorcerous Origin: ";
        if(origin=="Draconic Bloodline"){
            String[] dragType = {"Black/Acid","Blue/Lightning","Brass/Fire","Br"
                    + "onze/Lighting","Copper/Acid","Gold/Fire","Green/Poison"
                    ,"Red/Fire","Silver/Cold","White/Cold"};
            String drag = JOptionPane.showInputDialog(null,"Choose your Dragon "
                    + "Ancestry", "Dragon Ancestry",JOptionPane.PLAIN_MESSAGE,
                    null,dragType,0).toString();
            charInfo[8]+="(Draconic BloodLine)("+drag+") You can speak/read/write"
                    + " Draconic. Additionally whenever you make a CHA check wh"
                    + "en interacting with dragons, your proficiency bonus is d"
                    + "oubled if it applies to the check.\n-Draconic Resilience"
                    + ": +1HP each Lvl. When wearing no armor AC=13+DEXmod";
            hp=1;
        }
        if(origin=="Wild Magic"){
            charInfo[8]+="(Wild Magic) Immediately after you cast a Sorcerer sp"
                    + "ell of 1st Lvl or higher, the DM can have you roll a d20"
                    + ". If you roll a 1, roll on the Wild Magic Surge Table to"
                    + " create a random magic effect.\n-Tides of Chaos: Gain Ad"
                    + "v. on one ATT/Check/Save (1/Long Rest). Anytime before y"
                    + "ou regain the use of this feature, the DM can have you r"
                    + "oll on the Wild Magic Surge table immediately after you "
                    + "cast a sorcerer spell of 1st Lvl or higher. You then reg"
                    + "ain the use of this feature.";
        }
        
        charInfo[8]+="\n-\n-Proficient in "+choice1+" and "+choice2+"\n-Saving Thr"
                + "ows: CON and CHA";
        charInfo[9]+="\n-Daggers\n-Darts\n-Slings\n-Quarterstaffs\n-Light Cross"
                + "bows";
        charInfo[11]=""+prof;
        chaMod=attribMod(attrib[0]);
        conMod=attribMod(attrib[1]);
        dexMod=attribMod(attrib[2]);
        intMod=attribMod(attrib[3]);
        wisMod=attribMod(attrib[4]);
        strMod=attribMod(attrib[5]);
        charInfo[12]=""+strMod;
        charInfo[13]=""+dexMod;
        charInfo[14]=""+conMod;
        charInfo[15]=""+intMod;
        charInfo[16]=""+wisMod;
        charInfo[17]=""+chaMod;
        hp+=6+conMod;
        charInfo[18]=""+hp;
        charInfo[19]="d6";
        charInfo[22]=alignment;
        charInfo[30]="Sorcerer";
    }
    public void warlockClass(){
        String[] skills = {"Arcana","Deception","History","Intimidation","Inves"
                + "tigation","Nature","Religion"};
        String[] otherPatron={"Archfey","Fiend","Great Old One"};
        attrib[0]+=cha;//Priority:cha,wis,dex,int,str,con
        charInfo[0]=""+attrib[0];
        attrib[1]+=wis;
        charInfo[1]=""+attrib[1];
        attrib[2]+=dex;
        charInfo[2]=""+attrib[2];
        attrib[3]+=intel;
        charInfo[3]=""+attrib[3];
        attrib[4]+=str;
        charInfo[4]=""+attrib[4];
        attrib[5]+=con;
        charInfo[5]=""+attrib[5];
        
        String choice2;
        String choice1=JOptionPane.showInputDialog(null,"Choose two skills to b"
                + "e proficient in, first skill:", "Skills",
                JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
        boolean i = false;
        do{
            if(i==false){
                choice2=JOptionPane.showInputDialog(null,"Second skill:", "Skil"
                        + "ls",JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
                i=true;
            }
            else{
                choice2=JOptionPane.showInputDialog(null,"You've already"
                        + " picked "+choice1+" Try again", "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
            }
        }
        while(choice2==choice1);
        
        String patron = JOptionPane.showInputDialog(null,"Choose your Otherworldly Patron:", "O"
                + "therworldly Patron", JOptionPane.PLAIN_MESSAGE, null,
                otherPatron,0).toString();
        charInfo[8]+="\n-Otherworldly Patron: ";
        if(patron=="Archfey"){
            charInfo[8]+="(Archfey) Know 'Faerie fire' and 'Sleep' spells.\nFey"
                    + " Presence: As an action you can cause each creature in a"
                    + " 10ft cubeoriginating from you to make a WIS save agains"
                    + "t your spell save DC. On fail they are charmed or fright"
                    + "ened(your choice) until the end of your next turn(1/Shor"
                    + "t Rest)";
        }
        if(patron=="Fiend"){
            charInfo[8]+="(Fiend) Know 'Burning hands' and 'Command' spells.\nD"
                    + "ark One's Blessing: When you reduce a hostile creature t"
                    + "o 0 HP, you gain temporary HP equal to your CHA mod + Wa"
                    + "rlock Lvl (minimum 1)";
        }
        if(patron=="Great Old One"){
            charInfo[8]+="(Great Old One) Know 'Dissonant whispers' and 'Tasha'"
                    + "s hideous laughter' spells.\nAwakened Mind: You can comm"
                    + "unicate telepathically with any creature you can see wit"
                    + "hin 30ft of you. You don't need to share a language but "
                    + "the creature must be able to understand at least one lan"
                    + "guage.";
        }
        
        
        charInfo[8]+="\n-Proficient in "+choice1+" and "+choice2+"\n-Saving Thr"
                + "ows: WIS and CHA";
        charInfo[9]+="\n-Simple weapons\n-Light armor";
        charInfo[11]=""+prof;
        chaMod=attribMod(attrib[0]);
        wisMod=attribMod(attrib[1]);
        dexMod=attribMod(attrib[2]);
        intMod=attribMod(attrib[3]);
        strMod=attribMod(attrib[4]);
        conMod=attribMod(attrib[5]);
        charInfo[12]=""+strMod;
        charInfo[13]=""+dexMod;
        charInfo[14]=""+conMod;
        charInfo[15]=""+intMod;
        charInfo[16]=""+wisMod;
        charInfo[17]=""+chaMod;
        hp+=8+conMod;
        charInfo[18]=""+hp;
        charInfo[19]="d8";
        charInfo[22]=alignment;
        charInfo[30]="Warlock";
    }
    public void wizardClass(){
        String[] skills = {"Arcana","History","Insight","Investigation","Medici"
                + "ne","Religioni"};
        attrib[0]+=intel;//Priority:int,wis,dex,cha,con,str
        charInfo[0]=""+attrib[0];
        attrib[1]+=wis;
        charInfo[1]=""+attrib[1];
        attrib[2]+=dex;
        charInfo[2]=""+attrib[2];
        attrib[3]+=cha;
        charInfo[3]=""+attrib[3];
        attrib[4]+=con;
        charInfo[4]=""+attrib[4];
        attrib[5]+=str;
        charInfo[5]=""+attrib[5];
        
        String choice2;
        String choice1=JOptionPane.showInputDialog(null,"Choose two skills to b"
                + "e proficient in, first skill:", "Skills",
                JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
        boolean i = false;
        do{
            if(i==false){
                choice2=JOptionPane.showInputDialog(null,"Second skill:", "Skil"
                        + "ls",JOptionPane.PLAIN_MESSAGE, null,skills,
                        0).toString();
                i=true;
            }
            else{
                choice2=JOptionPane.showInputDialog(null,"You've already"
                        + " picked "+choice1+" Try again", "Skills",
                        JOptionPane.PLAIN_MESSAGE, null,skills,0).toString();
            }
        }
        while(choice2==choice1);
        
        charInfo[8]+="\n-Arcane Recovery: Once per day when you finish a short "
                + "rest, you can choose expended spell slots to recover. The sp"
                + "ells slots can have a combined Lvl equal to or less than hal"
                + "f your Wizard Lvl(rounded up). *None can be 6th Lvl or highe"
                + "r.\n-Proficient in "+choice1+" and "+choice2+"\n-Saving Thr"
                + "ows: INT and WIS";
        charInfo[9]+="\n-Daggers\n-Darts\n-Slings\n-Quarterstaffs\n-Light cross"
                + "bows";
        charInfo[11]=""+prof;
        intMod=attribMod(attrib[0]);
        wisMod=attribMod(attrib[1]);
        dexMod=attribMod(attrib[2]);
        chaMod=attribMod(attrib[3]);
        conMod=attribMod(attrib[4]);
        strMod=attribMod(attrib[5]);
        charInfo[12]=""+strMod;
        charInfo[13]=""+dexMod;
        charInfo[14]=""+conMod;
        charInfo[15]=""+intMod;
        charInfo[16]=""+wisMod;
        charInfo[17]=""+chaMod;
        hp+=6+conMod;
        charInfo[18]=""+hp;
        charInfo[19]="d6";
        charInfo[22]=alignment;
        charInfo[30]="Wizard";
    }
    
    public void acolyteBack(){
        charInfo[8]+="\n-Acolyte Proficiencies: Insight and Religion";
        charInfo[23]="Acolyte";
        charInfo[24]="";
        charInfo[25]="";
        charInfo[26]="";
        charInfo[27]="";
    }
    public void charlatanBack(){
        charInfo[8]+="\n-Charlatan Proficiencies: Deception and Sleight of hand"
                + "";
        charInfo[10]+="\n-Charlatan tool profs: Disguise kit and Forgery kit";
        charInfo[23]="Charlatan";
        charInfo[24]="";
        charInfo[25]="";
        charInfo[26]="";
        charInfo[27]="";
    }
    public void criminalBack(){
        charInfo[8]+="\n-Criminal Proficiencies: Deception and Stealth";
        charInfo[10]+="\n-Criminal tool profs: One game set of choice and Thiev"
                + "es' tools";
        charInfo[23]="Criminal";
        charInfo[24]="";
        charInfo[25]="";
        charInfo[26]="";
        charInfo[27]="";
    }
    public void entertainerBack(){
        charInfo[8]+="\n-Entertainer Proficiencies: Acrobatics and Performance";
        charInfo[10]+="\n-Entertainer tool profs: One instrument type of choice"
                + " and Disguise kit";
        charInfo[23]="Entertainer";
        charInfo[24]="";
        charInfo[25]="";
        charInfo[26]="";
        charInfo[27]="";
    }
    public void folkHeroBack(){
        charInfo[8]+="\n-Folk Hero Proficiencies: Animal handling and Survival";
        charInfo[10]+="\n-Folk Hero tool profs: One type of artisan's tools of "
                + "choice and Vehicles(land)";
        charInfo[23]="Folk Hero";
        charInfo[24]="";
        charInfo[25]="";
        charInfo[26]="";
        charInfo[27]="";
    }
    public void guildArtisanBack(){
        charInfo[8]+="\n-Guild Artisan Proficiencies: Insight and Persuasion";
        charInfo[10]+="\n-Guild Artisan tool profs: One type of Artisan's tools"
                + "";
        charInfo[23]="Guild Artisan";
        charInfo[24]="";
        charInfo[25]="";
        charInfo[26]="";
        charInfo[27]="";
    }
    public void hermitBack(){
        charInfo[8]+="\n-Hermit Proficiencies: Medicine and Religion";
        charInfo[10]+="\n-Hermit tool profs: Herbalism kit";
        charInfo[23]="Hermit";
        charInfo[24]="";
        charInfo[25]="";
        charInfo[26]="";
        charInfo[27]="";
    }
    public void nobleBack(){
        charInfo[8]+="\n-Noble Proficiencies: History and Persuasion";
        charInfo[10]+="\n-Noble tool profs: One type of gaming set";
        charInfo[23]="Noble";
        charInfo[24]="";
        charInfo[25]="";
        charInfo[26]="";
        charInfo[27]="";
    }
    public void outlanderBack(){
        charInfo[8]+="\n-Outlander Proficiencies: Athletics and Survival";
        charInfo[10]+="\n-Outlander tool profs: One type of musical instrument "
                + "of choice";
        charInfo[23]="Outlander";
        charInfo[24]="";
        charInfo[25]="";
        charInfo[26]="";
        charInfo[27]="";
    }
    public void sageBack(){
        charInfo[8]+="\n-Sage Proficiencies: Arcana and History";
        charInfo[23]="Sage";
        charInfo[24]="";
        charInfo[25]="";
        charInfo[26]="";
        charInfo[27]="";
    }
    public void sailorBack(){
        charInfo[8]+="\n-Sailor Proficiencies: Athetics and Perception";
        charInfo[10]+="\n-Sailor tool profs: Navigator's tools and vehicles("
                + "water)";
        charInfo[23]="Sailor";
        charInfo[24]="";
        charInfo[25]="";
        charInfo[26]="";
        charInfo[27]="";
    }
    public void soldierBack(){
        charInfo[8]+="\n-Soldier Proficiencies: Athletics and Intimidation";
        charInfo[10]+="\n-Soldier tool profs: One type of gaming set of choice "
                + "and Vehicles(land)";
        charInfo[23]="Soldier";
        charInfo[24]="";
        charInfo[25]="";
        charInfo[26]="";
        charInfo[27]="";
    }
    public void urchinBack(){
        charInfo[8]+="\n-Urchin Proficiencies: Sleight of Hand and Stealth";
        charInfo[10]+="\n-Urchin tool profs: Disguise kit and Thieves' tools";
        charInfo[23]="Urchin";
        charInfo[24]="";
        charInfo[25]="";
        charInfo[26]="";
        charInfo[27]="";
    }
    public void randomBack(){
        switch(roll.CustomRoll(13)){
            case 1:
                acolyteBack();
                break;
            case 2:
                charlatanBack();
                break;
            case 3:
                criminalBack();
                break;
            case 4:
                entertainerBack();
                break;
            case 5:
                folkHeroBack();
                break;
            case 6:
                guildArtisanBack();
                break;
            case 7:
                hermitBack();
                break;
            case 8:
                nobleBack();
                break;
            case 9:
                outlanderBack();
                break;
            case 10:
                sageBack();
                break;
            case 11:
                sailorBack();
                break;
            case 12:
                soldierBack();
                break;
            case 13:
                urchinBack();
                break;
        }
    }

    public void setCharName(String s){
        charInfo[20]=s;
    }
    public void setPlayerName(String s){
        charInfo[21]=s;
    }
    public void setAlignment(String s){
        alignment=s;
    }
    public void setBackground(String s){
        background=s;
    }
}
