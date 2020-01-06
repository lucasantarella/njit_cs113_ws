package com.lucasantarella.chapter5.lab;

import java.util.Scanner;

public class CoinFlip {

    public static void main(String[] args) {

        // Instantiate variables
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        Scanner scanner = new Scanner(System.in);
        int flipLimit;

        // Get limit from user input
        System.out.print("Enter the max number of times to flip: ");
        flipLimit = scanner.nextInt();

        int i = 0;
        do {
            i++;
            coin1.flip();
            coin2.flip();
            if (!coin1.isHeads() && !coin2.isHeads()) {
                // Print iterator count
                System.out.println(i);
                return;
            }
        } while (i < flipLimit && (coin1.isHeads() || coin2.isHeads()));

        // Never reached tails, print 0
        System.out.println(0);
    }

}
