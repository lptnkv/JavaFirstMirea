package ru.mirea.task4.part1;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Aleksandr Sergeevich Pushkin", "a.s.pushkin@gmail.com", 'm');
        Author a2 = new Author("Joan Rowling", "j.k.rowling@gmail.com", 'f');
        System.out.println(a1);
        System.out.println(a2);
        a2.setEmail("j.k.rowling@edu.mirea.ru");
        System.out.println(a2);
    }
}
