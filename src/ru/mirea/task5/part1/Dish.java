package ru.mirea.task5.part1;

public abstract class Dish {
    String material;
    boolean isWashed;

    public Dish(String material) {
        this.material = material;
        this.isWashed = true;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isWashed() {
        return isWashed;
    }

    public void setWashed(boolean washed) {
        isWashed = washed;
    }

    abstract void smash();
}
