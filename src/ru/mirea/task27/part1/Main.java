package ru.mirea.task27.part1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        dict.put("Иванов", "Дамир");
        dict.put("Матчин", "Артемий");
        dict.put("Смирнов", "Андрей");
        dict.put("Тулкушов", "Петр");
        dict.put("Проценко", "Иван");
        dict.put("Антипин", "Алексей");
        dict.put("Овечкин", "Иван");
        dict.put("Лебедев", "Артемий");
        dict.put("Липатников", "Кирилл");
        dict.put("Коробов", "Максим");

        for (Map.Entry<String, String> entry : dict.entrySet()) {
            count.put(entry.getValue(), count.getOrDefault(entry.getValue(), 0) + 1);
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Iterator iter = dict.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry pair = (Map.Entry)iter.next();
            if (count.get(pair.getValue()) != 1){
                iter.remove();
            }
        }
        System.out.println("Удаляем повторяющиеся имена:");

        for (Map.Entry<String, String> entry : dict.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
