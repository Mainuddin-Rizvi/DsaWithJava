package org.example.kunDSA.oopsPackageStaticSingletonInbuiltmethods.Static;
//class Test{
//    String name;    you cant use static here
//
//    public Test(String name) {
//        this.name = name;
//    }
//}

public class Innerclasses {
    static class Test{  // here need static
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Mainuddin");
        Test b = new Test("Ahbab");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
