/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration.deleteFoodMenu;

import AddMenu.addMenu;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jc
 */
public class deleteMenu {
    String foodId;
    String food_descrip;
    String restaurant_name;
    String foodName;
    double price;
    
    public void deleteMenu(ArrayList<addMenu> update){
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter your food id :");
        String s = scan.nextLine();
        for (int i = 0; update.size() > i; i++) {
            if(s.equals(update.get(i).getFoodId())){
                foodId = update.get(i).getFoodId();
                food_descrip = update.get(i).getDescrip();
                restaurant_name = update.get(i).getResName();
                foodName = update.get(i).getFoodName();
                price = update.get(i).getPrice();
                
                System.out.println("food Id :"+foodId);
                System.out.println("food name :"+foodName);
                System.out.println("food description :"+food_descrip);
                System.out.println("food restaurant name :"+restaurant_name);
                System.out.println("food price :"+price);
                
                
                System.out.println("");
                System.out.println("Do you want to delete this menu?");
                String check = scan.nextLine();
                if(check.equalsIgnoreCase("yes")){
                    update.remove(i);
                    System.out.println("menu have been deleted!");
                }
            }else{
                System.out.println("this food id does no exist in menu!");
            }
        }
    
    }
}
