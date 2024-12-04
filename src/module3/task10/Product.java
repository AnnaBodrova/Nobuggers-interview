package module3.task10;

import java.math.BigDecimal;

public abstract class Product {
    private String name;
    private double price;

    private String id;

    public abstract void applyDiscount();
    public String getId() {
        return id;
    }
    public Product(String name, double price, String id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
