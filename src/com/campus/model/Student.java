package com.campus.model;

import java.util.Arrays;

public class Student {

    // Encapsulation - data hiding
    // Instance variables
    private int studentId;
    private String studentName;
    private int age;
    private String department;
    private int[] marks;

    // Static variable
    static int studentCount = 0;

    // Default constructor
    public Student() {
        studentCount++;
    }

    // Parameterized constructor
    public Student(int studentId, String studentName, int age,
                   String department, int[] marks) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.department = department;
        this.marks = marks;

        studentCount++;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int[] getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // Instance method - belongs to object
    public void displayStudentInfo() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }

    // Method overloading
    public void displayStudentInfo(boolean showMarks) {

        displayStudentInfo();

        if (showMarks) {
            System.out.println("Marks: " + Arrays.toString(marks));
        }
    }

    // Static method - belongs to class
    public static void displayStudentCount() {

        System.out.println("Total number of students: " + studentCount);
    }
}