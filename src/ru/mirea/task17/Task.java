package ru.mirea.task17;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int choice = -1;
        Scanner in = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Выберите планету, чтобы узнать информацию о ней");
            System.out.println("1 - Меркурий");
            System.out.println("2 - Венера");
            System.out.println("3 - Земля");
            System.out.println("4 - Марс");
            System.out.println("5 - Юпитер");
            System.out.println("6 - Сатурн");
            System.out.println("7 - Уран");
            System.out.println("8 - Нептун");
            System.out.println("9 - Плутон");
            System.out.println("0 - Завершить");
            choice = in.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Меркурий");
                    Planet.Mercury.printInfo();
                    break;
                }
                case 2:{
                    System.out.println("Венера");
                    Planet.Venus.printInfo();
                    break;
                }
                case 3:{
                    System.out.println("Земля");
                    Planet.Earth.printInfo();
                    break;
                }
                case 4:{
                    System.out.println("Марс");
                    Planet.Mars.printInfo();
                    break;
                }
                case 5:{
                    System.out.println("Юпитер");
                    Planet.Jupiter.printInfo();
                    break;
                }
                case 6:{
                    System.out.println("Сатурн");
                    Planet.Saturn.printInfo();
                    break;
                }
                case 7:{
                    System.out.println("Уран");
                    Planet.Uranus.printInfo();
                    break;
                }
                case 8:{
                    System.out.println("Нептун");
                    Planet.Neptune.printInfo();
                    break;
                }
                case 9:{
                    System.out.println("Плутон");
                    Planet.Pluto.printInfo();
                    break;
                }
                case 0:{
                    break;
                }
            }
        }
    }
}
