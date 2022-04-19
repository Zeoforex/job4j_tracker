package ru.job4j.bank;

import java.util.*;

/**
 * Класс, в котором реализованы все наши методы
 * @author Dibirov Murat
 * @version 1.0
 */
public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавление юзера в наш Банк
     * Метод принимает юзера и добавляет с помощью метода putIfAbsent так как он удобнее
     * @param user
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Добавление наших реквизитов
     * Сначала смотрим что наш юзер не нулевой
     * Потом проверяю, что у аккаунтов которые мы извлекли нет добавляемого аккаунта
     * И в последнюю очередь уже добавляем
     * @param passport
     * @param account
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод нахождение по пасспорту определенного юзера
     * Мы в цикле проходимся по ключам users и потом находим того юзера
     * У которого паспортные данные совпадают с нашими
     * И его выводим
     * @param passport
     * @return
     */
    public User findByPassport(String passport) {
        for (User userFind : users.keySet()) {
            if (userFind.getPassport().equals(passport)) {
                return userFind;
            }
        }
        return null;
    }

    /**
     * Метод поиска счета по паспорту и реквизитам
     * Находим юзера по паспорту и проверяем, что он не нулевой
     * Дальше находим все аккаунты по users.get
     * А дальше проходимся по циклу и по условию ищем необходимого аккаунта
     * И возвращаем его
     * @param passport
     * @param requisite
     * @return account
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод для перевода денег с одного счета на другой
     * Сначала находим 2 счета(с которого будем переводить и куда)
     * Проверяем, что они оба не нулевые и, что деньги есть на счету
     * И пользуемся сеттерами чтоб осуществить перевод (снятие денег с 1 счета и зачисление на 2 счет)
     * И выводим true если получилось или false если нет
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param destRequisite
     * @param amount
     * @return
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account accountSrc = findByRequisite(srcPassport, srcRequisite);
        Account accountDest = findByRequisite(destPassport, destRequisite);
        boolean rsl = false;
        if (accountSrc != null && accountDest != null && accountSrc.getBalance() >= amount) {
            accountSrc.setBalance(accountSrc.getBalance() - amount);
            accountDest.setBalance(accountDest.getBalance() + amount);
            return true;
        }
        return rsl;
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
        BankService that = (BankService) o;
        return Objects.equals(users, that.users);
    }

    /**
     * Переопределение hashCode
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(users);
    }
}