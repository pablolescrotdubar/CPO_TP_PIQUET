/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_piquet;

import java.util.Scanner;

/**
PIQUET Nicolas
* TP1
* Exo2
* 26 septembre 2023
 */
public class TP1_convertisseur_PIQUET {

    /**
     * @param args the command line arguments
     */
    public static String main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double valeur;
        double newval;
        System.out.println("Saisissez une valeur :");
        valeur = sc.nextDouble();
        System.out.println("Choisissez le numero de conversion souhaite :");
        System.out.println("1) Celcius vers Kelvin");
        System.out.println("2) Kelvin vers Celcius");
        System.out.println("3) Farenheit vers Celcius");
        System.out.println("4) Celcius vers Farenheit");
        System.out.println("5) Kelvin vers Farenheit");
        System.out.println("6) Farenheit vers Kelvin");
        int numconv = sc.nextInt();
        switch (numconv) {
            case 1 :
                newval = CelciusVersKelvin(valeur);
                return (valeur+" degré Celcius est égal à "+newval+" degrés Kelvin.");
            case 2 :   
                newval = KelvinVersCelcius(valeur);
                return (valeur+" degré Kelvin est égal à "+newval+" degrés Celcius.");
            case 3 :
                newval = FarenheitVersCelcius(valeur);
                return (valeur+" degré Farenheit est égal à "+newval+" degrés Celcius.");
            case 4 :
                newval = CelciusVersFarenheit(valeur);
                return (valeur+" degré Celcius est égal à "+newval+" degrés Farenheit.");
            case 5 :
                newval = KelvinVersFarenheit(valeur);
                return (valeur+" degré Kelvin est égal à "+newval+" degrés Farenheit.");
            case 6 :
                newval = FarenheitVersKelvin(valeur);
                return (valeur+" degré Farenheit est égal à "+newval+" degrés Kelvin.");
            default :
                System.out.println("Veuillez reessayer");
                numconv = sc.nextInt();
        }
    }
    
    public static double CelciusVersKelvin (Double tCelcius) {
        return (tCelcius + 273.15);
    }
    
    public static double KelvinVersCelcius (Double tKelvin) {
        return (tKelvin - 273.15);
    }
    
    public static double FarenheitVersCelcius (Double tFarenheit) {
        return (tFarenheit - 32);
    }
    
    public static double CelciusVersFarenheit (Double tCelcius) {
        return (tCelcius + 32);
    }
    
    public static double KelvinVersFarenheit (double tKelvin) {
        return (CelciusVersFarenheit(KelvinVersCelcius(tKelvin)));
    }
    
    public static double FarenheitVersKelvin (double tFarenheit) {
        return (CelciusVersKelvin(FarenheitVersCelcius(tFarenheit)));
    }
    
}
