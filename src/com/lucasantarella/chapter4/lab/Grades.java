package com.lucasantarella.chapter4.lab;

public class Grades {

    public static void main(String[] args) {
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");

        System.out.println("Input grades for Student 1:");
        student1.inputGrades();
        System.out.printf("%s's Avg: %.2f\n", student1.getStudentName(), student1.getAverage());

        System.out.println("Input grades for Student 2:");
        student2.inputGrades();
        System.out.printf("%s's Avg: %.2f\n", student1.getStudentName(), student2.getAverage());

        System.out.println();
        System.out.println(student1);
        System.out.println(student2);
    }

}
