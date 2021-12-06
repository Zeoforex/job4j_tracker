package ru.job4j.pojo;

import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 150);
        Book book2 = new Book("New book", 170);
        Book book3 = new Book("Old book", 150);
        Book book4 = new Book("Nice book", 150);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getNumberPages());
        }
        books[0] = book4;
        books[3] = book1;
        System.out.println("=====================");
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getNumberPages());
        }
        System.out.println("=====================");
        for (Book bk : books) {
            if (Objects.equals(bk.getName(), "Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getNumberPages());
            }
        }
    }
}
