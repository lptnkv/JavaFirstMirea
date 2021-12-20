package ru.mirea.task22.Furniture;

public class MagicSofa implements Sofa {

    @Override
    public String getSofaName() {
        return "Магический диван";
    }

    @Override
    public String getSize() {
        return "Маленький";
    }
}
