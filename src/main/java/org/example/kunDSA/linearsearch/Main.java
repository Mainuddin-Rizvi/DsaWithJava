package org.example.kunDSA.linearsearch;

//Linear search  Time complexity
// Best case = O(1)
// Worst Case = O(N)

import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        String str = "Mainuddin";
        System.out.println(searchString2(str,'u'));


//        int[] arr = {23,1,3,32,7};
//        linearSearch(arr,32);
    }


    // SEARCH the array
    public static int linearSearch(int arr[],int element){
        if (arr.length == 0)
            return -1;
        for (int i=0;i<arr.length;i++){
            if (element == arr[i]){
                System.out.println("index is "+i);
                return 1;
            }
        }

        return -1;
    }

    public static boolean searchString(String str, char target){
        if (str.length() == 0)
            return false;
        for (int i = 0;i<str.length();i++){
            if (target == str.charAt(i)) {
                System.out.println("char at position " + i);
                return true;
            }
        }
        return false;
    }

    public static boolean searchString2(String str,char target){

        for(char ch: str.toCharArray()){
            if (ch == target)
                return true;
        }

        return false;

    }
}
