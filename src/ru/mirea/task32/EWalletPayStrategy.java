package ru.mirea.task32;

import java.util.Scanner;

public class EWalletPayStrategy implements PayStrategy {

    @Override
    public void pay() {
        Scanner in = new Scanner(System.in);
        String walletId, password;
        int code;
        System.out.println("Оплата с помощью электронного кошелька");
        System.out.println("Введите номер кошелька:");
        walletId = in.next();
        System.out.println("Введите пароль:");
        password = in.next();
        System.out.println("Введите код из смс:");
        code = in.nextInt();
    }
}
