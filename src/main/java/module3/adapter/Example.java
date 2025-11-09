package module3.adapter;

public class Example {
    public static void main(String[] args) {
        ElectricalOutlet electricalOutlet = new ElectricalOutlet();
        Phone phone = new Phone();
        PowerUnitAdapter powerUnitForPhone = new PowerUnitForPhone(electricalOutlet);

        phone.charge(electricalOutlet.getVoltage());
        phone.charge(powerUnitForPhone.charge());

    }
}
