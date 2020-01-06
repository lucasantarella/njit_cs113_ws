package com.lucasantarella.chapter5.lecture;

public class Loop {

    public static void main(String[] args) {

        firstLoop:
        for (int i = 0; i < 20; i++) {
            secondLoop:
            for (int j = 0; j < 20; j++) {
                System.out.printf("%d %d\n", i, j);
                if(i == 13 && j == 14)
                    break firstLoop;
            }
        }

    }

}
