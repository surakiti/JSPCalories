/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author surakitisopontanapat
 */
public class Login {
    private int coin;
    
    
    public void logIn(String userName, String password) {
        Connection con = ConnectionBuilder.getConnection();
        try {
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM REGISTER WHERE USERNAME = ? AND PASSWORD = ?");
            pstm.setString(1, userName);
            pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                
                java.util.Date dNow = new java.util.Date( );
                SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-YYYY");
//              System.out.println("Current Date: " + ft.format(dNow));
                PreparedStatement pstmm = con.prepareStatement("UPDATE PROFILE SET LOGINDATE =? WHERE USERNAME = ?");
                pstmm.setString(1, ft.format(dNow));
                pstmm.setString(2, userName);
                
                pstmm.executeUpdate();
                
                pstmm.close();
                
                    
            }
            con.close();
            pstm.close();
        } catch (SQLException ex) {
            System.out.println("fail");;
        }

    }
    
     
}
