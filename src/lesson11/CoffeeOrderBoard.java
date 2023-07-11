package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orderList;
    private int counter = 1;

    public CoffeeOrderBoard(){
        orderList = new ArrayList<>();
    }

    public void add(Order newClient){
        newClient.setOrderNumber(counter);
        counter++;
        orderList.add(newClient);
    }

    public Order delivery(){
        Order buffer = new Order("");
        if (!orderList.isEmpty()){
            buffer = orderList.get(orderList.size()-1);
            orderList.remove(buffer);
            return buffer;
        }
        return buffer;
    }

    public Order delivery(int numberOrder){
        Order buffer = new Order("");
        buffer = orderList.stream()
                .filter(o -> o.getOrderNumber() == numberOrder)
                .findFirst().orElse(new Order(""));
        if (buffer.getOrderNumber() != 0)
            orderList.remove(buffer);
        return buffer;
    }

    public void draw (){
        System.out.println("List of clients:");
        orderList.forEach(s -> System.out.println(s.getNameClient() + " | " + s.getOrderNumber()));
    }
}
