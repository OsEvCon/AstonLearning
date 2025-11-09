package module3.strategyAndChainOfResponsibility;

public class NoteBookRunStrategy implements RunningStrategy {
    private int availableRam;
    private int availableMemory;

    public NoteBookRunStrategy(int availableRam, int availableMemory) {
        this.availableRam = availableRam;
        this.availableMemory = availableMemory;
    }

    @Override
    public void startProgram(Program program) {
            System.out.println("Ноутбук: Запускаю " + program.getName());
    }

    @Override
    public boolean canStartProgram(Program program) {
        return program.getNeededRam() <= availableRam && program.getNeededMemory() <= availableMemory;
    }
}
