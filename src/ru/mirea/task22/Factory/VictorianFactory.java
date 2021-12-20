package ru.mirea.task22.Factory;

import ru.mirea.task22.Furniture.Chair;
import ru.mirea.task22.Furniture.Sofa;
import ru.mirea.task22.Furniture.VictorianChair;
import ru.mirea.task22.Furniture.VictorianSofa;

public class VictorianFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
