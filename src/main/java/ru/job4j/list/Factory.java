package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

import static java.util.List.of;

public class Factory {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(of("first", "second", "third", "fourth", "fifth"));
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}