package Pointer.easy;

import java.util.Arrays;
import java.util.List;

// 统计和小于目标的下标对数目
public class L2824 {
    public int countPairs(List<Integer> nums, int target) {
        int result=0;
        int left=0;
        int right=nums.size()-1;
        int[] arr=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            arr[i]=nums.get(i);
        }
        Arrays.sort(arr);
        while (left<right){
            if(arr[left]+arr[right]<target){
                result=result+right-left;
                left++;
            }
            else right--;
        }
        return result;
    }
}
