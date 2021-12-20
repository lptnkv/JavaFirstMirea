package ru.mirea.task14.Task1;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> input1 = new ArrayList<>();
        ArrayList<Integer> input2 = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            input1.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++){
            input2.add(in.nextInt());
        }
        Collections.reverse(input1);
        Collections.reverse(input2);
        for (int i = 0; i < 5; i++){
            s1.add(input1.get(i));
            s2.add(input2.get(i));
        }
        int count = 1;
        int card1, card2;
        while (count < 106){
            card1 = s1.pop();
            card2 = s2.pop();
            if (card1 == 0 && card2 == 9) {
                s1.add(0, card1);
                s1.add(0, card2);

                if (s1.empty()) {
                    System.out.println("second " + count + "\n");
                    return;
                } else if (s2.empty()) {
                    System.out.println("first " + count + "\n");
                    return;
                }
                continue;

            } else if (card2 == 0 && card1 == 9) {
                s2.add(0, card2);
                s2.add(0, card1);
                if (s1.empty()) {
                    System.out.println("second " + count + "\n");
                    return;
                } else if (s2.empty()) {
                    System.out.println("first " + count + "\n");
                    return;
                }
                continue;
            }

            if (card1 > card2) {
                s1.add(0, card1);
                s1.add(0, card2);
            } else {
                s2.add(0, card2);
                s2.add(0, card1);
            }

            if (s1.empty()) {
                System.out.println("second " + count + "\n");
                return;
            } else if (s2.empty()) {
                System.out.println("first " + count + "\n");
                return;
            }
            count++;
        }
        System.out.println("botva");
        return;
    }
}
