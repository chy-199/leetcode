package Pointer.easy;

import java.util.Arrays;

//至多 K 个不同元素的最大和
public class L3684 {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int[] result=new int[k];
        int ans=0;
        for(int i=nums.length-1;ans<k&&i>=0;i--){
            while (i-1>=0&&nums[i]==nums[i-1]){
                i--;
            }
            result[ans++]=nums[i];
        }
        return Arrays.copyOf(result, ans);

    }
}
