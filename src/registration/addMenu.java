package registration;

public class addMenu implements addMenuInterface {

  private double price;
  private String descrip;
  private String foodName;
  private String foodId;
  private String restaurantName;
  
  public addMenu(double price,String descrip , String foodName, String foodId,String restaurantName ) {
    this.price = price;
    this.descrip = descrip;
    this.foodName = foodName;
    this.foodId = foodId;
    this.restaurantName = restaurantName;
  }

  public addMenu()
  {
      price = 0;
      descrip = "";
      foodName = "";
      foodId = "";
      restaurantName = "";
  }
  public String getDescrip(){
  return descrip;
  }
 
  public String getFoodName(){
  return foodName;
  }
  
  public String getFoodId(){
  return foodId;
  }
   
  public String getResName(){
  return restaurantName;
  }
  
  public double getPrice(){
      return price;
  }
  
  public void setDescrip(String descrip){
   this.descrip = descrip;
  }
 
  public void setFoodName(String foodName){
    this.foodName = foodName ;
  }
  
  public void setFoodId(String foodId){
    this.foodId = foodId;
  }
   
  public void setResName(String restaurantName){
  this.restaurantName = restaurantName;
  }
  
  public void setPrice(double price){
     this.price = price;
  }
  
}
