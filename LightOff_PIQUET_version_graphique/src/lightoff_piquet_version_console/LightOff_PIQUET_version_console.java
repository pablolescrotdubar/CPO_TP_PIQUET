/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_piquet_version_console;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class LightOff_PIQUET_version_console {
    
    /**
        * Demande à l'utilisateur la taille de grille qu'il souhaite
        * @return Retourne la taille de la grille saisie par l'itilisateur
        */
        static int QuelleTailleDeGrille() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Quelle est la dimension de la grille que vous souhaitez entre 1 et 10 ?");
            int taille = sc.nextInt();
            while (taille < 1 || taille > 10) {
                System.out.println("Veuillez reessayer et saisir une taille entre 1 et 10 :");
                taille = sc.nextInt();
            }
            return taille;
        }

    /**
     * @param args the command line arguments4
     * 
     */
    public static void main(String[] args) {
        
        int taille = QuelleTailleDeGrille();
        Partie partie = new Partie(taille);
        partie.lancerPartie();
        
        
        
    }
    
}
