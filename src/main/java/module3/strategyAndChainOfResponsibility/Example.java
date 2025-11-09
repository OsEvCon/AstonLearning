package module3.strategyAndChainOfResponsibility;

public class Example {
    public static void main(String[] args) {
        Computer gamingComputer = new GamingComputer("Игровой компьютер",32, 1000);
        Computer noteBook = new NoteBook("Ноутбук",8, 500);
        Computer raspberryPi = new RaspberryPi("Raspberry Pi", 4, 8);

        Program game = new Game("CyberPunk 2077", 12, 70);
        Program photoshop = new Program("Adobe Photoshop", 8, 20);
        Program mw = new Program("Microsoft Word", 4, 4);

        raspberryPi.setNextComputer(noteBook);
        noteBook.setNextComputer(gamingComputer);

        raspberryPi.startProgram(game);
        raspberryPi.startProgram(photoshop);
        raspberryPi.startProgram(mw);
    }
}
