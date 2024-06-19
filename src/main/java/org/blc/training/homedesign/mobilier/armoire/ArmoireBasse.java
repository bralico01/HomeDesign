/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.blc.training.homedesign.mobilier.armoire;

/**
 *
 * @author r.hendrick
 */
public class ArmoireBasse {

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

    public void createRandom() {

        generateNom();
        generatePied();
        generateCouleur();
        generateLongueur();
        generateLargeur();
        generateHauteur();
    }

    public void display() {

    }

    /**
     * Chaque armoire va porter le nom par défaut avec le préfeixe AB_####
     */
    private void generateNom() {
        generateNomBySubStr();
    }

    private void generateNomByWhile() {
        // Génération d'un nombre aléatoire entre 0 et 9999
        Integer nombreAleatoire = (int) (Math.random() * 9999.0);

        // Ajuster le format du nombre sur 4 digit        
        String nombreAleatoireStr = String.valueOf(nombreAleatoire);
        while (nombreAleatoireStr.length() < 4) {
            nombreAleatoireStr = "0" + nombreAleatoireStr;
        }

        // Concatener le nom avec le prefixe
        nom = "AB_" + nombreAleatoireStr;

    }
    
    
    private void generateNomBySubStr() {
        // Génération d'un nombre aléatoire entre 0 et 9999
        Double nombreAleatoire = Math.random();

        // Ajuster le format du nombre sur 4 digit        
        String nombreAleatoireStr =
                String.valueOf(nombreAleatoire).substring(2, 6);

        // Concatener le nom avec le prefixe
        nom = "AB_" + nombreAleatoireStr;

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
