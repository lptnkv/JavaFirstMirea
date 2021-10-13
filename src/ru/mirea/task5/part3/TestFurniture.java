package ru.mirea.task5.part3;

public class TestFurniture {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();
        System.out.println(shop);
        shop.sellProduct(new Table());
        shop.sellProduct(new Table());
        shop.sellProduct(new Sofa());
        System.out.println(shop);
    }
}
