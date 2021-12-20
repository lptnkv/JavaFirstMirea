package ru.mirea.task22.Factory;

import ru.mirea.task22.Factory.FurnitureFactory;
import ru.mirea.task22.Furniture.Chair;
import ru.mirea.task22.Furniture.MultiChair;
import ru.mirea.task22.Furniture.MultiSofa;
import ru.mirea.task22.Furniture.Sofa;

public class MultiFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new MultiChair();
    }

    @Override
    public Sofa createSofa() {
        return new MultiSofa();
    }
}
