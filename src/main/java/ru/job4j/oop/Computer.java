package ru.job4j.oop;

public class Computer {
    private final boolean multiMonitor;

    private final int ssd;

    private final String cpu;

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public static void main(String[] args) {
        Computer computer = new Computer(true, 500, "Intel Core I7-10700K");
        computer.printInfo();
        System.out.println("===========");
        Computer comp = new Computer(true, 256, "AMD Ryzen 5 3600");
        comp.printInfo();
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
    }
}