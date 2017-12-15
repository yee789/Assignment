package registration;

import AddMenu.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import AddMenu.addMenu;
import registration.SetPromote.Promotion;
import registration.deleteFoodMenu.deleteMenu;
import update.update;

public class Registration {

    static ArrayList<Register> register = new ArrayList<Register>();
    static ArrayList<addMenu> menu = new ArrayList<addMenu>();
    
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
        menu = AddMenu.AddFoodMenu.getlist();
        deleteMenu d = new deleteMenu();
        Promotion p = new Promotion();
        
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
                    addmenu.showDetail(menu);
                    break;

                case 3:
                    update.updateInfo(menu);
                    break;
                case 4:
                    r.showDetail();
                    p.SetPromotion(menu);
                    break;
                case  5:
                    d.deleteMenu(menu);
            }

            System.out.println("do you want to continue for other action? Yes / No");
            scan.nextLine();
            answer = (scan.nextLine()).toUpperCase();
        } while(answer.equals("YES"));
    }

}
