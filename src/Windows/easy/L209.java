package Windows.easy;
//长度最小的子数组
public class L209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int ans=nums.length;
        int total=0;
        for(right=0;right<nums.length;right++){
            total=total+nums[right];
        }
        if(total<target)return 0;
        total=0;
        for(right=0;right<nums.length;right++){
            total=total+nums[right];
            while (total>=target){
                ans=Math.min(ans,right-left+1);
                total=total-nums[left];
                left++;
            }
        }
        return ans;
    }
}
