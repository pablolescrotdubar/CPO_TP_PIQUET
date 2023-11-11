/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_piquet_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author nicol
 */
public class CelluleGraphique extends JButton {
    
    CelluleLumineuse celluleLumineuseAssociee;
    int longueur;
    int largeur;

    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int longueur, int largeur) {
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
        this.longueur = longueur;
        this.largeur = largeur;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int longueur = this.getWidth();
        int hauteur = this.getHeight();
        if (celluleLumineuseAssociee.estEteint() == true) {
            g.setColor(Color.red);
        } else {
            g.setColor(Color.yellow);
        }
        g.fillOval(2, 2, longueur - 4, hauteur - 4);
    } 
    
}
