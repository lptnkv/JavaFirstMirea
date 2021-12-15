package ru.mirea.task13;

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T>{
    private class Node {
        private String value;
        private Node next;

        public Node() {
            this.value = "";
            this.next = null;
        }

        public Node(String value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node list;
    private int size;

    public MyArrayList() {
        this.list = null;
        this.size = 0;
    }

    public void add(String value) {
        Node temp = this.list;
        this.list = new Node(value);
        list.next = temp;
        this.size++;
    }

    public void pop() {
        if (this.list == null)
            return;
        this.list = list.next;
        this.size--;
    }

    public String getByIndex(int index) {
        int i = 0;
        Node temp = this.list;
        while (temp != null && i != index) {
            temp = temp.next;
            i++;
        }
        if (temp != null)
            return temp.value;
        return null;
    }

    public int getSize() {
        return this.size;
    }

    public void printList() {
        Node temp = this.list;
        if (this.list == null)
            System.out.print("List is empty");
        while (temp != null) {
            System.out.print("{" + temp.value.toString() + "} ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteList() {
        while (this.list != null)
            pop();
    }
}