package org.example.kunDSA.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,3,8,9,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int max = 0;
            for(int j=0;j<=arr.length-i-1;j++){
                if (arr[max] < arr[j]){
                    max = j;
                }
            }
            swap(arr,max,arr.length-i-1);
        }
    }
    public static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
