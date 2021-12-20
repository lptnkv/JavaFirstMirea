package ru.mirea.task22.Furniture;

public class MultiSofa implements Sofa {
    @Override
    public String getSofaName() {
        return "Многофункциональный диван";
    }

    @Override
    public String getSize() {
        return "Средний";
    }
}
