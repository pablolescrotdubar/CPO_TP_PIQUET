/*
Nicolas Piquet
TP0
25 septembre 2023 
 */
package calculator;

import java.util.Scanner;


/**
 *
 * @author nicol
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int operateur;
        System.out.println("Please enter the operator :"+"\n1)add"+"\n2)substract"+"\n3)multiply"+"\n4)divide"+"\n5)modulo");
        Scanner sc=new Scanner(System.in);
        
        do {
            System.out.println("\n Entrez le numero de votre operation :");
            operateur=sc.nextInt();//On demande a sc de donner le prochain entier
            if (operateur < 1 || operateur > 5) {
                System.out.println("erreur");
            }
        } while (operateur < 1 || operateur > 5);
        
        System.out.println("Entrez une premiere valeur :");
        
        double operande1 = sc.nextInt();
        
        System.out.println("Entrez une deuxieme valeur :");
        
        double operande2 = sc.nextInt();
        
        System.out.println();
        
        double resultat = 0;
        
        switch (operateur)  {
            case 1 :
                resultat = operande1+operande2;
            case 2 :
                resultat = operande1-operande2;
            case 3 :
                resultat = operande1*operande2; 
            case 4 :
                resultat = operande1/operande2;   
            case 5 :
                resultat = operande1 % operande2;    
        }
        
        System.out.println(resultat);
    }
    
}
