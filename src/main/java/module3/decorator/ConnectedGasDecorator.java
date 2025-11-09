package module3.decorator;

public class ConnectedGasDecorator extends HouseOptionsDecorator{
    public ConnectedGasDecorator(House house) {
        super(house);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 500000.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Газ подведен";
    }
}
