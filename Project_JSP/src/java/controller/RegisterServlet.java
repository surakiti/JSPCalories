/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CaloriesBMI;
import model.Member;

/**
 *
 * @author surakitisopontanapat
 */
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String userName = request.getParameter("form-username");
        String name = "";
        String password = "";
//        String pin = "0";
        String tel = "";
        String email = "";
        String sex = "";
        String height = "0";
        String weight = "0";
        String birthday = "";
        String age = "0";
        double height_pas = 0.0;
        double weight_pas = 0.0;
        int pin_pas = 0;
        int age_past = 0;
//        System.out.println(request.getParameter("form-username")+"asd");
        if (userName != null) {
//            System.out.println("inifff");
            name = request.getParameter("form-full-name");
            userName = request.getParameter("form-username");
            System.out.println(name);
            password = request.getParameter("form-password");
//           pin = request.getParameter("form-pin");
            tel = request.getParameter("form-full-name");
            email = request.getParameter("form-email");
            sex = request.getParameter("form-gender");
            height = request.getParameter("form-height");
            weight = request.getParameter("form-weight");
            birthday = request.getParameter("form-date");
            age = request.getParameter("form-age");

            height_pas = Double.parseDouble(height);
            weight_pas = Double.parseDouble(weight);
//            pin_pas = Integer.parseInt("0");
            age_past = Integer.parseInt(age);

            Member mem = new Member();
            mem.Register(name, userName, password, age_past, tel, email, sex, height_pas, weight_pas, birthday);

            CaloriesBMI cr = new CaloriesBMI();
            cr.checkStatus(cr.BMI(weight_pas, height_pas));
            cr.CalPerDay(sex, weight_pas, height_pas, age_past);
            cr.UpdateBMI(userName);

        } else {
            getServletContext().getRequestDispatcher("/LoginUser.jsp").forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
