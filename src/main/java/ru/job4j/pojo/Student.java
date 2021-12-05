package ru.job4j.pojo;

import ru.job4j.tracker.Item;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Student {
    private String fio;
    private int group;
    private String date;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String currentDate) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        currentDate = item.getCreated().format(formatter);
        this.date = currentDate;
    }
}
