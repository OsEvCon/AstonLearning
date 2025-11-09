package module3.strategyAndChainOfResponsibility;

public class RaspberryPi extends Computer {
    public RaspberryPi(String name, int ramCapacity, int memoryCapacity) {
        super(name, ramCapacity, memoryCapacity, new RaspberryPiRunStrategy(ramCapacity, memoryCapacity));
    }
}
