package AddMenu;

public interface addMenuInterface {

 // this can get any added food detail form the restaurant
 public String getFoodId() ;
  
 public String getResName();
  
 public double getPrice();
  
 public String getFoodName();
  
 public String getDescrip(); 
 
 //this is using for set up the restaurant name
 public void setFoodId(String id ) ;
  
 public void setResName(String rn);
  
 public void setPrice(double p);
  
 public void setFoodName(String fn);
  
 public void setDescrip(String s); 
 
}
