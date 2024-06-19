/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.blc.training.homedesign.mobilier;

import java.util.Random;
import org.blc.training.homedesign.mobilier.armoire.ArmoireHaute;
import org.blc.training.homedesign.mobilier.armoire.ArmoireBasse;

/**
 *
 * Type : <br>
 * 1 : armoire basse, 2: Armoire Haute
 *
 * @author r.hendrick
 */
public class Armoire {

    private ArmoireBasse armoireBasse;
    private ArmoireHaute armoireHaute;
    private Integer type = 1; // default armoire basse

    public void createRandom() {
        generateType();

        switch (type) {
            case 1:
                armoireBasse.createRandom();
                break;
            case 2:
                armoireHaute.createRandom();
                break;
            case 3:
                break;
            default:
                System.out.println("Attention, le type " + type + " n'est pas "
                        + "définit retour sur l'armoire basse !");
                armoireBasse.createRandom();
                break;
        }

    }

    public void display() {

        switch (type) {
            case 1:
                armoireBasse.display();
                break;
            case 2:
                armoireHaute.display();
                break;
            case 3:
                break;
            default:
                System.out.println(getClass().getSimpleName() + " >> Display : "
                        + "Attention, le type " + type + " n'est pas "
                        + "définit retour sur l'armoire basse !");
                armoireBasse.display();
                break;
        }
    }

    /**
     *
     */
    private void generateType() {
        type = ((int) (Math.random() * 1.0)) + 1;
    }
    
   

}
