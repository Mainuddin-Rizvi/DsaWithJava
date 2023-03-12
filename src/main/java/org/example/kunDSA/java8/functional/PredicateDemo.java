package org.example.kunDSA.java8.functional;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (integer)-> integer>0;
        System.out.println(predicate.test(10));
    }
}
