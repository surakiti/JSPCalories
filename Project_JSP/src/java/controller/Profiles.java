/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ConnectionBuilder;

/**
 *
 * @author surakitisopontanapat
 */
public class Profiles extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        String message = "";
        HttpSession session = request.getSession();
        Connection con = ConnectionBuilder.getConnection();
        Statement s = null;
        DecimalFormat df = new DecimalFormat("##.##");
        DecimalFormat df1 = new DecimalFormat("##");
        df.applyPattern("##.##");
        Long log = (Long) session.getAttribute("custID");
        String name = "";
        String age = "";
        String sex = "";
        String height = "";
        String weight = "";
        String bmi = "";
        String calperday = "";
        String coin="";
        if (log != null) {
            s = con.createStatement();
            String sql = "SELECT * FROM  profile WHERE custId =" + log;
            ResultSet rec;
            rec = s.executeQuery(sql);
            if (rec.next()) {
                sex = rec.getString("sex");
                name = rec.getString("name");
                age = rec.getString("age");
                height = rec.getString("height");
                weight = rec.getString("weight");
                bmi = rec.getString("bmi");
                calperday = rec.getString("calperday");
                coin = rec.getString("coin");
                
            }
            request.setAttribute("coin",coin);
            request.setAttribute("sex", sex);
            System.err.print(sex);
            request.setAttribute("name", name);
            request.setAttribute("age", age);
            request.setAttribute("height", df1.format(Double.parseDouble(height))+"      cm");
            request.setAttribute("weight", df1.format(Double.parseDouble(weight))+"      kg");
            request.setAttribute("bmi", df.format(Double.parseDouble(bmi)));
            request.setAttribute("calperday", df1.format(Double.parseDouble(calperday)));
            getServletContext().getRequestDispatcher("/Profiles.jsp").forward(request, response);
        }
        getServletContext().getRequestDispatcher("/LoginUser.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Profiles.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Profiles.class.getName()).log(Level.SEVERE, null, ex);
        }
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
