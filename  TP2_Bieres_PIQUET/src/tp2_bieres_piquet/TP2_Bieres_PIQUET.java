/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_piquet;

/**
* Nicolas Piquet
* TP2 Bieres
* 06/10/2023
 */
public class TP2_Bieres_PIQUET {

    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson") ;
        uneBiere.ouverte = false;
        //uneBiere.lireEtiquette();
        
        
        
        BouteilleBiere deuxBieres = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        deuxBieres.ouverte = false;
        //deuxBieres.lireEtiquette();
        
        BouteilleBiere MontBlanc1 = new BouteilleBiere("Rousse", 5.0, "Cham") ;
        MontBlanc1.ouverte = false;
        //MontBlanc1.lireEtiquette();
        
        BouteilleBiere MontBlanc2 = new BouteilleBiere("Blanche", 6.0, "Cham") ;
        MontBlanc2.ouverte = false;
        //MontBlanc2.lireEtiquette();
        
        BouteilleBiere MontBlanc3 = new BouteilleBiere("Blonde", 7.0, "Cham") ;
        MontBlanc3.ouverte = true;
        //MontBlanc3.lireEtiquette();
        MontBlanc3.Decapsuler();
        
        System.out.println(MontBlanc3);
    }
}