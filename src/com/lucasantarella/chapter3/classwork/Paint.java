package com.lucasantarella.chapter3.classwork;

import java.util.Scanner;

public class Paint {

    public static void main(String[] args) {
        final int COVERAGE = 350; //paint covers 350 sq ft/gal

        //declare integers length, width, and height;
        int length, width, height;

        //declare double totalSqFt;
        double totalSqFt;

        //declare double paintNeeded;
        double paintNeeded;

        //declare and initialize Scanner object
        Scanner scanner = new Scanner(System.in);

        //Prompt for and read in the length of the room
        System.out.print("Enter the length of the room (ft): ");
        length = scanner.nextInt();

        //Prompt for and read in the width of the room
        System.out.print("Enter the width of the room (ft): ");
        width = scanner.nextInt();

        //Prompt for and read in the height of the room
        System.out.print("Enter the height of the room (ft): ");
        height = scanner.nextInt();

        //Compute the total square feet to be painted--think
        //about the dimensions of each wall

        // (2 * length * height) + (2 * width * height)
        totalSqFt = 2 * height * (length + width);

        //Compute the amount of paint needed
        paintNeeded = totalSqFt / COVERAGE;

        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
        System.out.printf("%f gallons of paint are required to paint the room measuring %d x %d x %d", paintNeeded, length, width, height);
    }

}
