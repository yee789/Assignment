
package trackdistancetravel;
import java.util.*;

public class TrackDistanceTravel {
    
    public static List<DeliverMen> distanceTravel = new ArrayList<>();
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
      TrackDistanceTravel t1 = new TrackDistanceTravel(); 
              
      DeliverMen d1 = new DeliverMen("1001" ,"Ali  ","Done", "128", 6, 10, 0);
     // DeliverMen d2 = new DeliverMen("1002" ,"Kumar","Available", "0", 0, 0);
      DeliverMen d2 = new DeliverMen("1003" ,"JOhn ","Delivering", "200", 6, 4, 0);
     // DeliverMen d4 = new DeliverMen("1004" ,"Alex ","Available", "0", 0);
      DeliverMen d3 = new DeliverMen("1005" ,"Edwin","Done", "220", 7,12, 0);
      DeliverMen d4 = new DeliverMen("1006" ,"Nick ","Done", "135", 8,15, 0);
      DeliverMen d5 = new DeliverMen("1007" ,"Mark ","Delivering", "149", 3, 8,   0);
      
      
      distanceTravel.add(d1);
      distanceTravel.add(d2);
      distanceTravel.add(d3);
      distanceTravel.add(d4);
      distanceTravel.add(d5);
    
       
       System.out.println("Per km = RM 0.40");

      Iterator itr = distanceTravel.iterator();
      String option = "";
      
       do{
              
                System.out.println("\nDeliveries For Each Delivery Men!");  
                //display user who got "Delivering" status here
                System.out.println("\nNoID   DeliverMen  DeliverStatus   DeliverNo   Qty    DistanceTravel  TotalPay");
                System.out.println("--------------------------------------------------------------------------------");  
      
                while(itr.hasNext()){  
                    DeliverMen st = (DeliverMen)itr.next();  
                    if(st.deliverStatus.equals("Done")){
                        st.totalpay = Math.round((st.distance * 0.4)* 100.0)/ 100.0;
                        //double total = ("%.2" ,st.totalpay);
                        System.out.println(st.id + "    " + st.deliverName + "      " + st.deliverStatus + "            " + st.deliverNo + "          " + st.quantity + "           " + st.distance + "km" + "       " + "RM " + st.totalpay);  
                    }
                } 
                
       }while(option.equals("no"));
           
          //System.out.println("Cancelled!");
         

      System.out.println("\nThank You!");
      
    }
    
}
