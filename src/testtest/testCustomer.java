/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtest;

import java.util.List;
import java.util.*;
/**
 *
 * @author htchew
 */
public class testCustomer {
       
    private int custID;
    private String name;
    private String gender;
    private String contactNo;
    private String email;
    private String homeAddress;  
    private String deliveryman;
    //private order ord;
    
       
    
    testCustomer(String name, String gender, String contactNo, String email, String homeAddress,String deliveryman){
    this.name=name;
    this.gender=gender;
    this.contactNo=contactNo;
    this.email=email;
    this.homeAddress=homeAddress;
    this.deliveryman=deliveryman;
    }

    
    public void setName(String name){
    this.name=name;
    }
    
    public String getName(){
    return name;
    }
    
    public void contactNo(String contactNo){
    this.contactNo=contactNo;
    }
    
    public String getContactNo(){
    return contactNo;
    }
    
    public void setHomeAddress(String homeAddress){
    this.homeAddress=homeAddress;
    }
    
    public String getHomeAddress(){
    return homeAddress;
    }
    
    public void setGender(String gender){
    this.gender=gender;
    }
    
    public String getGender(){
    return gender;
    }
    
    public void setEmail(String email){
    this.email=email;
    }
    
    public String getEmail(){
    return email;
    }
    
    /*public String toString(){
    return String.format("%s %s %s %s %s %s",name, gender, contactNo, email, homeAddress, orderCust);
    }*/

    public int getCustID() {
        return custID;
    }
    
}
