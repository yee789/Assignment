/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author htchew
 */
public class testAddMenu {
    
    
    static List<testMenu> menu = new ArrayList<testMenu>();
    static List<String> Res = new ArrayList<>();
    
    
    public void addDefaultMenu(){
        menu.add(new testMenu("M1","Food 1","desc1","R1",10.00));
        menu.add(new testMenu("M2","Food 2","desc2","R1",20.00));
        menu.add(new testMenu("M3","Food 3","desc3","R1",20.00));
        menu.add(new testMenu("B1","Food 4","desc4","R2",30.00));
        menu.add(new testMenu("B2","Food 5","desc5","R2",40.00));
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

}
