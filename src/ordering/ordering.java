/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author htchew
 */
package ordering;
class ordering {
    private String menuID;
    private String menuName;
    private String menuDescription;
    private double price;
    private int qty;
    
    ordering(String menuID, String menuName, String menuDescription, double price, int qty){
    this.menuID=menuID;
    this.menuName=menuName;
    this.menuDescription=menuDescription;
    this.price=price;
    this.qty=qty;
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
    
    public void setPrice(double price){
    this.price=price;
    }
    
    public double getPrice(){
    return price;
    }
    
    public void setQty(int qty){
    this.qty=qty;
    }
    
    public int getQty(){
    return qty;
    }
    
    public String toString(){
    return String.format("%s %s %s %.2f",menuID, menuName, menuDescription, price);
    }
}

