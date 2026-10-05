package Windows.easy;
//长度为 K 子数组中的最大和
public class L2461 {
    public long maximumSubarraySum(int[] nums, int k) {
           int i=0;
           long[] flag=new long[100001];
           int match=0;
           long sum=0;
           long max=0;
           for(i=0;i<nums.length;i++){
               flag[nums[i]]++;
               if(flag[nums[i]]==1){
                   match++;
               }
               int left=i-k+1;
               sum=sum+nums[i];
               if(left<0)continue;
               if(match==k){
               max=Math.max(max,sum);
               }
               if(flag[nums[left]]==1)match--;
               sum=sum-nums[left];
               flag[nums[left]]--;
           }
           return max;
    }
}
