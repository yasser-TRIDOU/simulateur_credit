package com.sim.ma.banque.services;

import com.sim.ma.banque.business.services.IntSrvCredit;
import com.sim.ma.banque.business.services.SrvCredit;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SrvCreditTest {

    public static IntSrvCredit srvc;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        srvc = new SrvCredit() ;
    }

    @Test
    public void testSrvCredit() {
        double amount = 200000;
        double taux = 4.5;
        int duree = 240;

        double resatt = 1265.2987;
        double resCalcule = srvc.calculateCredit(amount, taux, duree);
        assertEquals(resatt, resCalcule, 0.0001);
    }

}