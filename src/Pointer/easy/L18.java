package Pointer.easy;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

//四数之和
public class L18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        int j=0;
        for(i=0;i<nums.length-3;i++){
            while (i>0&&i<nums.length-3&&nums[i]==nums[i-1])i++;
            for(j=i+1;j<nums.length-2;j++){
                while (j>i+1&&j<nums.length-2&&nums[j]==nums[j-1])j++;
                int left=j+1;
                int right=nums.length-1;
                while (left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer> row=new ArrayList<>();
                        row.add(nums[i]);
                        row.add(nums[j]);
                        row.add(nums[left]);
                        row.add(nums[right]);
                        ans.add(row);
                        while (left<right&&nums[left]==nums[left+1])left++;
                        while (left<right&&nums[right]==nums[right-1])right--;
                        left++;
                        right--;
                    }
                    else if(sum>target){
                        right--;
                    }
                    else {
                        left++;
                    }
                }
            }
        }
        return ans;
    }
}
