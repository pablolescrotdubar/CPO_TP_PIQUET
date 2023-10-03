/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_piquet;

import java.util.Random;
import java.util.Scanner;

/**
Nicolas Piquet
* TP1
* Guessmynumber
* 03/10/23
 */
public class TP1_guessMyNumber_PIQUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random generateurAleat = new Random();
        int valalea;
        int valentree = -1;
        valalea = generateurAleat.nextInt(100);
        while (valentree != valalea) {
            System.out.println("Saisissez une valeur entiere entre 0 et 100 :");
            valentree = sc.nextInt();
            if (valentree < 0 || valentree > 100) {
                System.out.println("Saisissez une valeur entiere entre 0 et 100 :");
                valentree = sc.nextInt();
            }
            if (valentree < valalea) {
                System.out.println("Trop petit");
            } else if (valentree > valalea) {
                System.out.println("Trop grand");
            } else if (valentree == valalea) {
                System.out.println("Gagne");
            }
        }
        
    }
}    