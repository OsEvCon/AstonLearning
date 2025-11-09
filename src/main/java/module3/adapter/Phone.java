package module3.adapter;

public class Phone {

    public void charge(int inputVoltage) {
        if (inputVoltage > 5) {
            System.out.println("Телефон: слишком высокое напряжение. Сработала защита");
        } else {
            System.out.println("Телефон: Заряжаюсь");
        }
    }
}
