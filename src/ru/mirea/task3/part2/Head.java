package ru.mirea.task3.part2;

public class Head {
    boolean hasHair;
    String eyeColor;

    public Head(String eyeColor) {
        this.eyeColor = eyeColor;
        this.hasHair = false;
    }

    public Head() {
        this.eyeColor = "blue";
        this.hasHair = false;
    }

    public boolean hasHair() {
        return hasHair;
    }

    public void setHasHair(boolean hasHair) {
        this.hasHair = hasHair;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
