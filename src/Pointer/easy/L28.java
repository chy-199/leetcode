package Pointer.easy;

import java.util.Arrays;

//采购方案
public class L28 {
    public int purchasePlans(int[] nums, int target) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        long result=0;
        while (left<right){
            if(nums[left]+nums[right]<=target){
                result=result+right-left;
                left++;
            }
            else right--;
        }
        return (int)(result%(1000000007));
    }
}

