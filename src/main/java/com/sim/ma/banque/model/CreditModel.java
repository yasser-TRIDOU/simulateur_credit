package com.sim.ma.banque.model;

public class CreditModel {



    private double montant;
    private double taux;
    private int duree;
    private double monsualite;

    public CreditModel(double montant, double taux, int duree) {
        this.montant = montant;
        this.taux = taux;
        this.duree = duree;
    }

    public CreditModel() {
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }


    public double getMonsualite() {
        return monsualite;
    }

    public void setMonsualite(double monsualite) {
        this.monsualite = monsualite;
    }


}
