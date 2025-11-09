package module3.decorator;

public class ConnectedWaterDecorator extends HouseOptionsDecorator{
    public ConnectedWaterDecorator(House house) {
        super(house);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 400000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Есть водопровод";
    }
}
