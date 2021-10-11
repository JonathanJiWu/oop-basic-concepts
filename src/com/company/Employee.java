package com.company;

import java.util.Scanner;

public class Employee extends Person{
    Scanner scan = new Scanner(System.in);
    public void employeeInput() {
        System.out.println("Please enter Employee's name: ");
        String employeeNameInput = scan.nextLine();
        System.out.println("Please enter Employee's salary: ");
        String employeeSalaryInput = scan.nextLine();
    }
}
