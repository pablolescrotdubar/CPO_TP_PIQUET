/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_piquet;

import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 * TP3
 * Nicolas PIQUET
 * 18/10/2023
 */
public class TP3_Heroic_Fantasy_PIQUET {

    
    public static void main(String[] args) {
        Epee epee1 = new Epee("Excalibur",7,5);
        Epee epee2 = new Epee( "Durandal",4,7);
        Baton baton1 = new Baton( "Chêne", 4, 5);
        Baton baton2 = new Baton( "Charme", 5, 6);
        
        ArrayList<Arme> tab1 = new ArrayList<Arme>();
        tab1.add(epee1);
        tab1.add(epee2);
        tab1.add(baton1);
        tab1.add(baton2);
        
        /*for (int i = 0 ; i<tab1.size() ; i++) {
            System.out.println(tab1.get(i).toString());
        }*/
        
        /*Magicien magicien1 = new Magicien("Gandalf",65,true);
        Magicien magicien2 = new Magicien("Garcimore",44,false);
        Guerrier guerrier1 = new Guerrier("Conan",78,false);
        Guerrier guerrier2 = new Guerrier("Lannister",45,true);*/
        
        /*ArrayList<Personnage> tab2 = new ArrayList<Personnage>();
        tab2.add(magicien1);
        tab2.add(magicien2);
        tab2.add(guerrier1);
        tab2.add(guerrier2);*/
        
        /*for (int i = 0 ; i<tab2.size() ; i++) {
            System.out.println(tab2.get(i).toString());
        }*/
        
        Guerrier Abdellah = new Guerrier("Abdellah",90, true);
        Magicien Winston = new Magicien("Winston",100, true);
        Epee epeeAbdellah = new Epee( "Glaive",10,70);
        Epee epeeWinston = new Epee( "Ker",15,98);
        Epee epeeAnneSophie = new Epee( "Developpement limité",10,70);
        Baton batonAbdellah = new Baton( "Brindille", 4, 5);
        Baton batonWinston = new Baton( "Boulot", 4, 5);
        Baton batonAnneSophie = new Baton( "Buisson", 4, 5);
        
        Abdellah.AjoutArme(batonAbdellah);
        Abdellah.AjoutArme(epeeAbdellah);
        Abdellah.AjoutArme(epeeWinston);
        Abdellah.equiperPersonnage(epeeAbdellah);
        
        Winston.AjoutArme(batonWinston);
        Winston.AjoutArme(batonAnneSophie);
        Winston.AjoutArme(epeeAnneSophie);
        
        int compteur = 0;
        for (int i = 0 ; i<Winston.getArmesPossedees().size() ; i++) {
            if (Winston.getArmesPossedees().get(i) instanceof Baton == true) {
                compteur += 1;
            }
        }
        //System.out.println("Le magicien a " + compteur + " armes preferees.");
        System.out.println(Abdellah.toString());
        System.out.println(Winston.toString());
        
        System.out.println("Le nombre de personnages est : " + Personnage.getNbpersonnages());
        System.out.println("Le nombre de magiciens est : " + Magicien.getNbmagiciens());
        System.out.println("Le nombre de guerriers est : " + Guerrier.getNbguerriers());
    }
    
    
}
