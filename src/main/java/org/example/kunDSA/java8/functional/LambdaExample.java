package org.example.kunDSA.java8.functional;

interface Shape{
    void draw(); // by default abstract keyword is add implicitly
}
public class LambdaExample {

    public static void main(String[] args) {
        Shape square = () -> System.out.println("square"); //lambda implements functional interface
        square.draw();

        Shape circle = () -> System.out.println("circle");
        circle.draw();

        Shape rectangle = () -> System.out.println("rectangle");
        rectangle.draw();

        print(rectangle);
    }

    public static void print(Shape shape){
        shape.draw();
    }


}
