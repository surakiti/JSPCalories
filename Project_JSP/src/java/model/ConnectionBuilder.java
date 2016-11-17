/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author programming
 */
public class ConnectionBuilder {
    public static Connection getConnection() {
        Connection connn = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            System.out.println("A");
//            Get a connection
            connn = DriverManager.getConnection("jdbc:derby://localhost:1527/Calories","cal","cal");
            System.out.println("B");
        } catch (ClassNotFoundException | SQLException except) {
            System.out.println(except.toString());
        } catch (InstantiationException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }

        return connn;
    }
    
    public static void main(String[] args) {
        Connection conn = getConnection();
        System.out.println(conn);
    }
}
