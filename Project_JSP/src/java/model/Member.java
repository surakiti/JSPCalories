/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.Date;
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
public class Member {

    private String name;
    private String userName;
    private String password;
    private int pin;
    private int age;
    private String tel;
    private String email;
    private String sex;
    private double height;
    private double weight;
    private int coin;
    private long cusID;
    private String birthday;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Member() {
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getPin() {
        return pin;
    }

    public int getAge() {
        return age;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public String getSex() {
        return sex;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getCoin() {
        return coin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public long getCusID() {
        return cusID;
    }

//    public void setCusID(String username) {
//        try {
//            Connection con = ConnectionBuilder.getConnection();
//            PreparedStatement pstm = con.prepareStatement("SELECT CUSTID FROM REGISTER WHERE USERNAME = ?");
//            ResultSet rs = pstm.executeQuery();
//            while (rs.next()) {
//                this.cusID = rs.getLong("CUSTID");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    public void setCusID(long cusID) {
        this.cusID = cusID;
    }

    public void Register(String name, String userName, String password, int age, String tel, String email, String sex, double height, double weight, String birthday) {
        Connection con = ConnectionBuilder.getConnection();
        try { 

            PreparedStatement pstm2 = con.prepareStatement("INSERT INTO PROFILE (USERNAME,PASSWORD,NAME,AGE,TEL,EMAIL,SEX,HEIGHT,WEIGHT,BIRTHDAY) VALUES (?,?,?,?,?,?,?,?,?,?)");
            pstm2.setString(1, userName);
            pstm2.setString(2, password);
            pstm2.setString(3, name);
            pstm2.setInt(4, age);
            pstm2.setString(5, tel);
            pstm2.setString(6, email);
            pstm2.setString(7, sex);
            pstm2.setDouble(8, height);
            pstm2.setDouble(9, weight);
            pstm2.setString(10, birthday);

            pstm2.executeUpdate();
            
            pstm2.close();
            con.close();
                    
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editProfile(int age, String name, String tel, String email, double height, double weight, String birthday) {
        try {
            Connection con = ConnectionBuilder.getConnection();
            PreparedStatement pstm = con.prepareStatement("UPDATE PROFILE SET NAME=?,TEL=?,EMAIL=?,HEIGHT=?,WEIGHT=?,AGE = ?,BIRTHDAY=? WHERE CUSTID = ?");
            pstm.setString(1, name);
            pstm.setString(2, tel);
            pstm.setString(3, email);
            pstm.setDouble(4, height);
            pstm.setDouble(5, weight);
            pstm.setInt(6, age);
            pstm.setString(7, birthday);
            pstm.setLong(8, this.cusID);
            
            pstm.executeUpdate();
            
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Member showProfile(String username) {
        Connection con = ConnectionBuilder.getConnection();
        Member m = new Member();
        try {
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM PROFILE WHERE Username = ? ");
            pstm.setString(1, username);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                m.setCusID(rs.getLong("CUSTID"));
                m.setName(rs.getString("NAME"));
                m.setAge(rs.getInt("AGE"));
                m.setBirthday(rs.getString("BIRTHDAY"));
                m.setTel(rs.getString("TEL"));
                m.setEmail(rs.getString("EMAIL"));
                m.setSex(rs.getString("SEX"));
                m.setHeight(rs.getDouble("HEIGHT"));
                m.setWeight(rs.getDouble("WEIGHT"));
                m.setCoin(rs.getInt("COIN"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;
    }

    
}

