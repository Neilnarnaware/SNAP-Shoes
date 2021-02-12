/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snap_Shoes;

import javax.swing.JButton;

/**
 *
 * @author neiln
 */
public class ManufacturerModel {

    //initializing the variables
        String name;
        String product;
        String quantity;
        String delivery;
        String location;
        String pricing;
        String plan;

    public ManufacturerModel(String name, String product,String quantity, String delivery, String location, String pricing, String plan) {
        this.name = name;
        this.product = product;
        this.quantity = quantity;
        this.delivery = delivery;
        this.location = location;
        this.pricing = pricing;
        this.plan = plan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPricing() {
        return pricing;
    }

    public void setPricing(String pricing) {
        this.pricing = pricing;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
    
    //constructors
    public ManufacturerModel() {
    }
    

  
   
}
