package com.lucasantarella.chapter4.lecture;

public class TestDice {

    public static void main(String[] args) {

        Die dice1 = new Die(3);
        Die dice2 = new Die(5);

        System.out.println("Before roll:");
        System.out.printf("Dice 1: %d\nDice 2: %d\n", dice1.getFaceValue(), dice2.getFaceValue());

        dice1.roll();
        dice2.roll();

        System.out.println("After roll:");
        System.out.printf("Dice 1: %d\nDice 2: %d\n", dice1.getFaceValue(), dice2.getFaceValue());

        dice1.setFaceValue(3);
        System.out.print(dice1);


    }

}
