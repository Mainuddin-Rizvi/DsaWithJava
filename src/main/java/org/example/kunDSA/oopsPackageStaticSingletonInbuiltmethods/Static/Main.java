package org.example.kunDSA.oopsPackageStaticSingletonInbuiltmethods.Static;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22,"kunal",100000,false);
        Human rahul = new Human(23,"rahul",200000,true);

        System.out.println(rahul.population);
    }
}
// static is based of class
// independent of object
// properties that are common throught out all object
//instead of his use class name
// in static function you cant use non static data because it  depend on object but u can use reverse
