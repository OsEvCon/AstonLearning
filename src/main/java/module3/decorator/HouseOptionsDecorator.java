package module3.decorator;

public abstract class HouseOptionsDecorator implements House {
    private House house;

    public HouseOptionsDecorator(House house) {
        this.house = house;
    }

    @Override
    public double getPrice() {
        return  house.getPrice();
    }

    @Override
    public String getDescription() {
        return house.getDescription();
    }
}
