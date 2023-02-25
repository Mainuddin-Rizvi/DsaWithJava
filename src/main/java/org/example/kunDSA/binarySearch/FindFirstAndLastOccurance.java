package org.example.kunDSA.binarySearch;

import java.util.Arrays;
import java.util.logging.SocketHandler;

public class FindFirstAndLastOccurance {
    public static void main(String[] args) {

        int[] arr = {2,4,8,90,219};
        int[] answer = searchRange(arr,7);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] searchRange(int[] nums, int target) {
        //by default answer
        int[] ans =  {-1,-1};

        // first occurance
        int start = search(nums,target,true);
        // last occurance
        int end = search(nums,target, false);

        ans[0] =  start;
        ans[1] = end;
        return ans;

    }

    public static int search(int[] nums,int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            //find middle
            int middle = start + (end - start) / 2;

            //
            if (target < nums[middle]) {
                end = middle - 1;
            } else if(target > nums[middle]){
                start = middle + 1;
            }else{
                // potential answer found
                ans = middle;
                if (findStartIndex){
                    end = middle - 1;
                }else{
                    start = middle + 1;
                }
            }
        }
        return ans;
    }
}
