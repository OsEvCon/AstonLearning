package module3.decorator;

public class CentralSewerageDecorator extends HouseOptionsDecorator{
    public CentralSewerageDecorator(House house) {
        super(house);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Центральная канализация";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 250000.00;
    }
}
