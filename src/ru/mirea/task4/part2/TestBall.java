package ru.mirea.task4.part2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(10, 10);
        System.out.println(b1);
        System.out.println(b2);
        b1.move(10, 10);
        b2.move(15, 15);
        System.out.println(b1);
        System.out.println(b2);
    }
}
