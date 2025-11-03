package module2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFileManager {

    public MyFileManager() {
    }

    public byte[] readFile(String fileName){
        Path path = Paths.get(fileName);
        try {
            return Files.readAllBytes(path);
        } catch (IOException e) {
            throw new MyException("Ошибка чтения файла " + fileName, e);
        }
    }

    public void writeFile(String fileName, byte[] content){
        Path path = Paths.get(fileName);
        try {
            Files.write(path, content);
        } catch (IOException e) {
            throw new MyException("Ошибка записи файла " + fileName, e);
        }
    }
}
