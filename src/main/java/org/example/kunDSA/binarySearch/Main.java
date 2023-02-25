package org.example.kunDSA.binarySearch;

public class Main {
    public static void main(String[] args) {
        char[] letters = {'b','d','f','g','i','m','n'};
        char m = nextGreatestLetter(letters,'z');
        System.out.println("outout is " + m);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while (start<=end) {
            int middle = start + (end - start) / 2;
            if (letters[middle] > target) {
                end = middle - 1;
            } else{
                start = middle + 1;
            }
        }
        return letters[start % letters.length];
    }
    public static int binarySearchCeiling(int[] Arr, int element){
        int start = 0;
        int end = Arr.length-1;
        while (start<=end) {
            int middle = start + (end - start) / 2;
            if (Arr[middle] > element) {
                end = middle - 1;
            } else if (element > Arr[middle]){
                start = middle + 1;
            }else {
                return middle;
            }
        }
        return start;
    }

    public static int binarySearchFloor(int[] Arr, int element){
        int start = 0;
        int end = Arr.length-1;
        while (start<end) {
            int middle = start + (end - start) / 2;
            if (Arr[middle] > element) {
                end = middle - 1;
            } else if (element > Arr[middle]){
                start = middle + 1;
            }else {
                return middle;
            }
        }
        return end;
    }

    public static int binarySearch(int[] Arr, int element){
        int start = 0;
        int end = Arr.length-1;
        while (start<=end) {
            int middle = start + (end - start) / 2;
            if (Arr[middle] > element) {
                end = middle - 1;
            } else if (element > Arr[middle]){
                start = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }

}
