package ru.job4j.list;

import java.util.List;
import java.util.ListIterator;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int sum = 0;
        ListIterator<Integer> iterator = data.listIterator();
        Integer numberSecond = iterator.next();
        while (iterator.hasNext()) {
            while (!(numberSecond == (iterator.previous() + iterator.next()) / 2)) {
                return sum;
            }
            for (int i = 0; i < data.size(); i++) {
                sum += data.get(i);
            }
            return sum;
        }
        return sum;
    }
}