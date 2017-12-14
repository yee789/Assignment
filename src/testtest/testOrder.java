/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtest;

import java.util.List;
import java.util.*;
/**
 *
 * @author htchew
 */
public class testOrder {
    
    private int custID;
    private int orderID;
    private String contactNum;
    private String restaurant;
    //private String orderTime;
    private String menuID;
    private String menuName;
    private String menuDescription;
    private double price;
    private int qty;
    private String status;
    
    //private int firstID=1000;
    
    testOrder( int custID, int orderID,String contactNum, String restaurant, String menuID,String menuName, String menuDescription, double price, int qty, String status){
    this.orderID=orderID;
    this.restaurant=restaurant;
    //this.orderTime=orderTime;
    this.contactNum=contactNum;
    this.menuID=menuID;
    this.custID = custID;
    this.menuName=menuName;
    this.menuDescription=menuDescription;
    this.price=price;
    this.qty=qty;
    this.status=status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void setOrderID(int orderID){
    this.orderID=orderID;
    }
    
    public int getOrderID(){
    return orderID;
    }
    
    public void setRestaurant(){
    this.restaurant=restaurant;
    }
    
    public String getRestaurant(){
    return restaurant;
    }
    
   /* public void orderTime(String orderTime){
    this.orderTime=orderTime;
    }
    
    
    public static String getTime(Calendar time){
    return String.format("%02d:%02d:%02d", time.get(Calendar.HOUR_OF_DAY),
            time.get(Calendar.MINUTE), time.get(Calendar.SECOND));
    }*/
    
    /*public String toString(){
        return String.format("%d %s %s %s", orderID, restaurant, orderTime, orderList);
    }*/

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    /*public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }*/

    public String getMenuID() {
        return menuID;
    }

    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

 
   
}
