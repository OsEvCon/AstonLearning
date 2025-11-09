package module3.strategyAndChainOfResponsibility;

public class GamingComputerRunStrategy implements RunningStrategy {

    @Override
    public void startProgram(Program program) {
        System.out.println("Игровой компьютер: Запускаю " + program.getName());
    }

    @Override
    public boolean canStartProgram(Program program) {
        return true;
    }
}
