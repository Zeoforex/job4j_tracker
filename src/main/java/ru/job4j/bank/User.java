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
     * @param passport принимает паспортные данные
     * @param username принимает имя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод get для паспортных данных
     * @return возвращает паспортные данные
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод set для паспортных данных(если нужно будет поменять данные наши)
     * @param passport принимает паспортные данные для изменения
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод get для имени
     * @return возвращает имя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод set для изменения имени
     * @param username принимает имя, чтобы можно было его изменить в методе
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределение equals
     * @param o принимает параметр Object
     * @return возвращает булево значение
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
     * @return возвращает hashCode
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}