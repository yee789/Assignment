package registration;

import AddMenu.*;

public interface RegisterInterface {

 // this can get any added food detail form the restaurant
 public String getUserId() ;
  
 public String getCompanyName();
  
 public String getAddress();
  
 public String getEmail();
  
 public String getContactNo(); 
 
 public String getPassword();
 
 //this is using for set up the restaurant name
 public void setUserId(String id) ;
  
 public void setCompanyName(String Cname);
  
 public void setAddress(String address);
  
 public void setEmail(String email);
  
 public void setContactNo(String ContactNo); 
 
 public void setPassword(String password);
}
