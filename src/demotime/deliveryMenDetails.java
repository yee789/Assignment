/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotime;

/**
 *
 * @author Yee
 */
public class deliveryMenDetails {
 private   String name;
 private String status;
 private String gender;
  private String clockInStatus;
  private int age;
 private double totalWorkingHours=0; 
 private int totalWorkingMinutes=0;
 
    
  
    public deliveryMenDetails(String name, int age, String gender, String status) {
    this.name = name;
    this.status = status;
    this.gender = gender;
    this.age = age;
  }
    
       public deliveryMenDetails(String name, int age, String gender, String status, String clockInStatus) {
    this.name = name;
    this.status = status;
    this.gender = gender;
    this.age = age;
    this.clockInStatus=clockInStatus;
  }
  
  public String getClockInStatus() {
    return  clockInStatus;
  }
  

  public void setclockInStatus(String clockInStatus) {
    this.clockInStatus = clockInStatus;
  }
  
    public double getTotalWorkingHours() {
    return  totalWorkingHours;
  }
  

  public void setTotalWorkingHours(double totalWorkingHours) {
    this.totalWorkingHours = this.totalWorkingHours+totalWorkingHours;
  }
  
   
  
  
   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
  
   public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
  
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("%-10s %-5d %-10s %-10s \n", name, age, gender, status);
  }

    String parseInt(int age) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
