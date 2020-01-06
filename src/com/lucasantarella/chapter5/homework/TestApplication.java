package com.lucasantarella.chapter5.homework;

import java.util.Scanner;

public class TestApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DieAndCoin pair = new DieAndCoin();
        int plays;

        System.out.print("Enter the number of times to play: ");
        plays = scanner.nextInt();

        int wins = 0;
        for (int i = 0; i < plays; i++) {
            pair.play();
            if (pair.win())
                wins++;
        }

        System.out.printf("%s wins", wins);

    }

}
