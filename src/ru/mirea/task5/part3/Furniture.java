package ru.mirea.task5.part3;

public abstract class Furniture implements Comparable<Furniture> {
    float height;
    float width;
    float price;
    String name;

    public Furniture(float height, float width, float price) {
        this.height = height;
        this.width = width;
        this.price = price;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sell();

    public int compareTo(Furniture furniture) {
        return getName().compareTo(furniture.getName());
    }
}
