/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.blc.training.homedesign;

import org.blc.training.homedesign.mobilier.Table;

/**
 *
 * @author r.hendrick
 */
public class HomeDesign {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Table dt = new Table();
        Table dm = new Table();

        dt.setNom("DT");
        dt.setPied(2);
        dt.setCouleur("brun");
        dt.setTaille(150f, 90f, 90f);
        dt.show();
//        dt.setLonguer(150f);
//        dt.setLargeur(90f);
//        dt.setHauteur(90f);

        dm.setNom("DM");
        dm.setPied(6);
        dm.setCouleur("bois clair");
        dm.setTaille(200f, 90f, 90f);
        dm.show();
//        dt.setLonguer(200f);
//        dt.setLargeur(90f);
//        dt.setHauteur(90f);

//        t.setNom("Ma table");
//        System.out.println("Nom de ma table " + t.getNom());
//        t.setNom("Prout");
//        System.out.println("Nom de ma table " + t.getNom());

        Table.show(dm);
        
        Table [] tables = new Table[50];
        // Remplir le comptenu
        for(int i =0; i < tables.length; i++){
            tables[i].generate();
        }
        for(int i =0; i < tables.length; i++){
            tables[i].show();
        }
    }
}
