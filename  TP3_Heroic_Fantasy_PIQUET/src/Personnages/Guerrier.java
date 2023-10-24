/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author nicol
 */
public class Guerrier extends Personnage{
    
    boolean aCheval;
    private static int nbguerriers = 0;

    public Guerrier(String nom, int niveaudevie, boolean aCheval) {
        super(nom, niveaudevie);
        this.aCheval = aCheval;
        nbguerriers += 1;
    }

    public void setaCheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    @Override
    public String toString() {
        return "Guerrier{aCheval=" + aCheval + super.toString()+'}';
    }
    

    public static int getNbguerriers() {
        return nbguerriers;
    }
    
    @Override
    public void estAttaqué(int points) {
        niveaudevie -= points;
    }
    
}
