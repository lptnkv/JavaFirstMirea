package ru.mirea.task12;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] iDNumber = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++){
            iDNumber[i] = random.nextInt(100);
        }
        System.out.println("Часть 1");
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(iDNumber));
        for (int left = 0; left < iDNumber.length; left++) {
            int value = iDNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < iDNumber[i]) {
                    iDNumber[i + 1] = iDNumber[i];
                } else {
                    break;
                }
            }
            iDNumber[i + 1] = value;
        }
        System.out.println("Отсортированный вставками массив:");
        System.out.println(Arrays.toString(iDNumber));


        System.out.println("Часть 2");
        Student students[] = {
                new Student("John", 57),
                new Student("Kirill", 68),
                new Student("Andrew", 45),
                new Student("Jack", 35),
                new Student("Alan", 89)
        };
        System.out.println("Исходный массив студентов");
        System.out.println(Arrays.toString(students));

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        System.out.println("Массив студентов, отсортированный по убыванию GPA");
        sorter.sortPrint(students);

        System.out.println("Третья часть");
        Student students2[] = {
                new Student("Valera", 19),
                new Student("Artem", 14),
                new Student("Peter", 63),
                new Student("Chris", 28),
                new Student("Ivan", 99)
        };
        System.out.println("Исходные массивы");
        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(students2));

        Student[] result = new Student[students.length + students2.length];
        int pos = 0;
        for (Student s : students){
            result[pos] = s;
            pos++;
        }
        for (Student s : students2){
            result[pos] = s;
            pos++;
        }
        sorter.mergeSort(result, 0, result.length - 1);
        System.out.println(Arrays.toString(result));

    }
}
