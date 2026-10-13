package Windows.easy;
//统计「优美子数组」
public class L1248 {
    public int numberOfSubarrays(int[] nums, int k) {
            return solve(nums,k)-solve(nums,k+1);
    }
    public int solve(int[] nums,int k){
        int left=0;
        int right=0;
        int match=0;
        int ans=0;
        for(right=0;right<nums.length;right++){
            if(nums[right]%2==1)match++;
            while (match>=k){
                if (nums[left]%2==1){
                    match--;
                }
                left++;
            }
            ans=ans+left;
        }
        return ans;
    }
}
