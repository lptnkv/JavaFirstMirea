package ru.mirea.task22;

import ru.mirea.task22.Furniture.Chair;
import ru.mirea.task22.Furniture.Sofa;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public void sit(Chair chair){
        System.out.println(this.name + " сел на " + chair.getChairName());
    }

    public void sit(Sofa sofa){
        System.out.println(this.name + " сел на " + sofa.getSofaName());
    }
}
