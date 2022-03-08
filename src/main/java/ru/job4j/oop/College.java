package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        /* делаем приведение к типу Student. */
        Student st = freshman;
        /* делаем приведение к типу Object. */
        Object obj = freshman;
    }
}
