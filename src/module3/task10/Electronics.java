package module3.task10;

import java.math.BigDecimal;

public class Electronics extends Product{
    public Electronics(String name, double price, String id) {
        super(name, price, id);
    }

    @Override
    public void applyDiscount() {
        setPrice(getPrice()*0.9);
    }
}
