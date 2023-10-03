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
        int numniveau;
        Scanner sc=new Scanner(System.in);
        System.out.println("Veuillez choisir un niveau de difficulte :");
        System.out.println("1) Facile");
        System.out.println("2) Moyen");
        System.out.println("3) Difficile");
        numniveau = sc.nextInt();
        Random generateurAleat = new Random();
        int valalea;
        int valentree = -1;
        int compteur = 0;
        while (numniveau<1 || numniveau>3) {
            System.out.println("Veuillez reessayer :");
            numniveau = sc.nextInt();
        }
        switch (numniveau) {
            case 1 :
                valalea = generateurAleat.nextInt(50);
                while (valentree != valalea) {
                    System.out.println("Saisissez une valeur entiere entre 0 et 50 :");
                    valentree = sc.nextInt();
                    while (valentree < 0 || valentree > 50) {
                        System.out.println("Saisissez une valeur entiere entre 0 et 50 :");
                        valentree = sc.nextInt();
                    }
                    if (valentree < valalea) {
                        System.out.println("Trop petit");
                    } else if (valentree > valalea) {
                        System.out.println("Trop grand");
                    } else if (valentree == valalea) {
                        System.out.println("Gagne");
                    }
                    compteur += 1;
                }
                System.out.println("Vous avez gagné en "+compteur+" coups");
            
            case 2 :
                valalea = generateurAleat.nextInt(100);
                while (valentree != valalea) {
                    System.out.println("Saisissez une valeur entiere entre 0 et 100 :");
                    valentree = sc.nextInt();
                    while (valentree < 0 || valentree > 100) {
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
                    compteur += 1;
                }
                System.out.println("Vous avez gagné en "+compteur+" coups");
                
            case 3 :
                valalea = generateurAleat.nextInt(200);
                while (valentree != valalea) {
                    System.out.println("Saisissez une valeur entiere entre 0 et 200 :");
                    valentree = sc.nextInt();
                    while (valentree < 0 || valentree > 200) {
                        System.out.println("Saisissez une valeur entiere entre 0 et 200 :");
                        valentree = sc.nextInt();
                    }
                    if (valentree < valalea) {
                        System.out.println("Trop petit");
                    } else if (valentree > valalea) {
                        System.out.println("Trop grand");
                    } else if (valentree == valalea) {
                        System.out.println("Gagne");
                    }
                    compteur += 1;
                }
                System.out.println("Vous avez gagné en "+compteur+" coups");
        }
    }
}