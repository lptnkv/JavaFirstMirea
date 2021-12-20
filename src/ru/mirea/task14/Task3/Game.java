package ru.mirea.task14.Task3;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<Integer>();
        Queue<Integer> d2 = new ArrayDeque<Integer>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            d1.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++){
            d2.add(in.nextInt());
        }
        int count = 1;
        int card1, card2;
        while (count < 106){
            card1 = d1.poll();
            card2 = d2.poll();
            if (card1 == 0 && card2 == 9) {
                d1.add(card1);
                d1.add(card2);

                if (d1.isEmpty()) {
                    System.out.println("second " + count + "\n");
                    return;
                } else if (d2.isEmpty()) {
                    System.out.println("first " + count + "\n");
                    return;
                }
                continue;

            } else if (card2 == 0 && card1 == 9) {
                d2.add(card2);
                d2.add(card1);
                if (d1.isEmpty()) {
                    System.out.println("second " + count + "\n");
                    return;
                } else if (d2.isEmpty()) {
                    System.out.println("first " + count + "\n");
                    return;
                }
                continue;
            }

            if (card1 > card2) {
                d1.add(card1);
                d1.add(card2);
            } else {
                d2.add(card2);
                d2.add(card1);
            }

            if (d1.isEmpty()) {
                System.out.println("second " + count + "\n");
                return;
            } else if (d2.isEmpty()) {
                System.out.println("first " + count + "\n");
                return;
            }
            count++;
        }
        System.out.println("botva");
        return;
    }
}
