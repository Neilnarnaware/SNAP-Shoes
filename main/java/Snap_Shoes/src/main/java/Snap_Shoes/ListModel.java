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
public class ListModel {

    private String product_ID;
    private String product;
    private String model;
    private String manufacturer;
    private String type_code;
    private String location;
    private String msrp;
    private String unit_cost;
    private String discount;
    private String stock;
    
    public ListModel() {
    }
     public ListModel(String product_ID, String product,String model, String manufacturer, String type_code,String location, String msrp,String unit_cost,String discount,String stock) {
        this.product_ID = product_ID;
        this.product = product;
        this.model = model;
        this.manufacturer = manufacturer;
        this.type_code = type_code;
        this.location = location;
        this.msrp = msrp;
        this.unit_cost = unit_cost;
        this.discount = discount;
        this.stock = stock;
       
    }
   public ListModel(String product_ID, String product,String model, String manufacturer, String unit_cost,String discount) {
        this.product_ID = product_ID;
        this.product = product;
        this.model = model;
        this.manufacturer = manufacturer;
        this.unit_cost = unit_cost;
        this.discount = discount;
        
    }

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType_code() {
        return type_code;
    }

    public void setType_code(String type_code) {
        this.type_code = type_code;
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
