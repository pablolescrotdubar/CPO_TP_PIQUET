/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_piquet;

import java.util.Random;
import java.util.Scanner;

/**
 Nicolas Piquet
* TP1
* Guessmynumber
* 03/10/23
 */
public class TP1_stats_PIQUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tab [] = new int[6];
        for (int i = 0; i <= 5; i++) {
            tab[i] = 0;
            /*System.out.println(tab[i]);
            */
        }
        Scanner sc=new Scanner(System.in);
        int nb;
        System.out.println("Veuillez saisir un entier strictement positif :");
        nb = sc.nextInt();
        while (nb<1) {
            System.out.println("Veuillez saisir un entier strictement positif :");
            nb = sc.nextInt();
        }
        Random generateurAleat = new Random();
        int valalea;
        for (int i=0; i<nb; i++) {
            valalea = generateurAleat.nextInt(5);
            tab[valalea]+=1;
        }
        for (int j = 0; j<6; j++) {
            System.out.println((j+1)+" : "+((tab[j]/(nb*1.0))*100)+" %");
        }
    }
}
