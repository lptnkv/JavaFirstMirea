package ru.mirea.task10;

import java.util.Scanner;

public class Ex14{
    public static void main(String[] args) {
        int N;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        print(N);
    }

    public static void print(int n){
        if (n / 10 > 0){
            print(n/10);
        }
        System.out.println(n % 10);
    }
}
