package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String qualityImplant;

    public Dentist(String name, String surname, String education, int birthday, String hospital, String qualityImplant) {
        super(name, surname, education, birthday, hospital);
        this.qualityImplant = qualityImplant;
    }

    public void chekCaries(String check) {

    }
}
