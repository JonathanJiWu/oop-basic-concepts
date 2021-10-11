package com.company;

public class Main {

    public static void main(String[] args) {
//        Person() here is the constructor, it's just a method that makes objects, self generated from the class Person because the same name.
//        I'm making a new person under a variable call person1
	Person person1 = new Person();
//    setting up the props of this person1 using setters in the class
    person1.setName("Luby Due");
    person1.setYearBorn(2000);
    person1.setHobby("boats!");
//    class method, with props just given above
    person1.selfIntro();

//    I'm using the constructor that I set up in the Person that can pass in props
//    And it only takes TWO lines, this is the reason, we use parameteriazed constructors even the class will generate one for us
        Person person2 = new Person("Kiki tuo", 1955, "Rockets");
        person2.selfIntro();
    }
}
