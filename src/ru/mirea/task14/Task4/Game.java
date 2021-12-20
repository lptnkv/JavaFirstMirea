package ru.mirea.task14.Task4;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            l1.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++){
            l2.add(in.nextInt());
        }
        int count = 0;
        int card1, card2;
        while (++count < 106){
            card1 = l1.getLast();
            card2 = l2.getLast();
            l1.removeLast();
            l2.removeLast();
            if (card1 == 0 && card2 == 9) {
                l1.add(card1);
                l1.add(card2);

                if (l1.isEmpty()) {
                    System.out.println("second " + count + "\n");
                    return;
                } else if (l2.isEmpty()) {
                    System.out.println("first " + count + "\n");
                    return;
                }
                continue;

            } else if (card2 == 0 && card1 == 9) {
                l2.add(card2);
                l2.add(card1);
                if (l1.isEmpty()) {
                    System.out.println("second " + count + "\n");
                    return;
                } else if (l2.isEmpty()) {
                    System.out.println("first " + count + "\n");
                    return;
                }
                continue;
            }

            if (card1 > card2) {
                l1.add(card1);
                l1.add(card2);
            } else {
                l2.add(card2);
                l2.add(card1);
            }

            if (l1.isEmpty()) {
                System.out.println("second " + count + "\n");
                return;
            } else if (l2.isEmpty()) {
                System.out.println("first " + count + "\n");
                return;
            }
        }
        System.out.println("botva");
    }
}
