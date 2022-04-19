package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс с реквизитами и балансом
 * Нужен нам, чтобы работать со счетом
 * @author Dibirov Murat
 * @version 1.0
 */
public class Account {
    private String requisite;
    private double balance;

    /**
     * Конструктор, который принимает реквизиты и баланс
     * @param requisite
     * @param balance
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * геттер на ревизит
     * необходим чтобы работать с реквзитами
     * @return
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Сеттер для изменений реквизитов
     * @param requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Геттер, чтобы обращаться к балансу
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Сеттер для изменения баланса, если нужно будет
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Переопределение equals для работы в будущем
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
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Переопределение hasCode
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}