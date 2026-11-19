package Pointer.easy;
//最大连续1的个数
public class L485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int i=0;
        while (i<nums.length){
            if(nums[i]!=1){
                i++;
                continue;
            }
            int start=i;
            while (i<nums.length&&nums[i]==1){
                i++;
            }
            ans=Math.max(ans,i-start);
        }
        return ans;
    }
}
