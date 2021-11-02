package ru.job4j.tracker.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.print();
        System.out.println("=========");
        Error error1 = new Error(true, 404, "ERROR");
        error1.print();
    }

    public void print() {
        System.out.println("Ошибка в состоянии " + active);
        System.out.println("Номер ошибки " + status);
        System.out.println("Строка ошибки " + message);
    }
}
