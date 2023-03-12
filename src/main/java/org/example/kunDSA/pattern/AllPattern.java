package org.example.kunDSA.pattern;

public class AllPattern {
    public static void main(String[] args) {
        pattern5(5);
    }
    public static void pattern28(int n){
        for (int row = 1; row<2*n; row++){
            int c = row<n? row : 2*n-row;
            for (int col = 1; col<= c;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for (int row = 1; row<2*n; row++){
            int c = row<n? row : 2*n-row;
            for (int col = 1; col<= c;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for (int row = 1; row<=n;row++){
            for (int col = 1; col<= row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int row = 1; row<=n;row++){
            for (int col = 1; col<= n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for (int row = 1; row<=n;row++){
            for (int col = 1; col<= row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
