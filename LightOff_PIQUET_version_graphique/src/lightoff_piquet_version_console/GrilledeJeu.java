/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_piquet_version_console;

import java.util.Random;

/**
 *
 * @author nicol
 */
public class GrilledeJeu {
    
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    /**
     * Crée la grille de jeu carrée de dimension nbLignes*nbColonnes contenant des cellules lumineuses
     * @param nbLignes nombre de lignes de la grille
     * @param nbColonnes nombre de colonnes de la grille
     */
    public GrilledeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i = 0 ; i<nbLignes ; i++) {
            for (int j = 0 ; j<nbColonnes ; j++) {
                matriceCellules [i][j] = new CelluleLumineuse(true);
            }
        }
    }
    
    /**
     * Eteint toutes les cellules de la grille
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0 ; i<nbLignes ; i++) {
            for (int j = 0 ; j<nbColonnes ; j++) {
                matriceCellules[i][j].eteindreCellule();
            } 
        }    
    }
            
    /**
     * Active de manière aléatoire une ligne, une colonne ou une diagonale
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int aleat = random.nextInt(3);
        switch (aleat) {
            case 0 -> {
                int numligne = random.nextInt(nbLignes);
                this.activerLigneDeCellules(numligne);
            }
            case 1 -> {
                int numcolonne = random.nextInt(nbColonnes);
                this.activerColonneDeCellules(numcolonne);
            }
            case 2 -> {
                int diag = random.nextInt(2);
                if (diag == 0) {
                    this.activerDiagonaleDescendante();
                    break;
                } else if (diag == 1) {
                    this.activerDiagonaleMontante();
                }
            }
            default -> {
            }
        }
    }
    
    /**
     * Permet d'activer une ligne, colonne ou diagonale de manière aléatoire nbTours fois
     * @param nbTours nombre de fois à activer une ligne, colonne ou diagonale
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        this.eteindreToutesLesCellules();
        for (int i = 0 ; i<nbTours ; i++) {
            this.activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    
    /**
     * Permet d'activer la ligne entière de numéro idLigne
     * @param idLigne numéro de la ligne
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0 ; j<nbLignes ; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }
    
    /**
     * Permet d'activer la colonne entière de numéro idColonne
     * @param idColonne numéro de la colonne
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0 ; i<nbLignes ; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }
    
    /**
     * Permet d'activer la diagonale descendante entière
     */
    public void activerDiagonaleDescendante(){
        for (int i = 0 ; i<nbLignes ; i++) {
            for (int j = 0 ; j<nbLignes ; j++) {
                if (i == j) {
                    matriceCellules[i][j].activerCellule();
                }
            }
        }
    }
    
    /**
     * Permet d'activer la diagonale montante entière
     */
    public void activerDiagonaleMontante()  {
        for (int i = 0 ; i<nbLignes ; i++) {
            for (int j = 0 ; j<nbLignes ; j++) {
                if (i+j == nbLignes - 1) {
                    matriceCellules[i][j].activerCellule();
                }
            }
        }
    }
    
    /**
     * Renvoie true si l'ensemble des cellules sont éteintes, false sinon
     * @return
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0 ; i<nbLignes ; i++) {
            for (int j = 0 ; j<nbLignes ; j++) {
                if (matriceCellules[i][j].getEtat() == true) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Renvoie une grille de Strings composée de X (cellules allumées) et de O (cellules éteintes)
     * @return
     */
    @Override
    public String toString() {
        String maGrille = "";
        String tirets = "-----";
        for (int i = 0 ; i < nbColonnes ; i++) {
            maGrille += " "+i+" |";
        }
        for (int i = 0 ; i < nbColonnes ; i++) {
            tirets += "----";
        }
        for (int i = 0 ; i < nbColonnes ; i++) {
            maGrille += "\n"+tirets+"\n";
            maGrille += " "+i+" |";
            for (int j = 0 ; j < nbColonnes ; j++) {
                if (matriceCellules[i][j].getEtat() == true) {
                    maGrille += " X |";
                } else {
                    maGrille += " O |";
                }
            }
        }
        maGrille += "\n"+tirets;
        return "   |"+maGrille;
    }
    
    
}
