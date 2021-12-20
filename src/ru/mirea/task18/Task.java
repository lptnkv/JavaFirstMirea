package ru.mirea.task18;

import java.util.Scanner;

public class Task {
    public static void validateINN(String inn) throws MyException{
        if (inn.length() != 12){
            throw new MyException("Invalid length");
        }
        int[] numbers = new int[12];
        int[] first_coeffs = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int[] second_coeffs = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        for (int i = 0; i < inn.length(); i++){
            numbers[i] = Character.getNumericValue(inn.charAt(i));
        }

        int summ1 = 0;
        for (int i = 0; i < 11; i++){
            summ1 += numbers[i] * first_coeffs[i];
        }
        int n1 = (summ1 % 11) % 10;
        if (n1 != numbers[11]){
            throw new MyException("Invalid INN");
        }

        int summ2 = 0;
        for (int i = 0; i < 10; i++){
            summ2 += numbers[i] * second_coeffs[i];
        }
        int n2 = (summ2 % 11) % 10;
        if (n2 != numbers[10]){
            throw new MyException("Invalid INN");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        String inn;
        System.out.println("Введите ФИО: ");
        name = in.nextLine();
        System.out.println("Введите ИНН: ");
        inn = in.nextLine();
        try {
            validateINN(inn);
            System.out.println("Успешно!");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
