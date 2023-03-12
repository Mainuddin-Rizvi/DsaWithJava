package org.example.kunDSA.recursion;

import java.util.ArrayList;

public class ArrayRec {
    public static void main(String[] args) {
        int[] arr ={5,6,7,8,9,1,2,3};
        int index = rotatedArrayBS(arr,1,0,arr.length-1);
        System.out.println(index);

    }
    static int rotatedArrayBS(int[] arr,int target,int s,int e){
        if (s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if (arr[m] == target){
            return m;
        }
        if (arr[s]<=arr[m]){
            if(arr[s]<=target && target<=arr[m]) {
                return rotatedArrayBS(arr,target,s,m-1);
            }else{
                return rotatedArrayBS(arr,target,m+1,e);
            }
        }
        if (target>=arr[m] && target<=arr[e]){
            return rotatedArrayBS(arr,target,m+1,e);
        }
        return rotatedArrayBS(arr,target,s,m-1);

    }
    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length-1){
            return list;
        }
        if (target == arr[index]){
            list.add(index);
        }
        ArrayList<Integer> answerFromBelowFunc = findAllIndex(arr,target,index+1);
        list.addAll(answerFromBelowFunc);
        return list;
    }
    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length-1){
            return list;
        }
        if (target == arr[index]){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }

    public static int findIndexLast(int[] arr,int target,int index){
        if (index == -1){
            return -1;
        }
        if (target == arr[index]){
            return index;
        }else{
            return findIndexLast(arr,target,index - 1);
        }
    }

    public static int findIndex(int[] arr,int target,int index){
        if (index == arr.length){
            return -1;
        }
        if (target == arr[index]){
            return index;
        }else{
            return findIndex(arr,target,++index);
        }
    }
    public static boolean search(int[] arr,int target,int i){
        if (arr.length-1 == i){
            return false;
        }
        return arr[i]==target || search(arr,target,++i);
    }

    public static boolean sorted(int[] arr,int i){
        if (arr.length-1 == i){
            return true;
        }
        if (arr[i]<arr[++i]){
            return sorted(arr,i);
        }else{
            return false;
        }

//        return arr[i]<arr[++i] && sorted(arr,i);
    }
}
