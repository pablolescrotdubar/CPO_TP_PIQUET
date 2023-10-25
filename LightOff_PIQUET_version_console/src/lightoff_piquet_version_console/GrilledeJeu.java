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
        CelluleLumineuse [][] matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
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
        int aleat = random.nextInt(3) + 1;
        if  (aleat == 1) {
            int numligne = random.nextInt(nbLignes) + 1;
            for (int j = 0 ; j<nbColonnes ; j++) {
                matriceCellules[numligne][j].activerCellule();
            }
        } else if (aleat == 2) {
            int numcolonne = random.nextInt(nbColonnes) + 1;
            for (int i = 0 ; i<nbLignes ; i++) {
                matriceCellules[i][numcolonne].activerCellule();
            }
        } else if (aleat == 3) {
            int diag = random.nextInt(2) + 1;
            if (diag == 1) {
                for (int i = 0 ; i<nbLignes ; i++) {
                    for (int j = 0 ; j<nbLignes ; j++) {
                        if (i == j) {
                            matriceCellules[i][j].activerCellule();
                        }
                    }
                }
            } else if (diag == 2) {
                for (int i = 0 ; i<nbLignes ; i++) {
                    for (int j = 0 ; j<nbLignes ; j++) {
                        if (i+j == nbLignes + 1) {
                            matriceCellules[i][j].activerCellule();
                        }
                    }
                }
            }
        }
        
    }
    
    
}
