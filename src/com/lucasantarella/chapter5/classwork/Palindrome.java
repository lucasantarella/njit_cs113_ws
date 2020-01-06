package com.lucasantarella.chapter5.classwork;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String input = scanner.nextLine();

        final int length = input.length();
        int i = 0;
        while (true) {
            if (input.charAt(i) != input.charAt(length - (i + 1))) {
                System.out.println("Not a Palindrome!");
                return;
            }
            if (i == length - (i + 1)) {
                System.out.println("String is a Palindrome!");
                return;
            } else
                i++;
        }

    }

}
