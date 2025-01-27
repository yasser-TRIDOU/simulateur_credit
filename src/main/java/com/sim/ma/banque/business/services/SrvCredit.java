package com.sim.ma.banque.business.services;

public class SrvCredit implements IntSrvCredit{


    @Override
    public double calculateCredit(double amount, double taux, int duree) {
        double t = taux / 100;
        double t1 = amount * t / 12;
        double t2 = 1 - Math.pow(1 + t / 12, - duree);
        return t1 / t2;
    }
}
