package com.lucasantarella.chapter4.lab;


import java.util.Scanner;

public class Student {

    private String mStudentName;

    private int mScore1;
    private int mScore2;


    /**
     * @param studentName Name of the student
     */
    public Student(String studentName) {
        this.mStudentName = studentName;
    }

    public void inputGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Score on Test 1: ");
        this.mScore1 = scanner.nextInt();

        System.out.print("Score on Test 2: ");
        this.mScore2 = scanner.nextInt();

        System.out.println("Done inputting grades.");
    }

    /**
     * @return Student Average
     */
    public double getAverage() {
        return (double) (mScore1 + mScore2) / 2;
    }

    /**
     * @return Returns the Student's name
     */
    public String getStudentName() {
        return mStudentName;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\tTest1: %d\tTest2: %d", this.getStudentName(), this.mScore1, this.mScore2);
    }

}