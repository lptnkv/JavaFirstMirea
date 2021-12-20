package ru.mirea.task19;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значения углов через пробел:");
        double angle1 = in.nextDouble();
        double angle2 = in.nextDouble();
        double angle3 = in.nextDouble();
        try {
            Triang triangle = new Triang(angle1, angle2, angle3);
            System.out.println(triangle);
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
