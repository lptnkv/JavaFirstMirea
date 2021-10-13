package ru.mirea.task5.part3;

public class Sofa extends Furniture{
    public Sofa(float height, float width, float price) {
        super(height, width, price);
        this.name = "Sofa";
    }

    public Sofa(){
        super(0.5f, 2, 10000);
        this.name = "Sofa";
    }

    @Override
    public void sell() {
        System.out.println("Sofa is sold for " + this.price);
    }

    @Override
    public String toString() {
        return "Sofa at a cost of " + this.price;
    }
}
