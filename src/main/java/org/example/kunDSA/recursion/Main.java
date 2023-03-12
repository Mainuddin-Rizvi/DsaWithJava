package org.example.kunDSA.recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    public static int fibonacci(int n){
        //base
        if (n<2) {
            return n;
        }
        //body
        //recursive call
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static  void print(int n){
        //break base condition
        if (n==0){
            return;
        }
        System.out.println(n);
        print(n-1);

    }
}
//recursion : calling duntion itself again and again

