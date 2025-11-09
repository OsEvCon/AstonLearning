package module3.strategyAndChainOfResponsibility;

public class RaspberryPiRunStrategy implements RunningStrategy {

    private int availableRam;
    private int availableMemory;

    public RaspberryPiRunStrategy(int availableRam, int availableMemory) {
        this.availableRam = availableRam;
        this.availableMemory = availableMemory;
    }

    @Override
    public void startProgram(Program program) {
        System.out.println("RaspberryPi: Запускаю " + program.getName());
    }

    @Override
    public boolean canStartProgram(Program program) {
        if (program instanceof Game) {
            System.out.println("Какие игры Чумба? RaspberryPi не предназначен для игр");
            return false;
        } else {
            return program.getNeededMemory() <= availableMemory && program.getNeededRam() <= availableRam;
        }
    }
}
