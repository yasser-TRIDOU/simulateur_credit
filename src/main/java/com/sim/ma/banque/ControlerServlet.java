package com.sim.ma.banque;

import java.io.*;

import com.sim.ma.banque.business.services.IntSrvCredit;
import com.sim.ma.banque.business.services.SrvCredit;
import com.sim.ma.banque.model.CreditModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "controlerServlet", value = {"/controler-servlet", "*.do"})
public class ControlerServlet extends HttpServlet {

    private IntSrvCredit creditSrv;

    public void init() {
        creditSrv = new SrvCredit();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        CreditModel credit = new CreditModel();
        credit.setMontant(0);
        credit.setTaux(0);
        credit.setDuree(0);
        credit.setMonsualite(0);
        request.setAttribute("credit",credit);
        request.getRequestDispatcher("vueCredit.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            double montant = Double.parseDouble(request.getParameter("montant"));
            double taux = Double.parseDouble(request.getParameter("taux"));
            int duree = Integer.parseInt(request.getParameter("duree"));
            CreditModel creditModel = new CreditModel(montant, taux, duree);
            double res = creditSrv.calculateCredit(montant, taux, duree);
            creditModel.setMonsualite(res);
            request.setAttribute("credit", creditModel);
            request.getRequestDispatcher("vueCredit.jsp").forward(request, response);
    }

    public void destroy() {
    }
}