package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс с паспортными данными и именем нашего юзера
 * Необходим, чтобы работать с юзером и обращаться к нему
 * @author Dibirov Murat
 * @version 1.0
 */
public class User {
    private String passport;
    private String username;

    /**
     * Конструктор, который принимает паспортные данные и имя
     * @param passport
     * @param username
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод get для паспортных данных
     * @return
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод set для паспортных данных(если нужно будет поменять данные наши)
     * @param passport
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод get для имени
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод set для изменения имени
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределение equals
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределение hashCode
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}