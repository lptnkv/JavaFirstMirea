package ru.mirea.task1;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        System.out.println(fact(in.nextInt()));
    }

    public static int fact(int x){
        int res = 1;
        for (int i = 1; i <= x; i++){
            res *= i;
        }
        return res;
    }
}
