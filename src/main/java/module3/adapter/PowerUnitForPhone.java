package module3.adapter;

public class PowerUnitForPhone implements PowerUnitAdapter {
    ElectricalOutlet electricalOutlet;

    public PowerUnitForPhone(ElectricalOutlet electricalOutlet) {
        this.electricalOutlet = electricalOutlet;
    }


    @Override
    public int charge() {
        if (electricalOutlet.getVoltage() > 240){
            System.out.println("Зарядное устройство: Слишком высокое напряжение сети");
        } else if (electricalOutlet.getVoltage() < 180){
            System.out.println("Зарядное устройство: Слишком низкое напряжение сети");
        } else {
            System.out.println("Зарядное устройство: Выдаю 5 вольт");
        }
        return 5;
    }
}
