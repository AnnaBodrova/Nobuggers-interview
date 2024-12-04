package module3.task10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseOperations {
    private Map<String,Order> orders;

    public DatabaseOperations(){
        orders = new HashMap();
    }

    public void saveOrder(Order order){
        orders.put(order.getOrderId(),order);
    }

    public Order getOrder(String orderId){
        return orders.get(orderId);
    }
}
