package registration;

import AddMenu.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import AddMenu.addMenu;
import update.update;

        
        
        
        
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
public class Registration {

    static ArrayList<Register> register = new ArrayList<Register>();

    public void addUser() {
        String contactNo;
        String address;
        String email;
        String userid;
        String companyName;
        String password;
        // List Register = new ArrayList();
        Scanner scan = new Scanner(System.in);


            System.out.println("Enter your User Id :");
            userid = scan.nextLine();

            System.out.println("Enter your Campany Name :");
            companyName = scan.nextLine();

            System.out.println("Enter your Password :");
            password = scan.nextLine();

            String checkPassword = "";
            System.out.println("Enter your password(for double check):");
            checkPassword = scan.nextLine();

            System.out.println("Enter your Email :");
            email = scan.nextLine();

            System.out.println("Enter your contact Number :");
            contactNo = scan.nextLine();

            System.out.println("Enter your address :");
            address = scan.nextLine();

            if (checkPassword.equals(password)) {
                Register add1 = new Register(userid, companyName, password, email, contactNo, address);
                register.add(add1);
            } else {
                System.out.println("invalid password");
                addUser();
            }
    }

    public void showDetail() {
        for (int i = 0; i < register.size(); ++i) {
            System.out.println("User id :" + register.get(i).getUserId());
            System.out.println("Company Name  :" + register.get(0).getCompanyName());
            System.out.println("password :" + register.get(i).getPassword());
            System.out.println("email :" + register.get(i).getEmail());
            System.out.println("Contact Number  :" + register.get(i).getContactNo());
            System.out.println("address :" + register.get(i).getAddress());
        }
    }

    public static void main(String[] args) {
        Registration r = new Registration();
        Scanner scan = new Scanner(System.in);
        update update = new update();
        AddFoodMenu addmenu = new AddFoodMenu();
        String answer = "";
        do {

            System.out.println("select to your choose :");
            System.out.println("1. register");
            System.out.println("2. add menu");
            System.out.println("3. update status");
            //scan.nextLine();
            int ans = scan.nextInt();
            switch (ans) {
                case 1:
                    r.addUser();
                    r.showDetail();
                    break;
                case 2:
                    addmenu.addFood();
                    break;

                case 3:
                    update.updateInfo(register);
                    break;
                case 4:
                    r.showDetail();
                    break;
            }

            System.out.println("do you want to continue for other action? Yes / No");
            scan.nextLine();
            answer = (scan.nextLine()).toUpperCase();
        } while(answer.equals("YES"));
    }

}
