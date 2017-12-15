package update;

import java.util.ArrayList;
import java.util.Scanner;
import registration.Register;
import AddMenu.AddFoodMenu;
import AddMenu.addMenu;

public class update implements updateInterface {
    // ArrayList<Register> register = new ArrayList<Register>();

    Register r = new Register();
    Scanner scan = new Scanner(System.in);
    addMenu m = new addMenu();
    String foodId;
    String food_descrip;
    String restaurant_name;
    String foodName;
    double price;
    
    
    
    public void updateInfo(ArrayList<addMenu> update) {
        
        
        foodId = update.get(0).getFoodId();
        food_descrip = update.get(0).getDescrip();
        restaurant_name = update.get(0).getResName();
        foodName = update.get(0).getFoodName();
        price = update.get(0).getPrice();
        
        
        System.out.println("select your choose to change your information :");
        System.out.println("1. Food Id");
        System.out.println("2. Food Name");
        System.out.println("3. Restaurant Name");
        System.out.println("4. Food derecription");
        System.out.println("5. Price");
        int ans = scan.nextInt();
        scan.nextLine();
        switch (ans) {
            case 1:
                updateFoodId();
                break;
            case 2:
                updateFoodName();
                break;
            case 3:
                updateRestauramtName();
                break;
            case 4:
                updateFoodDescription();
                break;
            case 5:
                updatePrice();
                break;
        }
       
        m.setFoodId(foodId);
        m.setFoodName(foodName);
        m.setResName(restaurant_name);
        m.setPrice(price);
        m.setDescrip(food_descrip);
        
        update.set(0, m);
        
        System.out.println("updated! this is your new information!");
        System.out.println("FoodId : "+foodId);
        System.out.println("Restaurant Name : "+this.restaurant_name);
        System.out.println("Food Name : "+this.foodName);
        System.out.println("Food description : "+this.food_descrip);
        System.out.println("Price : RM "+price);
        
        
    }

    public static void main(String[] args) {

    }

    @Override
    public void updateFoodId() {
        System.out.print("now your food Id is :");
        System.out.print(foodId);
        System.out.print("\n");
        System.out.println("Enter your new food Id");

        foodId = scan.nextLine();

    }

    @Override
    public void updateFoodName() {
        System.out.println("Enter your Food Name");
        System.out.print(foodName);
            System.out.println("Enter your new Food Name");
            String NewFoodName = scan.nextLine();
            if (NewFoodName.equals(foodId)) {
               System.out.println("the new food name same as the old food please enter a diffrent new food name");
               NewFoodName = scan.nextLine();
        }else{
               foodName = NewFoodName;
            }

    }

    @Override
    public void updateRestauramtName() {
        System.out.print("Your current resttaurant Name is :");
        System.out.print(restaurant_name);
        System.out.print("\n");
        System.out.println("Enter your new restaurant Name");

        restaurant_name = scan.nextLine();
    }

    @Override
    public void updatePrice() {
        System.out.print("Your current price is :");
        System.out.print(price);
        System.out.print("\n");
        System.out.println("Enter your new price");
        
        double newprice = scan.nextDouble();
        String check = Double.toString(newprice);
        if (check.isEmpty()) {
            System.out.println("enter value cannot be empty");
        }else{
            
            if (newprice == 0) {
                System.out.println("the price cannot be 0. Please Enter Again!!");
                updatePrice();
            }
        
            else
            {
                price = newprice;
            }
        }
    }

    @Override
    public void updateFoodDescription() {
        System.out.print("Your current food description is :");
        System.out.print(food_descrip);
        System.out.print("\n");
        System.out.println("Enter your new food description");
        food_descrip = scan.nextLine();
    }

}
