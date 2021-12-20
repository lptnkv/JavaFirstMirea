package ru.mirea.task22.Furniture;

import ru.mirea.task22.Furniture.Chair;

public class VictorianChair implements Chair {
    @Override
    public String getChairName() {
        return "Викторианский стул";
    }

    @Override
    public int getNumberOfLegs() {
        return 4;
    }
}
