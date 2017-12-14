
package AngeliqueFile;
import java.util.*;

class Sprint2 {
    public static List<CheckDeliver> deliverMen = new ArrayList<>(); 
    public static String myHelpStaff;
    public static int totalQty;
    public static int currentQty;
    public static int leftQty;
    

                
    public void deliverMen(){
        
      Scanner scan = new Scanner(System.in);
      Iterator itr = deliverMen.iterator(); 
      String option = "";
      
           do{
                //display user who got "Delivering" status here
                System.out.println("\nNoID   DeliverMen  DeliverStatus   DeliverNo   Qty");
                System.out.println("--------------------------------------------------");  
      
                while(itr.hasNext()){  
                    CheckDeliver st = (CheckDeliver)itr.next();  
                    if(st.deliverStatus.equals("Delivering")){
                        System.out.println(st.id + "    " + st.deliverName + "      " + st.deliverStatus + "        " + st.deliverNo + "        " + st.quantity);  
                    }
                } 
                
                System.out.println("\nDo you want to assign other for help ? (yes/no)");
                option = scan.nextLine();
                
                if(option.equals("yes")){
                
                    conDeliverMen();
                }else if(option.equals("no")){
                    
                    System.out.println("Cancelled!");
                }
                
           }while(option.equals("no")); 
           
            
}
    public void conDeliverMen(){
        
          Scanner scan = new Scanner(System.in);
          Iterator itr = deliverMen.iterator(); 
          String con = "";
        do{
            System.out.println("\nHere is the available delivery men!");
                
            System.out.println("NoID   DeliverMen  DeliverStatus   DeliverNo   Qty");
            System.out.println("--------------------------------------------------");  
                
                
            while(itr.hasNext()){  
                CheckDeliver st = (CheckDeliver)itr.next();  
                    if(st.deliverStatus.equals("Available")){
                        System.out.println(st.id + "    " + st.deliverName + "      " + st.deliverStatus + "        " + st.deliverNo + "        " + st.quantity);   
                    }
                } 

                //then capture input
                System.out.println("\nEnter id which delivery men that need help : ");
                String ID = scan.nextLine();
                for (int i = 0; i < deliverMen.size(); ++i) {
                    if (deliverMen.get(i).id.equals(ID)) {
                        System.out.println("\nName : " + deliverMen.get(i).getDeliverName());
                        System.out.println("Status : " + deliverMen.get(i).getDeliveries());
                        System.out.println("Deliver No : " + deliverMen.get(i).getDeliverNo());
                        System.out.println("Quantity : " + deliverMen.get(i).getQty());
                        myHelpStaff = deliverMen.get(i).getDeliverNo();
                        currentQty =  deliverMen.get(i).getQty();
                    }
                }

                //then just continue here, be sure to get the id
                System.out.println("\nSelect id which delivery men to assign for help : ");
                String assignStf = scan.nextLine();
                
                for (int i = 0; i < deliverMen.size(); ++i) {
                    
                    if (deliverMen.get(i).id.equals(assignStf)){
                        System.out.println("\nName : " + deliverMen.get(i).getDeliverName());
                        System.out.println("Status : " + deliverMen.get(i).getDeliveries());
                        System.out.println("Quantity : " + deliverMen.get(i).getQty());
                        System.out.println("Deliver No : " + myHelpStaff);
                    }
                }

                //then, how many quantity? get the value and update the arraylist based on the id
                System.out.println("\nHow many quantity to be assign : ");
                int qty = scan.nextInt();
                
                if(qty < currentQty){
                    leftQty = currentQty - qty ;
                for (int i = 0; i < deliverMen.size(); ++i) {
                    if (deliverMen.get(i).id.equals(assignStf)){
                        int helpQty = deliverMen.get(i).getQty() + qty;
                        System.out.println("\nAssigned Successfully");
                        System.out.println("-----------------------");
                        System.out.println("Name : " + deliverMen.get(i).getDeliverName());
                        System.out.println("Status : " + deliverMen.get(i).getDeliveries().replace("Available","Prepare Delivering"));
                        System.out.println("Deliver No : " + myHelpStaff);
                        System.out.println("Quantity : " + helpQty);
                    }
                    
                }
                
                System.out.println("Deliver No : " + myHelpStaff);
                System.out.println("\nQuantity left : " + leftQty);   
                
                }else{
                    
                    System.out.println("Quantity over!");
                }
              
                  
              // System.out.println("\nDo you want to continue ? ");
                //con = scan.nextLine();
                //scan.nextLine();
                
        }while(con.equals("yes"));
        
         
        
    }
    
    public double report(){
        //Scanner scan = new Scanner(System.in);
        Iterator itr = deliverMen.iterator(); 
        int sum = 0;
        
        
        System.out.println("\nDaily Report");
        System.out.println("************");  
        
        System.out.println("\nNoID   DeliverMen  DeliverStatus   DeliverNo   Qty");
        System.out.println("----------------------------------------------------");  
      
       while(itr.hasNext()){  
        CheckDeliver st = (CheckDeliver)itr.next();  
            if(st.deliverStatus.equals("Done")){
                System.out.println(st.id + "    " + st.deliverName + "      " + st.deliverStatus + "            " + st.deliverNo + "        " + st.quantity);  
                sum += st.quantity;
                
            }
             
        }
        
        System.out.println("\nTotal Qty of Done : " + sum);
        return sum;
  
    }
    

    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);
      Sprint2 s1 = new Sprint2(); 
              
      CheckDeliver d1 = new CheckDeliver("1001" ,"Ali ","Delivering", "128", 4);
      CheckDeliver d2 = new CheckDeliver("1002" ,"Kumar","Available", "0", 0);
      CheckDeliver d3 = new CheckDeliver("1003" ,"JOhn ","Delivering", "200", 6);
      CheckDeliver d4 = new CheckDeliver("1004" ,"Alex ","Available", "0", 0);
      CheckDeliver d5 = new CheckDeliver("1005" ,"Edwin","Done", "220", 7);
      CheckDeliver d6 = new CheckDeliver("1006" ,"Nick ","Done", "135", 8);
      CheckDeliver d7 = new CheckDeliver("1007" ,"Mark ","Delivering", "149", 5);

      
      deliverMen.add(d1);
      deliverMen.add(d2);
      deliverMen.add(d3);
      deliverMen.add(d4);
      deliverMen.add(d5);
      deliverMen.add(d6);
      deliverMen.add(d7);
      
      int choice; 
      
      do{
    
       
       System.out.println("\n1. Check Pending Deliveries");
       System.out.println("2. Generate Daily Report");
       System.out.println("----------------------------");
       System.out.println("Select your choice : ");
       choice = scan.nextInt();

       if(choice == 1){
                
         s1.deliverMen();
          
       }else if(choice == 2){ 
           
         s1.report();
          
       }else{
           
       }
           
          //System.out.println("Cancelled!");
          System.out.println("\n(Press 0 to continue/any key to exit): ");
          choice = scan.nextInt();
       
       
       
      }while(choice == 0);
      
      System.out.println("Thank You!");
       
    }
    
}
