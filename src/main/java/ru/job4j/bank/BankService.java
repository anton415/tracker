package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Главный сервис.
 */
public class BankService {
    /**
     * Список пользователей и их аккаунты.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавление пользователя.
     * @param user - пользователь.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Добавление аккаунта.
     * @param passport - паспорт пользователя.
     * @param account - аккаунт.
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
     * Поиск пользователя по паспорту.
     * @param passport - паспорт.
     * @return - пользователь.
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> passport.equals(user.getPassport()))
                .findFirst()
                .orElse(null);
    }

    /**
     * Поиск аккаунта по реквизиту.
     * @param passport - паспорт.
     * @param requisite - реквизит.
     * @return - аккаунт.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (null != user) {
            return users.get(user)
                    .stream()
                    .filter(account -> requisite.equals(account.getRequisite()))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Перевод денег.
     * @param srcPassport - паспорт отправителя.
     * @param srcRequisite - реквизит отправителя.
     * @param destPassport - паспорт получателя.
     * @param destRequisite - реквизит получателя.
     * @param amount - сумма перевода.
     * @return - успешный или не успешный перевод.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && srcAccount.getBalance() >= amount && destAccount != null) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
