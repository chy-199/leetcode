package Windows.easy;
//删除子数组的最大得分
public class L1695 {
    public int maximumUniqueSubarray(int[] nums) {
        int[] flag=new int[10000];
        int left=0;
        int right=0;
        int max=0;
        int total=0;
        for(right=0;right<nums.length;right++){
            total=total+nums[right];
            flag[nums[right]]++;
            while (flag[nums[right]]>1){
                flag[nums[left]]--;
                total=total-nums[left];
                left++;
            }
            max=Math.max(max,total);
        }
        return max;
    }
}
