package module3.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
    private String orderId;
    private Customer customer;
    private List<Product> productList;
    private double totalPrice;
    public String getOrderId() {
        return orderId;
    }

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = customer.getCart();
    }

    public double countTotalSum(){
        List<Product> electronics =productList.stream().filter(product -> product.getClass().equals(Electronics.class)).collect(Collectors.toList());
        if (electronics.stream().map(product -> product.getPrice()).reduce(0.0,Double::sum)>100){
            for(Product product: electronics){
                product.applyDiscount();
            }
        };
        List<Product> clothing =productList.stream().filter(product -> product.getClass().equals(Clothing.class)).collect(Collectors.toList());
        if (clothing.stream().map(product -> product.getPrice()).reduce(0.0,Double::sum)>50){
            for(Product product: clothing){
                product.applyDiscount();
            }
        };
        return productList.stream().map(product -> product.getPrice()).reduce(0.0,Double::sum);
    }
}
