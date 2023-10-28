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
    int n;

    /**
     * Crée une partie à l'aide d'une grille de jeu de taille n*n.
     * Initialise le nombre de coups à 0
     * @param n
     */
    public Partie(int n) {
        this.grille = new GrilledeJeu(n, n);
        this.nbCoups = 0;
    }
    
    /**
     * Initialise la grille de jeu en mélangeant aléatoirement la grille d'un nombre de coups donné
     */
    public void initialiserPartie() {
        this.grille.melangerMatriceAleatoirement(5);
    }
    
    /**
     * Affiche l'état initial de la grille et effectue les coups demandés par l'utilisateur jusqu'à ce que
     * toutes les cellules soient éteintes.
     */
    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);
        this.initialiserPartie();
        System.out.println(this.grille.toString());
        while (this.grille.cellulesToutesEteintes() == false) {
            System.out.println("\n"+"Veuillez choisir un coup : L pour une lignes a activer, C pour une colonne et D pour une diagonale :");
            char cas = sc.next().charAt(0);
            sc.nextLine();
            while (cas != 'L' && cas != 'C' && cas != 'D') {
                System.out.println("\n"+"Veuillez reessayer :");
                cas = sc.next().charAt(0);
                sc.nextLine();
            }
            switch (cas) {
                case 'L' :
                    System.out.println("\n"+"Entrez le numero de la ligne a activer :");
                    int numligne = sc.nextInt();
                    while (numligne < 0 || numligne > this.grille.nbLignes - 1) {
                        System.out.println("\n"+"Veuillez reessayer :");
                        numligne = sc.nextInt();
                    }
                    this.grille.activerLigneDeCellules(numligne);
                    nbCoups++;
                    System.out.println("\n"+this.grille);
                    System.out.println("\n"+"Nombre de coups realises : "+nbCoups);
                    break;
                case 'C' :
                    System.out.println("\n"+"Entrez le numéro de la colonne a activer :");
                    int numcolonne = sc.nextInt();
                    while (numcolonne < 0 || numcolonne > this.grille.nbColonnes - 1) {
                        System.out.println("\n"+"Veuillez reessayer :");
                        numcolonne = sc.nextInt();
                    }
                    this.grille.activerColonneDeCellules(numcolonne);
                    nbCoups++;
                    System.out.println("\n"+this.grille);
                    System.out.println("\n"+"Nombre de coups realises : "+nbCoups);
                    break;
                case 'D' :
                    System.out.println("\n"+"Entrez DD pour activer la diagonale decendante et DM pour la diagonale montante :");
                    String casdiag = sc.nextLine();
                    while (!casdiag.equals("DD") && !casdiag.equals("DM")) {
                        System.out.println("\n"+"Veuillez reessayer :");
                        casdiag = sc.nextLine();
                    }
                    switch (casdiag) {
                        case "DD" :
                            this.grille.activerDiagonaleDescendante();
                            nbCoups++;
                            System.out.println("\n"+this.grille);
                            System.out.println("\n"+"Nombre de coups realises : "+nbCoups);
                            break;
                        case "DM" :
                            this.grille.activerDiagonaleMontante();
                            nbCoups++;
                            System.out.println("\n"+this.grille);
                            System.out.println("\n"+"Nombre de coups realises : "+nbCoups);
                            break;
                    }
        
            }
        }
        System.out.println(this.grille);
        System.out.println("\n"+"Bravo ! Vous avez gagne en "+nbCoups+" coups !");
    }
}    
