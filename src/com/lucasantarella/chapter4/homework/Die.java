package com.lucasantarella.chapter4.homework;

/**
 * Luca Santarella
 * Homework 1
 * 2019-12-31
 */
public class Die {

    private int faceValue;

    private String color;

    public Die() {
        // this.faceValue = 1;
        this.roll();
    }

    public Die(int faceValue) {
        this.faceValue = faceValue;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void roll() {
        faceValue = (int) (Math.random() * 6) + 1;
    }

    @Override
    public String toString() {
        return String.format("%d : %s", this.getFaceValue(), this.getColor());
    }

}
