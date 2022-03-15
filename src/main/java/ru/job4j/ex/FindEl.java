package ru.job4j.ex;

import java.util.Objects;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (Objects.equals(value[i], key))  {
                rsl = i;
            } else {
                rsl = -1;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Item missing");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String[] value = {"go", "down", "top"};
            System.out.println(indexOf(value, "bob"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}