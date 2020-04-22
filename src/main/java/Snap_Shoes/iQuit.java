/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snap_Shoes;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author neiln
 */
public class iQuit {
    
private JFrame frame;

    public void quit(){
           // code to exit
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Shoe Inventory Management System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }

}
