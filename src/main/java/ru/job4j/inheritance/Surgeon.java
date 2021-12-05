package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int yearsOfOperation;

    public Surgeon(String name, String surname, String education, int birthday,
                   String hospital, int yearsOfOperation) {
        super(name, surname, education, birthday, hospital);
        this.yearsOfOperation = yearsOfOperation;
    }

    public void operation(Patient patient) {

    }
}
