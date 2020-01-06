package com.lucasantarella.chapter4.homework;

/**
 * Luca Santarella
 * Homework 1
 * 2019-12-31
 */
public class TestDice {

    public static void main(String[] args) {

        Die die1 = new Die();
        Die die2 = new Die();

        die1.setColor("red");
        die2.setColor("blue");

        System.out.println("Before roll:");
        System.out.printf("Die 1: %d\nDie 2: %d\n", die1.getFaceValue(), die2.getFaceValue());

        die1.roll();
        die2.roll();

        System.out.println("After roll:");
        System.out.printf("Die 1: %d\nDie 2: %d\n", die1.getFaceValue(), die2.getFaceValue());

        System.out.println(die1);
        System.out.println(die2);

    }

}
