package ru.mirea.task21;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Line> lines = new ArrayList<Line>();
        lines.add(new Line("Сокольническая", "красная"));
        lines.add(new Line("Замоскворецкая", "зеленая"));
        lines.add(new Line("Арбатско-покровская", "синяя"));
        lines.add(new Line("Кольцевая", "коричневая"));
        lines.add(new Line("Филевская", "голубая"));
        lines.add(new Line("Серпуховско-Тимирязевская", "серая"));
        GenericClass genericObj = new GenericClass(lines);
        System.out.println("Нечетные элементы списка:");
        genericObj.printList(true);
        System.out.println();
        System.out.println("Четные элементы списка:");
        genericObj.printList(false);

    }
}
