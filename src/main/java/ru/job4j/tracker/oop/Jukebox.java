package ru.job4j.tracker.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
    public static void main(String[] args) {
        Jukebox turntable = new Jukebox();
        turntable.music(1);
        turntable.music(56);
        turntable.music(2);
    }
}
