package ru.job4j.tracker.oop;

public class Cat {
    private String name;
    private String food;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.food);
        System.out.println("Cat's nickname: " + this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.print("There are gav's food: ");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Гав");
        gav.show();
        System.out.print("There are black's food: ");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Черный кот");
        black.show();
    }

}
