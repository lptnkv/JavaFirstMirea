package ru.mirea.task6.part2;

public class TestPriceable {
    public static void main(String[] args) {
        House h1 = new House(200, 17500);
        Car c1 = new Car(700000, 100);
        System.out.println("Price of a house is " + h1.getPrice());
        System.out.println("Price of a car is " + c1.getPrice());
    }
}
