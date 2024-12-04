package module3.task10;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
    private List<Product> cart;

    public Customer(String id, String name, String email) {
        super(id, name, email);
        cart = new ArrayList<>();
    }

    public void addProduct(Product product){
        if(product!=null){
            cart.add(product);
        }
    }

    public List<Product> getCart(){
        return cart;
    }
}
