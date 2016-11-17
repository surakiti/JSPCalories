/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author surakitisopontanapat
 */
public class CaloriesBMI {

    private String sex;
    private double height;
    private double weight;
    private double calories;
    private double calperday;
    private double BMI;
    private int age;
    private String status;

    public CaloriesBMI() {
    }

    public CaloriesBMI(String sex, double height, double weight, double calories, double calperday, double BMI, int age, String status) {
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.calories = calories;
        this.calperday = calperday;
        this.BMI = BMI;
        this.age = age;
        this.status = status;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCalperday() {
        return calperday;
    }

    public void setCalperday(double calperday) {
        this.calperday = calperday;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double BMI(double weight, double height) {
        this.height = height;
        this.weight = weight;
        double heightMetre = height / 100.0;
        this.BMI = weight / (heightMetre * heightMetre);

        return BMI;
    }

    public String checkStatus(double BMI) {
        if (this.BMI <= 18.5) {
            this.status = "skinny";
        } else if (this.BMI > 18.5 && this.BMI <= 22.9) {
            this.status = "Thin";
        } else if (this.BMI > 22.9 && this.BMI <= 24.9) {
            this.status = "Of average build";
        } else if (this.BMI > 24.9 && this.BMI <= 29.9) {
            this.status = "fat";
        } else if (this.BMI > 29.9) {
            this.status = "very fat";
        }
        return this.status;
    }

    public double CalPerDay(String sex, double weight, double height, int age) {
        
        double cal = 0.0;  
       
            if (sex.equalsIgnoreCase("male")) {
                cal = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
            } else {
                cal = 665 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
            }
            this.calories = cal;
            this.calperday = cal;
            
           
            
        
            
        
        return cal;
    }
    
    public void UpdateBMI(String userName){
        Connection con = ConnectionBuilder.getConnection();
        try {
            PreparedStatement pstm = con.prepareStatement("UPDATE PROFILE SET CAL=?,CALPERDAY=? ,STATUS=? ,BMI=? WHERE username LIKE ?");
            pstm.setDouble(1, this.calories);
            pstm.setDouble(2, this.calperday);
            pstm.setString(3, this.status);
            pstm.setDouble(4, this.BMI);
            pstm.setString(5, userName);
            pstm.executeUpdate();
            
            con.close();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(CaloriesBMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

}
