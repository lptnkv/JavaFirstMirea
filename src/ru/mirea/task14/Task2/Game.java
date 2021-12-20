package ru.mirea.task14.Task2;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            q1.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++){
            q2.add(in.nextInt());
        }
        int count = 1;
        int card1, card2;
        while (count < 106){
            card1 = q1.poll();
            card2 = q2.poll();
            if (card1 == 0 && card2 == 9) {
                q1.add(card1);
                q1.add(card2);

                if (q1.isEmpty()) {
                    System.out.println("second " + count + "\n");
                    return;
                } else if (q2.isEmpty()) {
                    System.out.println("first " + count + "\n");
                    return;
                }
                continue;

            } else if (card2 == 0 && card1 == 9) {
                q2.add(card2);
                q2.add(card1);
                if (q1.isEmpty()) {
                    System.out.println("second " + count + "\n");
                    return;
                } else if (q2.isEmpty()) {
                    System.out.println("first " + count + "\n");
                    return;
                }
                continue;
            }

            if (card1 > card2) {
                q1.add(card1);
                q1.add(card2);
            } else {
                q2.add(card2);
                q2.add(card1);
            }

            if (q1.isEmpty()) {
                System.out.println("second " + count + "\n");
                return;
            } else if (q2.isEmpty()) {
                System.out.println("first " + count + "\n");
                return;
            }
            count++;
        }
        System.out.println("botva");
        return;
    }
}
