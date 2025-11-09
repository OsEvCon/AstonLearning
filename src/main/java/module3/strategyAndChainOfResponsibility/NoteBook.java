package module3.strategyAndChainOfResponsibility;

public class NoteBook extends Computer{
    public NoteBook(String name, int ramCapacity, int memoryCapacity) {
        super(name, ramCapacity, memoryCapacity, new NoteBookRunStrategy(ramCapacity, memoryCapacity));
    }
}
