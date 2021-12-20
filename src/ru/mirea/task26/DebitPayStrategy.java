package ru.mirea.task26;

import java.util.Scanner;

public class DebitPayStrategy implements PayStrategy {
    @Override
    public void pay() {
        Scanner in = new Scanner(System.in);
        String cardNumber;
        String activeTill;
        int cvv;
        System.out.println("Оплата с помощью карты");
        System.out.println("Введите номер карты:");
        cardNumber = in.next();
        System.out.println("Введите срок действия:");
        activeTill = in.next();
        System.out.println("Введите CVV:");
        cvv = in.nextInt();
    }
}
