package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.isEmpty()) {
            for (User user1 : users.keySet()) {
                if (!user1.getPassport().equals(user.getPassport())) {
                    users.putIfAbsent(user, new ArrayList<Account>());
                }
            }
        } else {
            users.putIfAbsent(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        users.get(user).add(account);
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
            for (Account account1:accounts) {
                if (account1.getRequisite().equals(requisite)) {
                    return account1;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account account1 = findByRequisite(srcPassport, srcRequisite);
        Account account2 = findByRequisite(destPassport, destRequisite);
        boolean rsl = false;
        if (account1.getBalance() >= amount && account1 != null) {
            account2.setBalance(account2.getBalance() + amount);
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