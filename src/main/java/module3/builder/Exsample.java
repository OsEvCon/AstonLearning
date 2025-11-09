package module3.builder;

public class Exsample {
    public static void main(String[] args) {

        Car camry = new Car.CarBuilder("Toyota Camry", "Black", 2015)
                .setHasClimateControl(true)
                .setHasHeatedSeats(true)
                .setHasSunroof(false)
                .setHasCruiseControl(true)
                .build();

        Car vesta = new Car.CarBuilder("Lada Vesta", "Red", 2020)
                .setHasClimateControl(false)
                .setHasHeatedSeats(true)
                .setHasSunroof(false)
                .setHasCruiseControl(false)
                .build();


    }
}
