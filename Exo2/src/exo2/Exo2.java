/**
TP0
Nicolas Piquet
Exo2
18 septembre 2023
 */

package exo2;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Exo2 {

    
    public static void main(String args []) {
        //Declaration des variables
        int result = 0; //resultat
        int ind; //indice
        int nb;
        //nb=5;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt();//On demande a sc de donner le prochain entier
    
        //Addition des nb premiers entiers
        ind = 1;
        while (ind<=nb){
            result=result+ind;
            ind+=1;
            if (ind == nb) {
                break;
            }
        }
    
        //Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+nb+" entiers est : "+result);
    }
}
