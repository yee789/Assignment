/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

class First {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static List<customer> custList = new ArrayList<>();
    private static List<Menu1> m = menu.menu;
    private static List<ordering> oList = new ArrayList<>();
    private static List<order> custOrder = new ArrayList<>();
    private static List<String> res = menu.Res;
    //private static List<ordering> tempO = new ArrayList<>();
    
    private static int orderID=1000;
    
    
    public void customerProcess(){
        
       Scanner scan = new Scanner(System.in);
       String choice;
       // do{           
                
        System.out.println("Enter your Name: ");
        String name = scan.nextLine();
        System.out.println("Enter your Gender(Male/Female): ");
        String gender = scan.nextLine();
        System.out.println("Enter your Contact No: ");
        String contactNo = scan.nextLine();
        System.out.println("Enter your Email: ");
        String email = scan.nextLine();
        System.out.println("Enter your Home Address(Delivery Address): ");
        String homeAddress = scan.nextLine();
        
        customer cust = new customer(name, gender, contactNo, email, homeAddress, custOrder);
        custList.add(cust);
        System.out.println(custList+"\n");
       // System.out.println("Do you want to continue?");
        //choice = scan.nextLine();
        //}while(choice.equals("yes"));
        
        
    }
    
    public static String customerList(List custList){
        String str = "";
        for(int i=0; i<custList.size();++i){
            str += (i+1)+"."+ custList.get(i)+"\n";
        }
        return str;
    }
    
    public static String showMenu(List m){
        String str = "";
        for(int i=0; i<m.size();++i){
            str += m.get(i)+"\n";
        }
        return str;
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
            
            
            System.out.println("MenuID  MenuName  Description  Price");
            System.out.println("=====================================");
            for(int i=0;i<m.size();i++){
                if(restaurant.equals(m.get(i).getRestaurant())){
                    System.out.println(m.get(i).getMenuID()+"  "+m.get(i).getMenuName()+"  "+m.get(i).getMenuDescription()+"  "+m.get(i).getPrice());
                }
            }
            System.out.println("Enter menuID to order: ");
            String menuID = scan.nextLine();
            System.out.println("Quantity: ");
            int qty = scan.nextInt();
            scan.nextLine();
        for(int i=0;i<m.size();i++){
            if(menuID.equals(m.get(i).getMenuID())&&restaurant.equals(m.get(i).getRestaurant())){
                ordering ord = new ordering(m.get(i).getMenuID(), m.get(i).getMenuName(), m.get(i).getMenuDescription(), m.get(i).getPrice(), qty);
                oList.add(ord);
                //System.out.println(m.get(i));
                System.out.println("Item added!\n");
                break;
            }
        }
            
        System.out.println("Do you have any other order? ");
        yesno=scan.nextLine();
        
        }while(yesno.equals("yes"));
        
        System.out.println("Order Confirmation");
        System.out.println("==================");
        System.out.println("MenuName Quantity Unit Price(RM) Subtotal(RM)");
        System.out.println("=============================================");
        double totalamt=0;
        for(int i=0;i<oList.size();i++){
           
            System.out.println(oList.get(i).getMenuName()+" "+oList.get(i).getQty()+" "+oList.get(i).getPrice()+" "+(oList.get(i).getQty()*oList.get(i).getPrice()));
            totalamt+=oList.get(i).getQty()*oList.get(i).getPrice();
        }
        System.out.println("Total Price(RM): "+totalamt);
        //to add the order list into order
        
        System.out.println("Confirm your order?(yes/no)");
        String confirm = scan.nextLine();
        
        
        if(confirm.equals("yes")){
            //order order1 = new order();
            //int orderID = order1.getOrderID();
            //String restaurant = "Blabla";
            
            order order2 = new order(orderID, restaurant, currentDate, oList);
            custOrder.add(order2);
            
        //customerProcess();  
            
        }else{
            System.out.println("hoho");
        }
        
    }
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        //object to prompt user input for customer and menu(not setter and getter)
        First f1 = new First();
        menu m1 = new menu();
        //f1.customerProcess();
        int cont;
        do{
            //1.to view menu
            /*
            :::::: Selection ::::::
            
            */
            System.out.println("1.Go to Order");
            System.out.println("2.Add Menu(For restaurant owner)");
            System.out.println("3.View Order List(Temporary)");
            //System.out.println("4.Logout");
            System.out.println("----------------------------------");
        int choice;
        System.out.println("Enter selection: ");
        choice = scan.nextInt();
 
        if(choice==1){
            //System.out.println("MenuID  MenuName  Description  Price");
            //System.out.println("=====================================");
            //System.out.println(showMenu(m));
            f1.orderProcess();
            
        }else if(choice==2){
            m1.addMenu();
        }else if(choice==3){
            for(int i=0; i<custOrder.size();i++){
                System.out.println(custOrder.get(i));
            }
        }/*else if(choice==4){
            orderID++;
            oList.clear();
           
        }
        else if(choice==4){
            System.out.println("Enter customer phone number to track order: ");
            String contNo = scan.nextLine();
            scan.nextLine();
            for(int i=0; i<custList.size();i++){
                if(custList.get(i).getContactNo().equals(contNo)){
                    System.out.println(custList.get(i));
                }
            }
        }*/
        else{
            //have to change
            System.out.println("Thank You!");
        }
            System.out.println("(Press 0 to continue): ");
            cont=scan.nextInt();
        }while(cont==0);
        //System.out.println("Customer list:\n "+customerList(custList));
        
        System.out.println("Thank You!");
    }
}
