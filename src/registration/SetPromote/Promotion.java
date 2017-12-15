/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration.SetPromote;

import AddMenu.addMenu;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jc
 */
public class Promotion {
    String foodId;
    String food_descrip;
    String restaurant_name;
    String foodName;
    double price;
        public void SetPromotion(ArrayList<addMenu> update){
        
        
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
                System.out.println("Do you want set this food for promotion?");
                String check = scan.nextLine();
                if(check.equalsIgnoreCase("yes")){
                    System.out.println("Promotion!!!! here!!!!");
                    System.out.println("****************************");
                    System.out.println("food Id :"+foodId);
                    System.out.println("food name :"+foodName);
                    System.out.println("food description :"+food_descrip);
                    System.out.println("food restaurant name :"+restaurant_name);
                    System.out.println("food price :"+price);
                    
                    
                    for (int j = 0; j < update.size(); j++) {
                        if(!(s.equals(update.get(j).getFoodId()))){
                           
                            System.out.println("\n\nMenu");
                            System.out.println("**************");
                            System.out.println("food Id :"+update.get(j).getFoodId());
                            System.out.println("food name :"+update.get(j).getFoodName());
                            System.out.println("food description :"+update.get(j).getDescrip());
                            System.out.println("food restaurant name :"+update.get(j).getResName());
                            System.out.println("food price :"+update.get(j).getPrice());
                        }
                    }
                }
            }else{
                //System.out.println("this food id does no exist in menu!");
            }
        }
    
    }
}
