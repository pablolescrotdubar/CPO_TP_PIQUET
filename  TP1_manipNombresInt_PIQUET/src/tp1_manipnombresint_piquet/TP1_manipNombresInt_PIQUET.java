/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_piquet;

import java.util.Scanner;

/**
PIQUET Nicolas
* TP1
* 26 septembre 2023
 */
public class TP1_manipNombresInt_PIQUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entier1;
        int entier2;
        Scanner sc=new Scanner(System.in);
        System.out.println(("Veuillez saisir un premier entier :"));
        entier1 = sc.nextInt();
        System.out.println(("Veuillez saisir un deuxieme entier :"));
        entier2 = sc.nextInt();
        System.out.println(entier1+" et "+entier2);
        System.out.println("La somme de vos valeurs est "+(entier1+entier2));
        System.out.println("La difference de vos valeurs est "+(entier1-entier2));
        System.out.println("Le produit de vos valeurs est "+(entier1*entier2));
        System.out.println("Le quotient entier de vos valeurs est "+(entier1/entier2)+" et la difference de la division euclidienne est "+(entier1%entier2));
    }
    
}
