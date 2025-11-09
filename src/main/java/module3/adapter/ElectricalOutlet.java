package module3.adapter;

public class ElectricalOutlet {
    private final int voltage;

    public ElectricalOutlet() {
        this.voltage = 220;
    }

    public int getVoltage() {
        System.out.println("Розетка: Подаю " + voltage + " вольт");
        return  voltage;
    }
}
