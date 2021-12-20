package ru.mirea.task22;

import ru.mirea.task22.Factory.MagicFactory;
import ru.mirea.task22.Factory.VictorianFactory;
import ru.mirea.task22.Furniture.VictorianChair;

public class Test {
    public static void main(String[] args) {
        Client client = new Client("John");
        client.sit(new MagicFactory().createChair());
        client.sit(new VictorianFactory().createSofa());
    }
}
