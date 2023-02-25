package org.example.kunDSA.binarySearch;

public class InfiniteNumbers {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,11,12,33,34,45,57,67,87,98,100};
        System.out.println(ans(arr,4));

    }
    public static  int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start =  temp;

        }
        return binarysearch(arr,target,start,end);
    }

    public static int binarysearch(int[] arr,int target,int start,int end){
        while (start<=end) {
            int middle = start + (end - start) / 2;
            if (target < arr[middle]) {
                end = middle - 1;
            } else if(arr[middle] < target){
                start = middle + 1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
