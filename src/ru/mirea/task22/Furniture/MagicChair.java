package ru.mirea.task22.Furniture;

public class MagicChair implements Chair {
    @Override
    public String getChairName() {
        return "Магический стул";
    }

    @Override
    public int getNumberOfLegs() {
        return 0;
    }
}
