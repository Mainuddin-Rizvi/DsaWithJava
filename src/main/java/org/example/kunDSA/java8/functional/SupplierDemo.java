package org.example.kunDSA.java8.functional;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = ()-> LocalDateTime.now();
        System.out.println(supplier.get());
    }
}