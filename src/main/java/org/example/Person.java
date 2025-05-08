package org.example;

public class Person{
    String firstName;
    String lastName;
    int age;
    boolean hasHair;
    String carModel;
    int carYear;
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(int carYear, String carModel, boolean hasHair, int age,
                  String lastName, String firstName) {
        this(firstName, lastName, age);
        this.carYear = carYear;
        this.carModel = carModel;
        this.hasHair = hasHair;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        if(age <= 19 && age >= 13){
            return true;
        }else{
            return false;
        }
    }
}
