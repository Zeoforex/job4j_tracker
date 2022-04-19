package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] splitLeft = left.split("[^0-9]");
        String[] splitRight = right.split("[^0-9]");
        String sLeft = String.join(" ", splitLeft);
        String sRight = String.join(" ", splitRight);
        int leftCompare = Integer.parseInt(sLeft);
        int rightCompare = Integer.parseInt(sRight);
        return Integer.compare(leftCompare, rightCompare);
    }
}