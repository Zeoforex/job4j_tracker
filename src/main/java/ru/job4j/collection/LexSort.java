package ru.job4j.collection;

import java.util.Comparator;
public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        return Integer.compare(Integer.parseInt(String.valueOf(left.split("\\.")[0])),
                Integer.parseInt(String.valueOf(right.split("\\.")[0])));
    }
}