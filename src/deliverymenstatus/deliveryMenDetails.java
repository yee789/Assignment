package deliverymenstatus;

public class deliveryMenDetails {
  String name;
  String status;
  String gender;
  int age;

  public deliveryMenDetails(String name, int age, String gender, String status) {
    this.name = name;
    this.status = status;
    this.gender = gender;
    this.age = age;
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
