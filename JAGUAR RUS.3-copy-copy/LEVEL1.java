import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LEVEL1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LEVEL1 extends World
{

    /**
     * Constructor for objects of class LEVEL1.
     * 
     */
   
    public LEVEL1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        walls walls = new walls();
        addObject(walls,79,27);
        walls walls2 = new walls();
        addObject(walls2,78,76);
        walls walls3 = new walls();
        addObject(walls3,77,125);
        walls walls4 = new walls();
        addObject(walls4,74,176);
        walls walls5 = new walls();
        addObject(walls5,124,175);
        walls walls6 = new walls();
        addObject(walls6,171,177);
        walls walls7 = new walls();
        addObject(walls7,220,176);
        walls walls8 = new walls();
        addObject(walls8,222,225);
        walls walls9 = new walls();
        addObject(walls9,224,276);
        walls walls10 = new walls();
        addObject(walls10,271,276);
        walls walls11 = new walls();
        addObject(walls11,320,278);
        walls walls12 = new walls();
        addObject(walls12,134,675);
        walls walls13 = new walls();
        addObject(walls13,134,629);
        walls walls14 = new walls();
        addObject(walls14,134,583);
        walls walls15 = new walls();
        addObject(walls15,134,532);
        walls walls16 = new walls();
        addObject(walls16,132,483);
        walls walls17 = new walls();
        addObject(walls17,181,483);
        walls walls18 = new walls();
        addObject(walls18,230,484);
        walls walls19 = new walls();
        addObject(walls19,84,579);
        walls walls20 = new walls();
        addObject(walls20,23,498);
        walls walls21 = new walls();
        addObject(walls21,464,672);
        walls walls22 = new walls();
        addObject(walls22,464,622);
        walls walls23 = new walls();
        addObject(walls23,460,576);
        walls walls24 = new walls();
        addObject(walls24,458,530);
        walls walls25 = new walls();
        addObject(walls25,457,486);
        walls walls26 = new walls();
        addObject(walls26,454,436);
        walls walls27 = new walls();
        addObject(walls27,677,249);
        walls walls28 = new walls();
        addObject(walls28,633,248);
        walls walls29 = new walls();
        addObject(walls29,585,248);
        walls walls30 = new walls();
        addObject(walls30,535,245);
        walls walls31 = new walls();
        addObject(walls31,488,244);
        walls walls32 = new walls();
        addObject(walls32,559,201);
        walls walls33 = new walls();
        addObject(walls33,558,152);
        walls walls34 = new walls();
        addObject(walls34,558,104);
        walls walls35 = new walls();
        addObject(walls35,682,98);
        walls walls36 = new walls();
        addObject(walls36,638,96);
        walls36.setLocation(640,102);
        walls walls37 = new walls();
        addObject(walls37,340,13);
        walls walls38 = new walls();
        addObject(walls38,337,60);
        walls walls39 = new walls();
        addObject(walls39,343,106);
        walls walls40 = new walls();
        addObject(walls40,341,155);
        walls38.setLocation(332,80);
        walls38.setLocation(332,76);
        walls38.setLocation(335,71);
        walls39.setLocation(336,93);
        walls40.setLocation(341,131);
        walls walls41 = new walls();
        addObject(walls41,121,78);
        walls walls42 = new walls();
        addObject(walls42,163,79);
        walls walls43 = new walls();
        addObject(walls43,297,23);
        walls walls44 = new walls();
        addObject(walls44,384,61);
        walls walls45 = new walls();
        addObject(walls45,419,61);
        walls walls46 = new walls();
        addObject(walls46,496,534);
        walls walls47 = new walls();
        addObject(walls47,525,531);
        walls47.setLocation(536,532);
        walls walls48 = new walls();
        addObject(walls48,560,535);
        walls walls49 = new walls();
        addObject(walls49,569,585);
        walls walls50 = new walls();
        addObject(walls50,679,658);
        walls49.setLocation(556,593);
        walls walls51 = new walls();
        addObject(walls51,635,655);
        walls51.setLocation(635,674);
        walls50.setLocation(675,673);
        walls walls52 = new walls();
        addObject(walls52,18,360);
        walls walls53 = new walls();
        addObject(walls53,68,359);
        walls walls54 = new walls();
        addObject(walls54,120,360);
        walls walls55 = new walls();
        addObject(walls55,482,293);
        walls walls56 = new walls();
        addObject(walls56,323,330);
        walls3.setLocation(62,121);
        King king = new King();
        addObject(king,30,53);

        JAGUAR jAGUAR = new JAGUAR();
        addObject(jAGUAR,77,295);
        COIN cOIN = new COIN();
        addObject(cOIN,253,424);
        COIN cOIN2 = new COIN();
        addObject(cOIN2,202,583);
        COIN cOIN3 = new COIN();
        addObject(cOIN3,72,690);
        COIN cOIN4 = new COIN();
        addObject(cOIN4,20,441);
        cOIN4.setLocation(12,417);
        COIN cOIN5 = new COIN();
        addObject(cOIN5,380,117);
        cOIN5.setLocation(395,104);
        COIN cOIN6 = new COIN();
        addObject(cOIN6,124,48);
        cOIN6.setLocation(134,28);
        COIN cOIN7 = new COIN();
        addObject(cOIN7,532,291);
        cOIN7.setLocation(539,295);
        COIN cOIN8 = new COIN();
        addObject(cOIN8,507,576);
        cOIN8.setLocation(506,586);
        cOIN.setLocation(311,389);
        JAGUAR jAGUAR2 = new JAGUAR();
        addObject(jAGUAR2,311,389);
        cOIN.setLocation(365,487);
        JAGUAR jAGUAR3 = new JAGUAR();
        addObject(jAGUAR3,305,232);
        jAGUAR3.setLocation(303,219);
        cOIN8.setLocation(612,536);
        JAGUAR jAGUAR4 = new JAGUAR();
        addObject(jAGUAR4,612,536);
        cOIN8.setLocation(560,672);
        JAGUAR jAGUAR5 = new JAGUAR();
        addObject(jAGUAR5,560,672);
        cOIN8.setLocation(425,151);
        cOIN5.setLocation(456,173);
        walls31.setLocation(524,280);
        cOIN5.setLocation(400,192);
        JAGUAR jAGUAR6 = new JAGUAR();
        addObject(jAGUAR6,400,192);
        cOIN5.setLocation(377,168);
        walls31.setLocation(572,300);
        removeObject(cOIN6);
        removeObject(walls2);
        removeObject(walls41);
        removeObject(walls);
        removeObject(walls42);
        removeObject(walls3);
    }
}
