/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordering;
import java.util.*;
/**
 *
 * @author htchew
 */
public class menu {
    
    static List<Menu1> menu = new ArrayList<Menu1>();
    static List<String> Res = new ArrayList<>();
    
    public void addMenu(){
       Scanner scan = new Scanner(System.in);
       String choice;
        do{           
                
            System.out.println("Enter menu id: ");
            String menuid = scan.nextLine();
            System.out.println("Enter menu name");
            String menuname = scan.nextLine();
            System.out.println("Enter menu description: ");
            String menudesc = scan.nextLine();
            System.out.println("Enter menu restaurant: ");
            String restaurant = scan.nextLine();
            System.out.println("Enter price:");
            double price = scan.nextDouble();
        
        Menu1 m1 = new Menu1(menuid, menuname, menudesc, restaurant, price);
        menu.add(m1);
        
            Res.add(restaurant);
        
        System.out.println("Do you want to continue?");
        scan.nextLine();
        choice = scan.nextLine();
        }while(choice.equals("yes"));
        
        
    }
    public void addDefaultMenu(){
        menu.add(new Menu1("M1","Food 1","desc1","R1",10.00));
        menu.add(new Menu1("M2","Food 2","desc2","R1",20.00));
        menu.add(new Menu1("M3","Food 3","desc3","R1",20.00));
        menu.add(new Menu1("B1","Food 4","desc4","R2",30.00));
        menu.add(new Menu1("B2","Food 5","desc5","R2",40.00));
        Res.add("R1");
        Res.add("R1");
        Res.add("R2");
        System.out.println("Default Menu added, dont need add again");
    }
    
    public String menuL(List menu){
        String str = "";
        for(int i=0; i<menu.size();++i){
            str += (i+1)+"."+ menu.get(i)+"\n";
        }
        return str;
    }
    //---------------------------------tak boleh guna
    /*public List<Menu1> getMenu(){
        return menu;
    }*/
    
   /* public static void main(String args[]){
        menu m1 = new menu();
         
        m1.menuList();
        System.out.println("Menu list:\n "+menuL(menu));
        
        
    }*/
}
