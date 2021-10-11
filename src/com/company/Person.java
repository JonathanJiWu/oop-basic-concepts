package com.company;
//class is the blueprint of objects
//And you use constructors to construct them
public class Person  {
//    Properties for the class, or DATA
//    these are called class variables
//    private(Access Modifier, along with public)
//    so it's more secure(only the object know what the name is)
    private String name;
    private int yearBorn;
    private String hobby;

    Person(){

    }
//    I'm making a constructor here, when I call it in the main it will no longer generate a default constructor but instead, it'll use this one
//    I can pass parameters into this constructor
    Person(String name, int yearBorn, String hobby){
//        setting the props from the parameter
        this.name =name;
        this.yearBorn =yearBorn;
        this.hobby =hobby;
    }
//getters and setters, generated for the class variables, use these to set and show the props of objects
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYearBorn() {
        return yearBorn;
    }
    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    //    method, what the class of objects can do, or call it functions
    public void selfIntro(){
        System.out.println("my name is "+this.name+", I was born in year "+yearBorn+", and my hobby is "+hobby+". ");
    }

}
