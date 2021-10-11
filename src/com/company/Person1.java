package com.company;

import java.util.Scanner;

public class Person1 {
    private boolean hasPet;

    public boolean isHasPet() {
        return hasPet;
    }

    public void setHasPet(boolean hasPet) {
        this.hasPet = hasPet;
    }
    Scanner scan = new Scanner(System.in);
    void testEncapsulation(){
        person1Test person1Test1 = new person1Test();
        System.out.println("Next.");
        System.out.println("Hi, person1Test No.1, Please enter your name: ");
        String person1TestNameInput = scan.nextLine();

        System.out.println("Please enter your year of birth: ");
        int person1TestYearBornInput = Integer.parseInt(scan.nextLine());


        System.out.println("Please enter your hobby: ");
        String person1TestHobbyInput = scan.nextLine();


        System.out.println("Please enter your GPA: ");
        double person1TestGPAInput = scan.nextDouble();

        person1Test1.setName(person1TestNameInput);
        person1Test1.setYearBorn(person1TestYearBornInput);
        person1Test1.setHobby(person1TestHobbyInput);
        person1Test1.setGPA(person1TestGPAInput);
        person1Test1.selfIntro();
    }
}
