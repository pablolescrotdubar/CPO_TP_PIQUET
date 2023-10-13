/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_piquet;

import java.util.Scanner;

/**
 * Nicolas Piquet
 * TP2 Convertisseur
 * 06/10/2023
 */
public class TP2_convertisseurObjet_PIQUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Convertisseur conv1 = new Convertisseur();
        double valeur;
        System.out.println("Saisissez une valeur a convertir :");
        valeur = sc.nextDouble();
        System.out.println("Choisissez le numero de conversion souhaite :");
        System.out.println("1) Celcius vers Kelvin");
        System.out.println("2) Kelvin vers Celcius");
        System.out.println("3) Farenheit vers Celcius");
        System.out.println("4) Celcius vers Farenheit");
        System.out.println("5) Kelvin vers Farenheit");
        System.out.println("6) Farenheit vers Kelvin");
        conv1.Convertisseur();
        int numconv = sc.nextInt();
        while (numconv<1 || numconv>6) {
            System.out.println("Veuillez réessayer");
            numconv = sc.nextInt();
        }
        switch (numconv) {
            case 1 -> {
                System.out.println(valeur+" degré Celcius est égal à "+conv1.CelciusVersKelvin(valeur)+" degrés Kelvin.");
                conv1.toString();
                System.out.println(conv1);
            }   
            case 2 -> {
                System.out.println(valeur+" degré Kelvin est égal à "+conv1.KelvinVersCelcius(valeur)+" degrés Celcius.");
                conv1.toString();
                System.out.println(conv1);
            }
            case 3 -> {
                System.out.println(valeur+" degré Farenheit est égal à "+conv1.FarenheitVersCelcius(valeur)+" degrés Celcius.");
                conv1.toString();
                System.out.println(conv1);
            }
            case 4 -> {
                System.out.println(valeur+" degré Celcius est égal à "+conv1.CelciusVersFarenheit(valeur)+" degrés Farenheit.");
                conv1.toString();
                System.out.println(conv1);
            }
            case 5 -> {
                System.out.println(valeur+" degré Kelvin est égal à "+conv1.KelvinVersFarenheit(valeur)+" degrés Farenheit.");
                conv1.toString();
                System.out.println(conv1);
            }
            case 6 -> {
                System.out.println(valeur+" degré Farenheit est égal à "+conv1.FarenheitVersKelvin(valeur)+" degrés Kelvin.");
                conv1.FarenheitVersKelvin(valeur);
                conv1.toString();
                System.out.println(conv1);
            }
        }
    }
}
