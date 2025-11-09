package module3.decorator;

public class HouseRedColorDecorator extends HouseOptionsDecorator{
    public HouseRedColorDecorator(House house) {
        super(house);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Цвет красный";
    }
}
