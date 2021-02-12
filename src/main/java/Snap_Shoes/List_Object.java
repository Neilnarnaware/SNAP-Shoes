/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snap_Shoes;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author neiln
 */
public class List_Object {
   
    //object orienter methods
    final private JButton updateButtonButton ;
    final private JButton deleteButtonButton;
    ListModel lm1 = new ListModel("1", "Jordans", "Nike", "Jordans", "123", "50", "201", "200", "220", "50");
        ListModel lm2 = new ListModel("2", "Airforce", "Puma", "Nike", "1234","50", "201", "200", "220", "50");
        ListModel lm3 = new ListModel("3", "NIke", "One", "Nike", "12","50", "201", "200", "220", "50");
        ListModel lm4 = new ListModel("4", "Puma", "Two", "Nike", "123", "50", "201", "200", "220", "50");
        ListModel lm5 = new ListModel("5", "Supra", "Three", "Nike", "13","50", "201", "200", "220", "50");
        ListModel lm6 = new ListModel("6", "Converse", "Four", "Nike", "23","50", "201", "200", "220", "50");
        ListModel lm7 = new ListModel("7", "Vans", "Five", "Nike", "1235", "50", "201", "200", "220", "50");
        ListModel lm8 = new ListModel("8", "HRX", "Six", "Nike", "23", "50", "201", "200", "220", "50");
        ListModel lm9 = new ListModel("9", "Adidas", "Seven", "Nike", "3", "50", "201", "200", "220", "50");
    
    ArrayList<ListModel> dataStock = new ArrayList<>(){{add(lm1);add(lm2);add(lm3);add(lm4);add(lm5);add(lm6);add(lm7);add(lm8);add(lm9);}};
    public  List_Object(JButton updateButton, JButton deleteButton){
        this.updateButtonButton = updateButton;
        this.deleteButtonButton  = deleteButton;
        Buttons();

    }
    public  List_Object(ArrayList<ListModel> dataStock, JButton updateButton, JButton deleteButton){
        this.dataStock = dataStock;
        this.updateButtonButton = updateButton;
        this.deleteButtonButton  = deleteButton;
     
        Buttons();
    }
    
    public void Buttons(){
        updateButtonButton.setText("Update");
        deleteButtonButton.setText("Delete");
    }
    public ListModel addProduct(ListModel lm){
      
        dataStock.add(lm);
        return lm;
    }
    
    
    public ArrayList<ListModel> displayProduct(){
        return dataStock ;
    }
    
}
