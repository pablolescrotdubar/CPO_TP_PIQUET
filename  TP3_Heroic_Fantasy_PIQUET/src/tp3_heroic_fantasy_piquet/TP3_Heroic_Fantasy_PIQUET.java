/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_piquet;

import java.util.ArrayList;

/**
 * TP3
 * Nicolas PIQUET
 * 18/10/2023
 */
public class TP3_Heroic_Fantasy_PIQUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee epee1 = new Epee("Excalibur",7,5);
        Epee epee2 = new Epee( "Durandal",4,7);
        Baton baton1 = new Baton( "Chêne", 4, 5);
        Baton baton2 = new Baton( "Charme", 5, 6);
        
        ArrayList<Arme> tab = new ArrayList<Arme>();
        tab.add(epee1);
        tab.add(epee2);
        tab.add(baton1);
        tab.add(baton2);
    }
    
}
