package com.lucasantarella.chapter5.classwork;

public class Die {

    private int faceValue;

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

    public void roll() {
        faceValue = (int) (Math.random() * 6) + 1;
    }

    @Override
    public String toString() {
        return String.format("%d", this.getFaceValue());
    }

    public int compareTo(Die compared) {
        return Integer.compare(compared.getFaceValue(), this.getFaceValue());
    }

}
