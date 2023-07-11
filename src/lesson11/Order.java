package lesson11;

public class Order {
    private int orderNumber;
    private String nameClient;

    public Order (String nameClient){
        this.nameClient = nameClient;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    @Override
    public String toString() {
        return "Client: №: " + orderNumber +
                ", nameClient='" + nameClient + " has just gotten his order";
    }
}
