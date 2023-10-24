/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;
import tp3_heroic_fantasy_piquet.etreVivant;

/**
 *
 * @author nicol
 */
public abstract class Personnage implements etreVivant {
    
    String nom;
    int niveaudevie;
    ArrayList<Arme> ArmesPossedees = new ArrayList();
    Arme Arme_en_Main = null;
    private static int nbpersonnages = 0;
    private boolean confirme;
    private boolean aCheval;

    public Personnage(String nom, int niveaudevie) {
        this.nom = nom;
        this.niveaudevie = niveaudevie;
        nbpersonnages++;
        
    }

    public String getNom() {
        return nom;
    }

    public int getNiveaudevie() {
        return niveaudevie;
    }

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", niveaudevie=" + niveaudevie + "Arme_en_Main=" + Arme_en_Main + '}';
    }
    
    public void AjoutArme(Arme arme) {
            if (ArmesPossedees.size()<5) {
                ArmesPossedees.add(arme);
            }
    }
    
    public void equiperPersonnage(Arme arme) {
        for (int i = 0 ; i<ArmesPossedees.size() ; i++) {
            if (ArmesPossedees.get(i) == arme) {
                Arme_en_Main = arme;
                System.out.println("Vous avez en main l'arme "+arme.getNom()+".");
                break;
            }
        }
        if (Arme_en_Main == null) {
            System.out.println("Vous n'avez pas d'arme en main.");
        }
    }
    

    public static int getNbpersonnages() {
        return nbpersonnages;
    }
    
    @Override
    public void seFatiguer() {
        niveaudevie -= 10;
    }
    
    @Override
    public boolean estVivant() {
        if (niveaudevie > 0) {
            System.out.println("Le personnage est vivant.");
            return true;
        }
        System.out.println("Le personnage est mort.");
        return false;
    }
    
    @Override
    public void estAttaqué(int points) {
        niveaudevie -= points;
    }
    
    public void attaquer(Personnage perso, int nivattaquearme) {
        if (perso instanceof Magicien && perso.Arme_en_Main instanceof Baton) {
            if (perso.confirme == true) {
                perso.niveaudevie -= nivattaquearme*perso.Arme_en_Main.age/2;
                seFatiguer();
            } else {
                perso.niveaudevie -= nivattaquearme*perso.Arme_en_Main.age;
                seFatiguer();
            }
        } else if (perso instanceof Guerrier && perso.Arme_en_Main instanceof Epee) {
            if (perso.aCheval == true) {
                perso.niveaudevie -= nivattaquearme*perso.Arme_en_Main.indfinesse/2;
                seFatiguer();
            } else {
                perso.niveaudevie -= nivattaquearme*perso.Arme_en_Main.indfinesse;
                seFatiguer();
            }
    }
    }    
}
