package ru.mirea.task32;

import java.util.Random;
import java.util.Scanner;

public class TestPayment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int productId;
        int orderId = random.nextInt();
        int option = -1;
        System.out.println("Выберите номер товара");
        productId = in.nextInt();
        System.out.println("Выберите способ оплаты:");
        System.out.println("1 - eWallet");
        System.out.println("2 - Дебетовая карта");
        option = in.nextInt();
        Payment payment;
        switch (option) {
            case 1: {
                payment = new EWalletPayment(productId, orderId);
                break;
            }
            case 2: {
                payment = new DebitPayment(productId, orderId);
                break;
            }
            default: {
                return;
            }
        }
        payment.pay();
        System.out.println("Заказ №" + orderId + " оплачен");
    }
}
