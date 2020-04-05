/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snap_Shoes;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author neiln
 */
public class MySQLConnection{
 
    String url       = "jdbc:mysql://localhost:3306/snapshoes";
    String user      = "root";
    String password  = "Snapshoes1";
    Connection con;
    public Connection getConnect(){
    
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);       
         
        }
        catch(Exception e){
               JOptionPane.showMessageDialog(null, "Connection Not Successful " + e.getMessage());
         
        }
        
        return con;
    }
}