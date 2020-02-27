/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snap_Shoes;

import java.util.ArrayList;

/**
 *
 * @author neiln
 */
public class OO_Method {

    private String product_ID;
    private String product;
    private String model;
    private String manufacturer;
    private String type_code;
    private float msrp;
    private float unit_cost;
    private float discount;
    private int stock;
    
    ArrayList<String> ids = new ArrayList<>();
    ArrayList<String> products = new ArrayList<>();
    ArrayList<String> models = new ArrayList<>();
    ArrayList<String> manufacturers = new ArrayList<>();
    ArrayList<String> type_codes = new ArrayList<>();
    ArrayList<Float> msrps = new ArrayList<>();
    ArrayList<Float> unit_costs = new ArrayList<>();
    ArrayList<Float> discounts = new ArrayList<>();
    ArrayList<Integer> stocks = new ArrayList<>();
    
    public OO_Method (){
    }
    public OO_Method (String ID){
        this.product_ID = ID;
    }
    
    public OO_Method(String product_ID, String product,String model, String manufacturer, String type_code,float msrp,float unit_cost,float discount,int stock) {
        this.product_ID = product_ID;
        this.product = product;
        this.model = model;
        this.manufacturer = manufacturer;
        this.type_code = type_code;
        this.msrp = msrp;
        this.unit_cost = unit_cost;
        this.discount = discount;
        this.stock = stock;
    }

    public String getProduct_ID() {
        return product_ID;
    }

    public String getProduct() {
        return product;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType_code() {
        return type_code;
    }

    public float getMsrp() {
        return msrp;
    }

    public float getUnit_cost() {
        return unit_cost;
    }

    public float getDiscount() {
        return discount;
    }

    public int getStock() {
        return stock;
    }

 
    public void getID(String values){
        ids.add(values);
    }
    public void getProduct(String values){
        products.add(values);
    }
    public void getModel(String values){
        models.add(values);
    }
    public void getManufacturer(String values){
        manufacturers.add(values);
    }
    public void getType_codes(String values){
        type_codes.add(values);
    }
    public void getMsrps(float values){
        msrps.add(values);
    }
    public void getUnit_costs(float values){
        unit_costs.add(values);
    }
    public void getDiscounts(float values){
        discounts.add(values);
    }
    public void getStock(int values){
        stocks.add(values);
    }
    
    public int Index(String productId){
        return ids.indexOf(productId);
    }
    
    public String rProduct_ID(int value) {
        return ids.get(value);
    }

    public String rProduct(int value) {
        return products.get(value);
    }

    public String rModel(int value) {
        return models.get(value);
    }

    public String rManufacturer(int value) {
        return manufacturers.get(value);
    }

    public String rType_code(int value) {
        return type_codes.get(value);
    }

    public float rMsrp(int value) {
        return msrps.get(value);
    }

    public float rUnit_cost(int value) {
        return unit_costs.get(value);
    }

    public float rDiscount(int value) {
        return discounts.get(value);
    }

    public int rStock(int value) {
        return stocks.get(value);
    }
    public void addProduct(String product_ID, String product,String model, String manufacturer, String type_code,float msrp,float unit_cost,float discount,int stock){
        getID(product_ID);
        getProduct(product);
        getModel(model);
        getManufacturer(manufacturer);
        getType_codes(type_code);
        getMsrps(msrp);
        getUnit_costs(unit_cost);
        getDiscounts(discount);
        getStock(stock);
        
    }
    
    public void removeProduct(String product_ID){
        int index = ids.indexOf(product_ID);
        ids.remove(product_ID);
        products.remove(index);
        models.remove(index);
        manufacturers.remove(index);
        type_codes.remove(index);
        msrps.remove(index);
        unit_costs.remove(index);
        discounts.remove(index);
        stocks.remove(index);
    }

    public void displayProduct(){
        getID(product_ID);
        getProduct(product);
        getModel(model);
        getManufacturer(manufacturer);
        getType_codes(type_code);
        getMsrps(msrp);
        getUnit_costs(unit_cost);
        getDiscounts(discount);
        getStock(stock);
    }
    
    public void updateProduct(String product_ID, String product,String model, String manufacturer, String type_code,float msrp,float unit_cost,float discount,int stock){
        int index = ids.indexOf(product_ID);
        
        getID(product_ID);
        getProduct(product);
        getModel(model);
        getManufacturer(manufacturer);
        getType_codes(type_code);
        getMsrps(msrp);
        getUnit_costs(unit_cost);
        getDiscounts(discount);
        getStock(stock);
    }
    
}

