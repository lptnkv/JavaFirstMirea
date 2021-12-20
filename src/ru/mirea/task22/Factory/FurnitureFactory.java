package ru.mirea.task22.Factory;

import ru.mirea.task22.Furniture.Chair;
import ru.mirea.task22.Furniture.Sofa;

public interface FurnitureFactory {
    public Chair createChair();
    public Sofa createSofa();
}
