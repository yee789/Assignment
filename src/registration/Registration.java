package registration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import registration.addMenu;
public class Registration {
    
    
    ArrayList<addMenu> menu = new ArrayList<addMenu>();
    
    
    public void addFood(){
        String foodId  = "";
        String foodName = "";
        double price = 0;
        String food_descrip = "";
        String restaurant_name = "";
       // List menu = new ArrayList();
        Scanner scan = new Scanner(System.in);
        
        
        String ans =""; 
        do{

        
        
        
        
        System.out.println("Enter your food restaurant name :");
        restaurant_name = scan.nextLine();
        
        System.out.println("Enter your food name :");
        foodName = scan.nextLine();
        
        System.out.println("Enter your Food ID :");
        foodId = scan.nextLine();
        
        System.out.println("Enter your Food description :");
        food_descrip = scan.nextLine();
        
        System.out.println("Enter your food price :");
        price = scan.nextDouble();
        
        addMenu add1 = new addMenu(price,food_descrip,foodName,foodId,restaurant_name);
        menu.add(add1);
        /*addmenu.setDescrip(food_descrip);
        addmenu.setFoodName(foodName);
        addmenu.setFoodId(foodId);
        addmenu.setPrice(price);
        addmenu.setResName(restaurant_name);
        */
            scan.nextLine();
             System.out.println("do you want to continue? Yes/No");
             ans = (scan.nextLine()).toUpperCase();
        }while(ans.equalsIgnoreCase("Yes"));
    }
    
    public void showDetail(){
         for(int i=0; i<menu.size();++i){
         System.out.println("food id :"+menu.get(i).getFoodId());
         System.out.println("food description  :"+menu.get(0).getDescrip());
         System.out.println("food name :"+menu.get(i).getFoodName());
         System.out.println("price :"+menu.get(i).getPrice());
         System.out.println("Restaurant Name  :"+menu.get(i).getResName());     
         }
    }
    
    public static void main(String[] args) {
       Registration r = new Registration();
       r.addFood();
       r.showDetail();
    }
    
}
