package com.example.android.myapplication;

public class Student {
    String studentName;
    int studentAge;
    int studentGrade;
    int studentImage;

    public Student(String studentName, int studentAge, int studentGrade, int studentImage) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
        this.studentImage = studentImage;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public void setStudentImage(int studentImage) {
        this.studentImage = studentImage;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public int getStudentImage() {
        return studentImage;
    }
}
