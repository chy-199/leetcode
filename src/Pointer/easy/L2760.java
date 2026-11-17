package Pointer.easy;
//最长奇偶子数组
public class L2760 {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int i=0;
        int ans=0;
        while (i<nums.length){
            if(nums[i]>threshold||nums[i]%2!=0){
                i++;
                continue;
            }
            int l=i;
            i++;
            while (i<nums.length&&nums[i]%2!=nums[i-1]%2&&nums[i]<threshold){
                i++;
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}
