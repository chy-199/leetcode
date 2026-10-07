package Windows.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//数组的最大美丽值
public class L2779 {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int lmax=nums[0]-k;
        int rmin=nums[0]+k;
        int left=0;
        int right=0;
        int ans=0;
        for(right=0;right<nums.length;right++){
            lmax=nums[right]-k;
            while(lmax>rmin){
              left++;
              rmin=nums[left]+k;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
