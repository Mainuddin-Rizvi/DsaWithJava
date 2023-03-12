package org.example.kunDSA.recursion;

public class Nto1 {
    public static void main(String[] args) {
        int ans = countZero(1040002);
        System.out.println(ans);
    }

    public static void palindrome(int n){
        if (n==0){
            return;
        }
        sum = 10*sum+(n%10) ;
        revNum(n/10);
        if (sum == n){
            System.out.println("its palindrome");
        }
    }
    public static int count;
    public static int countZero(int n){

        if (n==0){
            return 0;
        }
        if (n%10==0){
            count++;
        }
        countZero(n/10);
        return count;
    }
    static int sum =0;
    public static void revNum(int n){
        if (n == 0){
            return;
        }
        sum = 10*sum+(n%10) ;
        revNum(n/10);
    }
    public static int proOfDigit(int n){
        if (n%10==n){
            return n;
        }
        return (n%10)*proOfDigit(n/10);
    }
    public static int sumOfDigit(int n){
        if (n==0){
            return n;
        }
        return (n%10)+sumOfDigit(n/10);
    }
    public static void Nt1(int n){
        if (n==0){
            return;
        }
        Nt1(n-1);
        System.out.println(n);
    }
    public static int fact(int n){
        if (n==1){
            return 1;
        }
        return n*fact(n-1);
    }

}
