package Windows.easy;
//统计最大元素出现至少 K 次的子数组
public class L2962 {
    public long countSubarrays(int[] nums, int k) {
        long maxnum=0;
        for(int i=0;i<nums.length;i++){
            maxnum=Math.max(nums[i],maxnum);
        }
        int match=0;
        int left=0;
        int right=0;
        long ans=0;
        for(right=0;right<nums.length;right++){
            if(nums[right]==maxnum)match++;
            while (match>=k){
                if (nums[left]==maxnum)match--;
                left++;
            }
            ans=ans+left;
        }
        return ans;
    }
}
