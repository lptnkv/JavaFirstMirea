package ru.mirea.task1;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Сумма элементов целочисленного массива");
        int[] arr = {5, 6, 15, 32, 100};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Сумма циклом for: " + sum);
        sum = 0;
        int i = 0;
        while (i != arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println("Сумма циклом while: " + sum);
        sum = 0;
        i = 0;
        do{
            sum += arr[i];
            i++;
        } while (i < arr.length);
        System.out.println("Сумма циклом do while: " + sum);
    }
}
