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
     * @param nbTours Nombre de coups à effectuer pour mélanger la grille
     */
    public void initialiserPartie(int nbTours) {
        this.grille.melangerMatriceAleatoirement(nbTours);
    }
    
   
    /**
     * Affiche l'état initial de la grille et effectue les coups demandés par l'utilisateur jusqu'à ce que
     * toutes les cellules soient éteintes ou que le nombre de coups autorisé soit dépassé.
     */
    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel niveau de difficulte souhaitez-vous entre 1 et 10 ?");
        int niv = sc.nextInt();
        while (niv < 1 || niv > 10) {
            System.out.println("Veuillez reessayer et saisir un nombre entier entre 1 et 10 :");
            niv = sc.nextInt();
        }
        this.initialiserPartie(niv);
        System.out.println(this.grille.toString());
        System.out.println("Si vous dépassez "+niv+" coups, la partie sera perdue ! Soyez astucieux...");
        while (this.grille.cellulesToutesEteintes() == false) {
            if (nbCoups >= niv) {
                System.out.println("Vous avez depasse le nombre de coups autorise... La partie est perdue !");
                break;
            }
            System.out.println("\n"+"Veuillez choisir un coup : L pour une ligne a activer, C pour une colonne et D pour une diagonale :");
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
                    System.out.println("\n"+"Entrez le numero de la colonne a activer :");
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
        if (nbCoups < niv) {
            System.out.println(this.grille);
            System.out.println("\n"+"Bravo ! Vous avez gagne en "+nbCoups+" coups !");
        }
    }
}    
