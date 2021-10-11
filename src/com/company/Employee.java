package com.company;

public class Employee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
//    overriding the selfIntro method in Person
    public void selfIntro(){
        System.out.println("employee, your name is "+super.name+", you were born in year "+super.yearBorn+", your hobby is "+super.hobby+". And your salary is "+salary+".");
    }
}
