package ru.mirea.task2.part1;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("circle");
        Shape s2 = new Shape("square", 10, 10);
        System.out.println(s1);
        System.out.println(s2);
    }
}
