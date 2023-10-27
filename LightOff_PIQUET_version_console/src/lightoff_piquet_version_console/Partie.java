/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_piquet_version_console;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Partie {
    
    GrilledeJeu grille;
    int nbCoups;

    public Partie() {
        this.grille = new GrilledeJeu(int n; int n);
        this.nbCoups = 0;
    }
    
    public void initialiserPartie() {
        this.grille.melangerMatriceAleatoirement(5);
    }
    
    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);
        this.initialiserPartie();
        System.out.println(this);
        System.out.println("\n"+"Veuillez choisir un coup : L pour une lignes à activer, C pour une colonne et D pour une diagonale :");
        String cas = sc.nextString();
    }
}
