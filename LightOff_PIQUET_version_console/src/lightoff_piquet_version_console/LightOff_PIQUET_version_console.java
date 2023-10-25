/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_piquet_version_console;

/**
 *
 * @author nicol
 */
public class LightOff_PIQUET_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GrilledeJeu grille = new GrilledeJeu(4 ,4);
        /*grille.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println(grille);
        grille.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println(grille);
        grille.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println(grille);
        grille.activerLigneColonneOuDiagonaleAleatoire();*/
        grille.melangerMatriceAleatoirement(3);
        System.out.println(grille);
        /*grille.melangerMatriceAleatoirement(5);
        grille.eteindreToutesLesCellules();
        grille.activerLigneDeCellules(0);
        System.out.println(grille.toString());*/
    }
    
}
