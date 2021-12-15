package ru.mirea.task10;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        print(N);
    }

    public static void print(int n){
        System.out.println(n%10);
        if (n > 10){
            print(n/10);
        }
    }
}
