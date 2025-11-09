package module3.strategyAndChainOfResponsibility;

public class Program {
    private String name;
    private int neededRam;
    private int neededMemory;

    public Program(String name, int neededRam, int neededMemory) {
        this.name = name;
        this.neededRam = neededRam;
        this.neededMemory = neededMemory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNeededRam() {
        return neededRam;
    }

    public void setNeededRam(int neededRam) {
        this.neededRam = neededRam;
    }

    public int getNeededMemory() {
        return neededMemory;
    }

    public void setNeededMemory(int neededMemory) {
        this.neededMemory = neededMemory;
    }
}
