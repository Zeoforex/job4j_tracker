package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int percent) {
        this.load = percent;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(15);
        Battery powerBank = new Battery(2);
        System.out.println("battery: " + battery.load + ". powerBank: " + powerBank.load);
        battery.exchange(powerBank);
        System.out.println("battery: " + battery.load + ". powerBank: " + powerBank.load);
    }
}
