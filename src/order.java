/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author htchew
 */
public class order {
    private int orderID;
    private String restaurant;
    private String orderTime;
    private List<ordering> orderList;
    //private int firstID=1000;
    
    order(int orderID, String restaurant, String orderTime, List<ordering> orderList){
    this.orderID=orderID;
    this.restaurant=restaurant;
    this.orderTime=orderTime;
    this.orderList=orderList;
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
    
    public void orderTime(String orderTime){
    this.orderTime=orderTime;
    }
    /*
    public static String getTime(Calendar time){
    return String.format("%02d:%02d:%02d", time.get(Calendar.HOUR_OF_DAY),
            time.get(Calendar.MINUTE), time.get(Calendar.SECOND));
    }*/
    
    public String toString(){
        return String.format("%d %s %s %s", orderID, restaurant, orderTime, orderList);
    }
}
