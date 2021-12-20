package ru.mirea.task29;

import java.io.*;

public class TestCurrency {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String[] countries = {"Россия", "США", "Украина", "Чехия", "Турция"};
        String[] names = {"Рубль", "Доллар", "Гривна", "Крона", "Лира"};

        CurrencyInfo currencyInfo = new CurrencyInfo(countries, names);
        System.out.println("Объект до сериализации:");
        System.out.println(currencyInfo);

        FileOutputStream outputStream = new FileOutputStream("D:\\MIREA\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(currencyInfo);

        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("D:\\MIREA\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurrencyInfo deserialized = (CurrencyInfo) objectInputStream.readObject();
        System.out.println("Объект после записи в файл, чтения и десериализации:");
        System.out.println(deserialized);
    }
}
