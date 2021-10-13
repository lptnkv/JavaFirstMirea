package ru.mirea.task7.part2;

public class TestMovable {
    public static void main(String[] args) {
        MovableRectangle rect1 = new MovableRectangle(0, 0, 100, 100, 5, 5);
        System.out.println(rect1);
        rect1.moveRight();
        rect1.moveDown();
        System.out.println(rect1);

        MovableCircle c1 = new MovableCircle(50, 100, 100, 10, 10);
        System.out.println(c1);
        c1.moveLeft();
        c1.moveUp();
        System.out.println(c1);
    }
}
