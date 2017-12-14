/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partD;

/**
 *
 * @author Yee
 */
public class Order {
    private String orderId;
    private String customerId;
    private String address;

    
    public Order(String orderId,String customerId, String address){
    this.orderId=orderId;
    this.customerId=customerId;
    this.address=address;
    
    }
    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
