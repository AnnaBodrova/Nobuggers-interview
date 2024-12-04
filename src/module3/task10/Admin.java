package module3.task10;

import java.math.BigDecimal;

public class Admin extends User{
    public Admin(String id, String name, String email) {
        super(id, name, email);
    }

    public void changeProductPrice(Product product, double price){
        if(product!=null && price>=0){
            product.setPrice(price);
        }
    }
}
