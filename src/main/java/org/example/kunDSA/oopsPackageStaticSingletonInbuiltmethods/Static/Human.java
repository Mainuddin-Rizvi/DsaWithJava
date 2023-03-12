package org.example.kunDSA.oopsPackageStaticSingletonInbuiltmethods.Static;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1; // you can use this; but convention is to use className
    }
    public Human() {

    }
}


