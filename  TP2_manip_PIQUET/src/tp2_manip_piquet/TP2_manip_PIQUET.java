/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_piquet;

/**
 * Nicolas Piquet
 * 13/10/2023
 * TP2 Manips
 */
public class TP2_manip_PIQUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2; 
        // assiette1 et assiette2 sont les deux uniques tartiflettes crées et assiette3 et assiette2
        // sont deux références objet pour le même objet
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories); 
        assiette2.nbCalories+=5;
        System.out.println(assiette2.nbCalories);
        System.out.println(assiette3.nbCalories);
        
        Tartiflette intermédiaire = new Tartiflette(0);
        intermédiaire = assiette2;
        assiette2 = assiette1;
        assiette1 = intermédiaire;
        
        System.out.println(assiette1.nbCalories);
        System.out.println(assiette2.nbCalories);
        
        Moussaka tab [] = new Moussaka[10];
        for (int i = 1; i<=10 ; i++) {
            tab[i-1] = new Moussaka(i);
            System.out.println(tab[i-1].nbCalories);
        }
        
    }
    
}
