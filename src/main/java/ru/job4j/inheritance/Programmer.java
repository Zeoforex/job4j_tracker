package ru.job4j.inheritance;

import java.io.File;

public class Programmer extends Engineer {
    private String languageProgramming;

    public Programmer(String name, String surname, String education, int birthday, int experience,
                      String languageProgramming) {
        super(name, surname, education, birthday, experience);
        this.languageProgramming = languageProgramming;
    }

    public void writeTest(File file) {

    }
}
