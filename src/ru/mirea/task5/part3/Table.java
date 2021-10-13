package ru.mirea.task5.part3;

public class Table extends Furniture {
    public Table(float height, float width, float price) {
        super(height, width, price);
        this.name = "Table";
    }

    public Table() {
        super(1f, 1.4f, 3000);
        this.name = "Table";
    }

    @Override
    public void sell() {
        System.out.println("Table is sold for " + this.price);
    }

    @Override
    public String toString() {
        return "Table at a cost of " + this.price;
    }
}
