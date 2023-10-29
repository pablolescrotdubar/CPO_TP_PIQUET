/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_piquet_version_console;

/**
 *
 * @author nicol
 */
public class CelluleLumineuse {
    
    private boolean etat;

    public CelluleLumineuse(boolean etat) {
        this.etat = false;
    }
    
    /**
     * Permet d'inverser l'état actuel de la cellule
     */
    public void activerCellule() {
        if (etat == false) {
            etat = true;
        } else {
            etat = false;
        }
    }
    
    /**
     * Permet d'éteindre une cellule si elle est allumée
     */
    public void eteindreCellule() {
        if (etat == true) {
            etat = false;
        }
    }
    
    /**
     * Renvoie true si la cellule est éteinte et false si elle est allumée
     * @return
     */
    public boolean estEteint() {
        if (etat == false) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Renvoie l'état actuel de la cellule : true si elle est allumée et false si elle est éteinte
     * @return
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * Affiche "X" si la cellule est allumée et "O" si elle est éteinte
     * @return
     */
    @Override
    public String toString() {
        if (etat == true) {
            return "X";
        } else {
            return "O";
        }
        
    }
    
    
    
}
