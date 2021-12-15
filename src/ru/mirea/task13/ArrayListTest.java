package ru.mirea.task13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List <Integer> arr1 = new ArrayList<>();
        arr1.add(15);
        arr1.add(13);
        arr1.add(100);
        arr1.add(17);
        System.out.println(arr1);

        System.out.println(arr1.contains(100));
        System.out.println(arr1.indexOf(100));
        arr1.remove(arr1.indexOf(100));
        System.out.println(arr1.contains(100));

        System.out.println(arr1.size());
        System.out.println(arr1.isEmpty());

        arr1.clear();
        System.out.println(arr1.size());
        System.out.println(arr1.isEmpty());

    }
}
