/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webtonicassessment;
import java.sql.*; 
/**
 *
 * @author Paseka
 */
public class DBConnect {
 
     public static void main(String args[]){ 
         
         
    try{
        
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/csvdb","root","admin?autoReconnect=true&useSSL=false");  

        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from csvdata");  
    while(rs.next())  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
        con.close();  
    }catch(Exception e){
        
        System.out.println(e); 
    } 
    }
   
}