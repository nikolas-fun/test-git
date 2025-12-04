package Homework_05;

public class ByZeroException extends RuntimeException {
    public ByZeroException() {
        super("Что-то пошло не так");
    }
}
