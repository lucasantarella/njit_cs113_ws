package com.lucasantarella.chapter5.classwork;

public class TestDice {

    public static void main(String[] args) {
        // larger loop for testing
        for (int j = 0; j < 50; j++) {

            Die dice1 = new Die();
            Die dice2 = new Die();
            int count = 0;

            do {
                System.out.printf("%d %d\n", dice1.getFaceValue(), dice2.getFaceValue());
                dice1.roll();
                dice2.roll();
                if (dice1.compareTo(dice2) == -1)
                    count++;
            } while (dice1.compareTo(dice2) == 0);

            System.out.printf("Die 1 less than Die 2 ~%d~ times.\n\n", count);

        }
    }


}
