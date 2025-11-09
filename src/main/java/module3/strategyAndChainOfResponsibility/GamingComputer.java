package module3.strategyAndChainOfResponsibility;

public class GamingComputer extends Computer{

    public GamingComputer(String name, int ramCapacity, int memoryCapacity) {
        super(name, ramCapacity, memoryCapacity, new GamingComputerRunStrategy());
    }
}
