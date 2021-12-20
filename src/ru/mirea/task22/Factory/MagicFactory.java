package ru.mirea.task22.Factory;

import ru.mirea.task22.Factory.FurnitureFactory;
import ru.mirea.task22.Furniture.Chair;
import ru.mirea.task22.Furniture.MagicChair;
import ru.mirea.task22.Furniture.MagicSofa;
import ru.mirea.task22.Furniture.Sofa;

public class MagicFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }

    @Override
    public Sofa createSofa() {
        return new MagicSofa();
    }
}
