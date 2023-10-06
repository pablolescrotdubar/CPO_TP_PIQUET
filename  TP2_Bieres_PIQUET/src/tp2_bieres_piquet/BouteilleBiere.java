/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_piquet;

/**
 *
 * @author nicol
 */
public class BouteilleBiere {
    String Nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    
    public void lireEtiquette() {
        System.out.println("Bouteille de "+Nom+" ("+degreAlcool+" degres) \nBrasserie : "+brasserie );
    } 
    
    
    public boolean Decapsuler() {
        if (ouverte == false) {
            ouverte = true;
            return true;
        } else {
            System.out.println("erreur : biere déjà ouverte");
            return false;
        }
    }
    
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Nom + " (" + degreAlcool + " degres) Ouverte ? ";
        
    }
            
            
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        Nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    } 
    
}
