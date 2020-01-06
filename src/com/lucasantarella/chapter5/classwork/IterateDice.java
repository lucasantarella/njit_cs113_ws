package com.lucasantarella.chapter5.classwork;

import java.util.Scanner;

public class IterateDice {

    /**
     * Write an application that crates a default die object.
     * The program asks teh user for the number of times the die will be rolled. It then rolls the die repeatedly,
     * that many times, and prints to the screen the number of times it landed on an odd face value.
     *
     * @param args
     */
    public static void main(String[] args) {

        Die die = new Die();
        Scanner scanner = new Scanner(System.in);
        int limit;

        System.out.print("Enter the number of times to roll the die: ");
        limit = scanner.nextInt();

        int oddCount = rollOdds(die, limit);

        System.out.printf("The die landed on an odd face %d times.\n", oddCount);
    }

    /**
     * A method called rollOdds that takes two parameters. The method rolls the die a number of times and returns the
     * number of times the die landed on an odd face value. It MUST use a do-while
     *
     * @param die           The die to roll.
     * @param numberOfRolls The number of times to roll the die.
     * @return The number of times the die landed on an odd face.
     */
    public static int rollOdds(Die die, int numberOfRolls) {
        int i = 0;
        int oddCounter = 0;
        do {
            die.roll();
            i++;
            if (die.getFaceValue() % 2 == 1)
                oddCounter++;
        } while (i < numberOfRolls);
        return oddCounter;
    }

}
