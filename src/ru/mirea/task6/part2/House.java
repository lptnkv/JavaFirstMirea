package ru.mirea.task6.part2;

public class House implements Priceable {
    float square;
    float priceForSquare;

    public House(float square, float priceForSquare) {
        this.square = square;
        this.priceForSquare = priceForSquare;
    }

    @Override
    public float getPrice() {
        return this.priceForSquare * this.square;
    }
}
