package module3.builder;

import java.sql.SQLOutput;

public class Car{
    private String model;
    private String color;
    private int yearOfProduction;
    private boolean hasSunroof;
    private boolean hasHeatedSeats;
    private boolean hasCruiseControl;
    private boolean hasClimateControl;


    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.yearOfProduction = builder.yearOfProduction;
        this.hasSunroof = builder.hasSunroof;
        this.hasHeatedSeats = builder.hasHeatedSeats;
        this.hasCruiseControl = builder.hasCruiseControl;
        this.hasClimateControl = builder.hasClimateControl;
    }


    public static class CarBuilder{
        private String model;
        private String color;
        private int yearOfProduction;
        private boolean hasSunroof;
        private boolean hasHeatedSeats;
        private boolean hasCruiseControl;
        private boolean hasClimateControl;

        public CarBuilder(String model, String color, int yearOfProduction) {
            this.model = model;
            this.color = color;
            this.yearOfProduction = yearOfProduction;
        }

        public CarBuilder setHasSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public CarBuilder setHasHeatedSeats(boolean hasHeatedSeats) {
            this.hasHeatedSeats = hasHeatedSeats;
            return this;
        }

        public CarBuilder setHasCruiseControl(boolean hasCruiseControl) {
            this.hasCruiseControl = hasCruiseControl;
            return this;
        }

        public CarBuilder setHasClimateControl(boolean hasClimateControl) {
            this.hasClimateControl = hasClimateControl;
            return this;
        }

        public Car build() {return new Car(this);}
    }
}
