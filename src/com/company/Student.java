package com.company;

public class Student extends Person{
    private double GPA;

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    //    overriding the selfIntro method in Person
    public void selfIntro(){
        System.out.println("Student, your name is "+super.name+", you were born in year "+super.yearBorn+", your hobby is "+super.hobby+". And your GPA is "+GPA+".");
}}
