package ru.mirea.task6.part2;

public class Car implements Priceable {
    float price;
    int horsePowers;

    public Car(float price, int horsePowers) {
        this.price = price;
        this.horsePowers = horsePowers;
    }

    @Override
    public float getPrice() {
        return this.price;
    }
}
