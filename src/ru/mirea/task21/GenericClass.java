package ru.mirea.task21;

import java.util.List;

public class GenericClass<T> {
    private List<T> list;

    public GenericClass(List<T> list) {
        this.list = list;
    }

    public void printList(boolean odds){
        if (odds) {
            for (int i = 0; i < list.size(); i += 2) {
                System.out.println(list.get(i));
            }
        } else {
            for (int i = 1; i < list.size(); i += 2) {
                System.out.println(list.get(i));
            }
        }
    }
}
