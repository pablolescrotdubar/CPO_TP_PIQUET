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
        
        CelluleLumineuse cellule1 = new CelluleLumineuse(true);
        System.out.println(cellule1.toString());
        cellule1.activerCellule();
        System.out.println(cellule1.toString());
        cellule1.estEteint();
        System.out.println(cellule1.toString());
    }
    
}
