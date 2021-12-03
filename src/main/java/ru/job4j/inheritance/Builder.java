package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String tool;

    public Builder(String name, String surname, String education, int birthday,
                   int experience, String tools) {
        super(name, surname, education, birthday, experience);
        this.tool = tools;
    }

    public void buildHouse() {

    }
}
