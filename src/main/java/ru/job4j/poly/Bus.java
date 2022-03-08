package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Едем куда-то");
    }

    @Override
    public void passengers(int numberPassengers) {
        System.out.println("Вот количество наших пассажиров" + numberPassengers);
    }

    @Override
    public int refuel(int fuelQuantity) {
        return fuelQuantity * 30;
    }
}
