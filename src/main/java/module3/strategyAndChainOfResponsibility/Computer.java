package module3.strategyAndChainOfResponsibility;

public class Computer {
    private String name;
    private int ramCapacity;
    private int memoryCapacity;
    private RunningStrategy runningStrategy;
    private Computer nextComputer;

    public Computer(String name, int ramCapacity, int memoryCapacity,  RunningStrategy runningStrategy) {
        this.name = name;
        this.ramCapacity = ramCapacity;
        this.memoryCapacity = memoryCapacity;
        this.runningStrategy = runningStrategy;
    }

    public void powerOn()
    {
        System.out.println(this.name + " включен");
    }

    public void powerOff(){
        System.out.println(this.name + " выключен");
    }



    public void startProgram(Program program)
    {
        boolean canRun = runningStrategy.canStartProgram(program);

        if (canRun)
        {
            runningStrategy.startProgram(program);
        } else if (nextComputer != null){
            System.out.println(name + ": не могу запустить " + program.getName() + " Передаю по цепочке: " + nextComputer.name);
            nextComputer.startProgram(program);
        }
    }

    public void setNextComputer(Computer nextComputer) {
        this.nextComputer = nextComputer;
    }
}
