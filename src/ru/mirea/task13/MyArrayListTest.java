package ru.mirea.task13;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> arr1 = new MyArrayList<>();
        arr1.add(120);
        arr1.add(57);
        arr1.add(114);
        arr1.add(2);
        System.out.println(arr1);

        System.out.println(arr1.contains(57));
        System.out.println(arr1.indexOf(57));
        arr1.remove(arr1.indexOf(57));
        System.out.println(arr1.contains(57));

        System.out.println(arr1.size());
        System.out.println(arr1.isEmpty());

        arr1.clear();
        System.out.println(arr1.size());
        System.out.println(arr1.isEmpty());
    }
}
