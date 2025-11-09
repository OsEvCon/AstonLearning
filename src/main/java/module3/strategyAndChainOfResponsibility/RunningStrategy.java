package module3.strategyAndChainOfResponsibility;

public interface RunningStrategy {
    public void startProgram(Program program);
    public boolean canStartProgram(Program program);
}
