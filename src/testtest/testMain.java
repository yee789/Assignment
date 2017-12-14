/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtest;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author htchew
 */
public class testMain {
        private static List<String> res = testAddMenu.Res;
        private static List<testMenu> m = testAddMenu.menu;
        private static List<testOrder> tempo = new ArrayList<>();
        private static List<testCustomer> cust = new ArrayList<>();
        private static int custID = 0;
        private static int orderID = 1000;
        private static String contactNum;
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
     
    public void customerProcess(){
        
       Scanner scan = new Scanner(System.in);
       String choice, deliveryman="";
       // do{           
                
        System.out.println("Enter your Name: ");
        String name = scan.nextLine();
        System.out.println("Enter your Gender(Male/Female): ");
        String gender = scan.nextLine();
        System.out.println("Enter your Contact No: ");
        contactNum = scan.nextLine();
        System.out.println("Enter your Email: ");
        String email = scan.nextLine();
        System.out.println("Enter your Home Address(Delivery Address): ");
        String homeAddress = scan.nextLine();
        
        testCustomer customer = new testCustomer(name, gender, contactNum, email, homeAddress, deliveryman);
        cust.add(customer);
             
        
        
    }
     public void orderProcess(){
        String restaurant="";
       Date date = new Date();
        //System.out.println(dateFormat.format(cal));
        String currentDate = dateFormat.format(date);
        Scanner scan = new Scanner(System.in);
        //remove duplicate restaurant in Res(restaurant list)
        Set<String> hs = new HashSet<>();
            hs.addAll(res);
            res.clear();
            res.addAll(hs);
            System.out.println("Restaurant : ");
            for(int i =0; i<res.size();i++){
                System.out.println((i+1)+"."+res.get(i));
            }
            System.out.println("Enter restaurant name: ");
            restaurant=scan.nextLine();
        String yesno="";
        do{            
            int count=0;
            System.out.println("Order id : "+orderID);
            System.out.println("MenuID  MenuName  Description  Price");
            System.out.println("=====================================");
            for(int i=0;i<m.size();i++){
                if(restaurant.equals(m.get(i).getRestaurant())){
                    System.out.println(m.get(i).getMenuID()+"  "+m.get(i).getMenuName()+"  "+m.get(i).getMenuDescription()+"  "+m.get(i).getPrice());
                }
            }
            System.out.println("Enter menuID to order: ");
            String menuID = scan.nextLine();
            int qty=0;
            do{
                try{
                System.out.println("Quantity: ");
                    qty = scan.nextInt();
                    scan.nextLine();
                    if(qty==0)
                        System.out.println("Quantity cannot be 0\n");
                }catch(NumberFormatException ex){
                    System.out.println("Please enter numeric value.");
                }              
          
            }while(qty==0);
            
        for(int i=0;i<m.size();i++){
            if(menuID.equals(m.get(i).getMenuID())&&restaurant.equals(m.get(i).getRestaurant())){
                
                testOrder ord = new testOrder(custID, orderID, contactNum, m.get(i).getRestaurant(), m.get(i).getMenuID(), m.get(i).getMenuName(), m.get(i).getMenuDescription(), m.get(i).getPrice(), qty, "delivering");
                
                //System.out.println("Cust ID HERE >>>>> "+custID);
                count++;
                tempo.add(ord);
                //System.out.println(m.get(i));
                System.out.println("Item added!\n");
                break;
            }
        }
        if(count==0)
                System.out.println("Invalid Menu id");
          
        System.out.println("Do you have any other order? ");
        yesno=scan.nextLine();
        
        }while(yesno.equals("yes"));
        custID++;
        orderID++;
        System.out.println("Order Confirmation");
        System.out.println("==================");
        System.out.println("MenuName Quantity Unit Price(RM) Subtotal(RM)");
        System.out.println("=============================================");
        double totalamt=0;
        int currentID = custID - 1;
        
        for(int i=0;i<tempo.size();i++){
            //System.out.println("Cust ID: "tempo.get(i).getCustID());
           if(tempo.get(i).getCustID() == currentID ){
               
                System.out.println(tempo.get(i).getMenuName()+" "+tempo.get(i).getQty()+" "+tempo.get(i).getPrice()+" "+(tempo.get(i).getQty()*tempo.get(i).getPrice()));
                totalamt+=tempo.get(i).getQty()*tempo.get(i).getPrice();
           }
        }
        System.out.println("Total Price(RM): "+totalamt);
        
        
        //to add the order list into order
        
        System.out.println("Confirm your order?(yes/no)");
        String confirm = scan.nextLine();
        
        
        if(confirm.equals("yes")){
           
            System.out.println("Order has been placed.");
             
            
        }else{           
            for(int i=0;i<tempo.size();i++){
                if(tempo.get(i).getCustID()==currentID)
                tempo.remove(tempo.get(i).getCustID());
            }
          
            
            System.out.println("Order has been discarded.");
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
        //object to prompt user input for customer and menu(not setter and getter)
        testMain f1 = new testMain();
        testAddMenu m1 = new testAddMenu();
        
        int cont;
        do{
            //1.to view menu
            /*
            :::::: Selection ::::::
            
            */
            System.out.println("1.Go to Order");
            System.out.println("2.Add Menu(For restaurant owner)");
            System.out.println("3.View Order List(Temporary)");
            System.out.println("4.Track customer order with phone number");
            System.out.println("----------------------------------");
        int choice;
        System.out.println("Enter selection: ");
        choice = scan.nextInt();
 
        if(choice==1){
           f1.customerProcess();
            f1.orderProcess();
            
            
        }else if(choice==2){
            m1.addDefaultMenu();
        }else if(choice==3){
            
            for(int i=0;i<tempo.size();i++)
                System.out.println("Order id: "+tempo.get(i).getOrderID()+ "Menu id: "+tempo.get(i).getMenuID());
            
           /* System.out.println("Enter order id: ");
            int ooo = scan.nextInt();
            
            for(int i=0;i<tempo.size();i++)
            {
                if(ooo==tempo.get(i).getOrderID())
                    System.out.println("menu id: "+tempo.get(i).getMenuID());
            }*/
        }else if(choice==4){
            System.out.println("Enter customer contact number: ");
           scan.nextLine();
             String phonenum = scan.nextLine();
            
            System.out.println("Customer details: ");
             for(int i=0;i<cust.size();i++){
                 if(phonenum.equals(cust.get(i).getContactNo()))
                    System.out.println("Name: "+cust.get(i).getName()+"\nHome Address: "+cust.get(i).getHomeAddress());
             }
             System.out.println("Order Items: \n");
            double total=0;
             for(int i=0;i<tempo.size();i++)
            {
                if(phonenum.equals(tempo.get(i).getContactNum())&&tempo.get(i).getStatus().equals("delivering")){
                    System.out.println("menu id: "+tempo.get(i).getMenuID());
                    total+=tempo.get(i).getPrice()*tempo.get(i).getQty();
                    tempo.get(i).setStatus("delivered");
            }
            }
             System.out.println("Total Price to pay: RM "+total);
        }
        else{
            //have to change
            System.out.println("Thank You!");
        }
            System.out.println("(Press 0 to go back to menu: ");
            cont=scan.nextInt();
        }while(cont==0);
    }
    
}

