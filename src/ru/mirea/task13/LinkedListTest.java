package ru.mirea.task13;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.addFirst("Third");
        System.out.println(list);

        System.out.println(list.get(2));

        System.out.println(list.getLast());

        System.out.println(list.peek());

        System.out.println(list.pop());

        System.out.println(list);

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());
    }
}
