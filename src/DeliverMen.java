
package trackdistancetravel;

public class DeliverMen {
    String id;
    String deliverName;
    String deliverStatus;
    String deliverNo;
    int quantity;
    int distance;
    double totalpay;
    
    public DeliverMen(String id, String deliverName, String deliverStatus, String deliverNo, int quantity, int distance, double totalPay){
        this.id = id;
        this.deliverName = deliverName;
        this.deliverStatus = deliverStatus;
        this.deliverNo = deliverNo;
        this.quantity = quantity;
        this.distance = distance;
        this.totalpay = totalpay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeliverName() {
        return deliverName;
    }

    public void setDeliverName(String deliverName) {
        this.deliverName = deliverName;
    }

    public String getDeliverStatus() {
        return deliverStatus;
    }

    public void setDeliverStatus(String deliverStatus) {
        this.deliverStatus = deliverStatus;
    }

    public String getDeliverNo() {
        return deliverNo;
    }

    public void setDeliverNo(String deliverNo) {
        this.deliverNo = deliverNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getTotalpay() {
        return totalpay;
    }

    public void setTotalpay(double totalpay) {
        this.totalpay = totalpay;
    }
    
}
