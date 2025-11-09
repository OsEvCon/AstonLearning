package module3.decorator;

public class HouseForSale implements House {
    double price;
    String description;

    public HouseForSale(double price, String description) {
        this.price = price;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
