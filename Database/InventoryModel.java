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
public class InventoryModel {

    //initializing the variables
    private String product_ID;
    private String product;
    private String manufacturer;
    private String location;
    private String msrp;
    private String unit_cost;
    private String discount;
    private String stock;
    private String delivery;

    //constructors
    public InventoryModel() {
    }
     public InventoryModel(String product_ID, String product, String manufacturer, String location, String msrp,String unit_cost,String discount,String stock, String delivery) {
        this.product_ID = product_ID;
        this.product = product;
        this.manufacturer = manufacturer;
        this.location = location;
        this.msrp = msrp;
        this.unit_cost = unit_cost;
        this.discount = discount;
        this.stock = stock;
        this.delivery = delivery;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

   //getter and setter methods
    public String getProduct_ID() {
        return product_ID;
    }

    public void setProduct_ID(String product_ID) {
        this.product_ID = product_ID;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMsrp() {
        return msrp;
    }

    public void setMsrp(String msrp) {
        this.msrp = msrp;
    }

    public String getUnit_cost() {
        return unit_cost;
    }

    public void setUnit_cost(String unit_cost) {
        this.unit_cost = unit_cost;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

   
}
