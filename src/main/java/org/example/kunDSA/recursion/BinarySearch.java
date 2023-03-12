package org.example.kunDSA.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,78,98,890};
        int s = BS(arr,6,0,arr.length);
        System.out.println(s);
    }
    public static int BS(int[] arr,int target,int s,int e){
//        base
        if (s>e){
            return -1;
        }
//        body
        int m = s+(e-s)/2;
        if (arr[m]==target){
            return m;
        }
        if (target<arr[m]){
            return BS(arr,target,s,m-1);
        }
        if (target>arr[m]){
            s=m+1;
        }
        return BS(arr,target,m+1,e);
//        recursive call
    }
}
