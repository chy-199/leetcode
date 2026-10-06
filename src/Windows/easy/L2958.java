package Windows.easy;
//最多 K 个重复元素的最长子数组
public class L2958 {
    public int maxSubarrayLength(int[] nums, int k) {
        int[] flag=new int[100000];
        int left=0;
        int right=0;
        int max=0;
        for(right=0;right<nums.length;right++){
            flag[nums[right]]++;
            while (flag[nums[right]]>k){
                flag[nums[left]]--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
