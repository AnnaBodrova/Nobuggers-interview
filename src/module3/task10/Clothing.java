package module3.task10;

public class Clothing extends Product{
    public Clothing(String name, double price, String id) {
        super(name, price, id);
    }

    @Override
    public void applyDiscount() {
        setPrice(getPrice()*0.85);    }
}
