/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.blc.training.homedesign.mobilier;

/**
 *
 * @author r.hendrick
 */
public class Table {


    private String couleur;
    private Float longuer;
    private Float largeur;
    private Float hauteur;
    private Float epaisseur;
    /**
     * Nombre de pied de la table
     */
    private Integer pied;
    private String couleurPied;

    /**
     * Nom de la table
     */
    private String nom;
    private String reference;

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Float getLonguer() {
        return longuer;
    }

    public void setLonguer(Float longuer) {
        this.longuer = longuer;
    }

    public Float getLargeur() {
        return largeur;
    }

    public void setLargeur(Float largeur) {
        this.largeur = largeur;
    }

    public Float getHauteur() {
        return hauteur;
    }

    public void setHauteur(Float hauteur) {
        this.hauteur = hauteur;
    }

    public Float getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(Float epaisseur) {
        this.epaisseur = epaisseur;
    }

    public Integer getPied() {
        return pied;
    }

    public void setPied(Integer pied) {
        this.pied = pied;
    }

    public String getCouleurPied() {
        return couleurPied;
    }

    public void setCouleurPied(String couleurPied) {
        this.couleurPied = couleurPied;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setTaille(float longueur, float largeur, float hauteur) {
//        this.largeur = largeur;
//        this.hauteur = hauteur;
//        this.longuer = longueur;

        setLargeur(largeur);
        setLonguer(longueur);
        setHauteur(hauteur);
    }

    public void show() {
        System.out.println("==============");
        System.out.println("Nom : " + this.nom);
        System.out.println("Pide(s) : " + this.pied);
        System.out.println("Couleur : " + this.couleur);
        System.out.println("Taille === ");
        System.out.println("> Longueur : " + this.longuer);
        System.out.println("> Largeur : " + this.largeur);
        System.out.println("> Hauteur : " + this.hauteur);
    }
    
    
    public static void show(Table table) {
        System.out.println("==============");
        System.out.println("Nom : " + table.nom);
        System.out.println("Pide(s) : " + table.pied);
        System.out.println("Couleur : " + table.couleur);
        System.out.println("Taille === ");
        System.out.println("> Longueur : " + table.longuer);
        System.out.println("> Largeur : " + table.largeur);
        System.out.println("> Hauteur : " + table.hauteur);
    }

    /**
     * Consiste à générer les informations aléatoire attribut après attribut
     */
    public void generate() {
        generateNom();
        generatePied();
        generateCouleur();
        generateLongueur();
        generateLargeur();
        generateHauteur();
    }

    private void generateNom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void generatePied() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void generateCouleur() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void generateLongueur() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void generateLargeur() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void generateHauteur() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
