package update;

import java.util.ArrayList;
import java.util.Scanner;
import registration.Register;

public class update implements updateInterface {
    // ArrayList<Register> register = new ArrayList<Register>();

    Register r = new Register();
    Scanner scan = new Scanner(System.in);
    String userid;
    String companyName;
    String password;
    String contactNo;
    String email;
    String address;

    public void updateInfo(ArrayList<Register> update) {
        userid = update.get(0).getUserId();
        companyName = update.get(0).getCompanyName();
        password = update.get(0).getPassword();
        contactNo = update.get(0).getContactNo();
        email = update.get(0).getEmail();
        address = update.get(0).getAddress();

        System.out.println("select your choose to change your information :");
        System.out.println("1. Company Name");
        System.out.println("2. Password");
        System.out.println("3. contactNo");
        System.out.println("4. email");
        System.out.println("5. address");
        int ans = scan.nextInt();
        scan.nextLine();
        switch (ans) {
            case 1:
                updateName();
                break;
            case 2:
                updatePassword();
                break;
            case 3:
                updateContact();
                break;
            case 4:
                updateEmail();
                break;
            case 5:
                updateAddress();
                break;
        }
        System.out.println("" + companyName);
        r.setCompanyName(companyName);
        r.setPassword(password);
        r.setAddress(address);
        r.setContactNo(contactNo);
        r.setEmail(email);
        update.set(0, r);
        //update.get(0).setCompanyName(companyName);
    }

    public static void main(String[] args) {

    }

    @Override
    public void updateName() {
        System.out.print("now your Campany Name is :");
        System.out.print(companyName);
        System.out.print("\n");
        System.out.println("Enter your new company Name");

        companyName = scan.nextLine();

    }

    @Override
    public void updatePassword() {
        System.out.println("Enter your current password");
        String currentPass = scan.nextLine();
        if (!(currentPass.equals(password))) {
            System.out.println("error! invalid password");
            updatePassword();
        } else {
            System.out.println("Enter your new password");
            String Npassword = scan.nextLine();
            password = Npassword;
        }

    }

    @Override
    public void updateContact() {
        System.out.print("Your current contact number is :");
        System.out.print(contactNo);
        System.out.print("\n");
        System.out.println("Enter your new contact number");

        contactNo = scan.nextLine();
    }

    @Override
    public void updateAddress() {
        System.out.print("Your current restaurant address is :");
        System.out.print(address);
        System.out.print("\n");
        System.out.println("Enter your new address");

        address = scan.nextLine();
    }

    @Override
    public void updateEmail() {
        System.out.print("Your current email is :");
        System.out.print(email);
        System.out.print("\n");
        System.out.println("Enter your new email");
        email = scan.nextLine();
    }

}
