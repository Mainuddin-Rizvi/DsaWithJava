package org.example.kunDSA.oopsfinalconstrutorfinalize;

class Student {
    int rollno;
    String name;
    int marks;

    //constructor calling another constructor
    //if you want to set default value use that
    // this replace by class name i.e Student not replace by reference variable  i.e default1
    public Student() {
        this(7,"Ahbab",78);
    }

    public Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

//        final int name; //not possible
        final int num = 10;
//        num = 20; //not possible

//        final Student s = new Student();
//        s = new Student();  // s reference not work but data can be change inside student

        // for parameterized
        Student mainuddin = new Student(1, "mainuddin", 98);
        Student shoaib = new Student(2, "mohd shoaib", 78);


        //for constructor calling constructor
        Student default1 = new Student();


        Student one = new Student();
        Student two = one;

        }
}

// to STring provide mixture @ + hascode
// default is more like protected

