package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User userFind : users.keySet()) {
            if (userFind.getPassport().equals(passport)) {
                return userFind;
            }
        }
        return null;
    }

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

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }
}