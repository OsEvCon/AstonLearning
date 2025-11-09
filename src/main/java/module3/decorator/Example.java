package module3.decorator;

public class Example {
    public static void main(String[] args) {
        House houseForSale = new HouseForSale(4000000.00, "Продается дом");
        houseForSale = new HouseRedColorDecorator(houseForSale);
        houseForSale = new CentralSewerageDecorator(houseForSale);
        houseForSale = new ConnectedGasDecorator(houseForSale);
        houseForSale = new ConnectedWaterDecorator(houseForSale);

        System.out.println(houseForSale.getDescription() + " Цена: " + houseForSale.getPrice());
    }
}
