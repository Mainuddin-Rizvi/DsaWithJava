package org.example.kunDSA.java8.functional;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = (String name)-> System.out.println(name);
        consumer.accept("mainuddin");
    }
}
