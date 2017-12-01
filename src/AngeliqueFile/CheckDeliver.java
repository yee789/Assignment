
package AngeliqueFile;


public class CheckDeliver {
    String id;
    String deliverName;
    String deliverStatus;
    String deliverNo;
    int quantity;
    
    public CheckDeliver(String id, String deliverName, String deliverStatus, String deliverNo, int quantity){
      this.id = id;
      this.deliverName = deliverName;
      this.deliverStatus = deliverStatus;
      this.deliverNo = deliverNo;
      this.quantity = quantity;
    }
    
    public void setID(String id){
    this.id = id;
    }
    
    public String getId(){
    return id;
    }
    
     public void setDeliverName(String deliverName){
    this.deliverName = deliverName;
    }
    
    public String getDeliverName(){
    return deliverName;
    }
    
    public void setDeliveries(String deliverStatus){
    this.deliverStatus = deliverStatus;
    }
    
    public String getDeliveries(){
    return deliverStatus;
    }
    
    public void setDeliverNo(String deliverStatus){
    this.deliverNo = deliverStatus;
    }
    
    public String getDeliverNo(){
    return deliverNo;
    }
    
    public void setQty(int qty){
    this.quantity = qty;
    }
    
    public int getQty(){
    return quantity;
    }
  
}
