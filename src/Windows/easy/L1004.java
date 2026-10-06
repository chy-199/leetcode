package Windows.easy;
//最大连续1的个数 III
//和1493. 删掉一个元素以后全为 1 的最长子数组一模一样
public class L1004 {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int ans=0;
        int match=0;
        for(right=0;right<nums.length;right++){
            if(nums[right]==0)match++;
            while (match>1){
                if(nums[left]==0)match--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
