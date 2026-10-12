package Windows.easy;
//和相同的二元子数组
public class L930 {
    public int numSubarraysWithSum(int[] nums, int goal) {
           return solve(nums,goal-1)-solve(nums,goal);
    }
    public int solve(int[] nums,int goal){
           int result=0;
           int ans=0;
           int left=0;
           int right=0;
           for(right=0;right<nums.length;right++){
               result=result+nums[right];
               while (result>goal&&left<=right){
                   result=result-nums[left];
                   left++;
               }
               ans=ans+left;
           }
           return ans;
    }
}
