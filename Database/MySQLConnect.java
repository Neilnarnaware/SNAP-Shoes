/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snap_Shoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author neiln
 */
public class MySQLConnect {
 
    String url       = "jdbc:mysql://localhost:3306/mysql";
    String user      = "root";
    String password  = "";
    Connection con;
    public Connection getConnect(){
    
    	 try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
          System.out.println("Xampp Mysql Connected..");
          Statement stat = con.createStatement();
          stat.executeUpdate("CREATE DATABASE PROGRAMS");
  	   } 
         
        
        catch(Exception e){
               JOptionPane.showMessageDialog(null, "Connection Not Successful " + e.getMessage());
         
        }
        
        return con;
    }
}
