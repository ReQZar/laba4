package Exceptions;

public class TimeUnderZero extends Exception {
    public TimeUnderZero() {
        super("Ошибка: время не может быть отрицательным. ");
    }
}