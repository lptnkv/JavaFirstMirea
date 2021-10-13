package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
