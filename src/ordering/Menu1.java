/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordering;
/**
 *
 * @author htchew
 */
public class Menu1 {
 

    private String menuID;
    private String menuName;
    private String menuDescription;
    private String restaurant;
    private double price;
    
    public Menu1(String menuID, String menuName, String menuDescription, String restaurant, double price){
    this.menuID=menuID;
    this.menuName=menuName;
    this.menuDescription=menuDescription;
    this.restaurant=restaurant;
    this.price=price;
    }
    
    public void setMenuID(String menuID){
    this.menuID=menuID;
    }
    
    public String getMenuID(){
    return menuID;
    }
    
    public void setMenuName(String menuName){
    this.menuName=menuName;
    }
    
    public String getMenuName(){
    return menuName;
    }
    
    public void setMenuDescription(String menuDescription){
    this.menuDescription=menuDescription;
    }
    
    public String getMenuDescription(){
    return menuDescription;
    }
    
     public void setRestaurant(String restaurant){
    this.restaurant=restaurant;
    }
    
    public String getRestaurant(){
    return restaurant;
    }
    
    public void setPrice(double price){
    this.price=price;
    }
    
    
    public double getPrice(){
    return price;
    }
    
    public String toString(){
    return String.format("%s %s %s %s %.2f",menuID, menuName, menuDescription, restaurant, price);
    }
    
}


