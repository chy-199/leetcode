package Pointer.easy;

import java.util.Arrays;

//按奇偶排序数组II
public class L922 {
    public int[] sortArrayByParityII(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while (left<=nums.length-1&&right>=0){
            if(nums[left]%2==1&&nums[right]%2==0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left+=2;
                right-=2;
            }
            else if(nums[left]%2==0&&nums[right]%2==1){
                left+=2;
                right-=2;
            }
            else if(nums[left]%2==0&&nums[right]%2==0){
                left+=2;
            }
            else {
                right-=2;
            }
        }
        int[] result=nums;
        return result;
    }
}
