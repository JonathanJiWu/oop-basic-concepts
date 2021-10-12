package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
////        Person() here is the constructor, it's just a method that makes objects, self generated from the class Person because the same name.
////        I'm making a new person under a variable call person1
//	Person person1 = new Person();
////    setting up the props of this person1 using setters in the class
//    person1.setName("Luby Due");
//    person1.setYearBorn(2000);
//    person1.setHobby("boats!");
////    class method, with props just given above
//    person1.selfIntro();
//
////    I'm using the constructor that I set up in the Person that can pass in props
////    And it only takes TWO lines, this is the reason, we use parameteriazed constructors even the class will generate one for us
//        Person person2 = new Person("Kiki tuo", 1955, "Rockets");
//        person2.selfIntro();
        Scanner scan = new Scanner(System.in);
//        let user setup a employee
        Employee employee1 = new Employee();
        System.out.println("Hi, employee No.1, Please enter your name: ");
        String employeeNameInput = scan.nextLine();

        System.out.println("Please enter your year of birth: ");
        int employeeYearBornInput = Integer.parseInt(scan.nextLine());


        System.out.println("Please enter your hobby: ");
        String employeeHobbyInput = scan.nextLine();


        System.out.println("Please enter your salary: ");
        double employeeSalaryInput = Integer.parseInt(scan.nextLine());

        employee1.setName(employeeNameInput);
        employee1.setYearBorn(employeeYearBornInput);
        employee1.setHobby(employeeHobbyInput);
        employee1.setSalary(employeeSalaryInput);
        employee1.selfIntro();

//        let user setup a 
        Student student1 = new Student();
        System.out.println("Next.");
        System.out.println("Hi, Student No.1, Please enter your name: ");
        String person1TestNameInput = scan.nextLine();

        System.out.println("Please enter your year of birth: ");
        int person1TestYearBornInput = Integer.parseInt(scan.nextLine());


        System.out.println("Please enter your hobby: ");
        String person1TestHobbyInput = scan.nextLine();


        System.out.println("Please enter your GPA: ");
        double person1TestGPAInput = scan.nextDouble();

        student1.setName(person1TestNameInput);
        student1.setYearBorn(person1TestYearBornInput);
        student1.setHobby(person1TestHobbyInput);
        student1.setGPA(person1TestGPAInput);
        student1.selfIntro();

//        calling the calculate from interface
        System.out.println("calculate result: ");
        Person personInterface = new Person();
        personInterface.calculate();

    }
}
