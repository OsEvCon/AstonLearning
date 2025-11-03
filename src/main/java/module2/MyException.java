package module2;

public class MyException extends RuntimeException {
    public MyException(String message, Throwable throwable){
        super(message, throwable);
    }
}
