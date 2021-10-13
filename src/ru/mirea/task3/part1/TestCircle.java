package ru.mirea.task3.part1;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2, "red");
        System.out.println(c1);
        System.out.println(c2);
        c2.setColor("blue");
        c2.setRadius(5);
        System.out.println(c2);
    }
}
