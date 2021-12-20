package ru.mirea.task22.Furniture;

public class MultiChair implements Chair {

    @Override
    public String getChairName() {
        return "Многофункциональный стул";
    }

    @Override
    public int getNumberOfLegs() {
        return 3;
    }
}
