package com.lucasantarella.chapter4.warmup;

import java.util.Random;
import java.util.Scanner;

public class RandomCharName {

    public static void main(String[] args) {

        String firstName, lastName;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();

        Random random = new Random();

        System.out.printf(
                "Initials: %c%c\n" +
                        "Char from First: %c\n" +
                        "Char from Last: %c",
                firstName.toUpperCase().charAt(0),
                lastName.toUpperCase().charAt(0),
                firstName.charAt(random.nextInt(firstName.length())),
                lastName.charAt(random.nextInt(lastName.length()))
        );


    }

}
