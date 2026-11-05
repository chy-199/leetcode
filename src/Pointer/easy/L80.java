package Pointer.easy;
//删除有序数组中的重复项II
public class L80 {
    public int removeDuplicates(int[] nums) {
        int slow=0;
        int fast=0;
        int flag=0;
        int ans=0;
        for(fast=0;fast<nums.length;fast++){
            while (fast+1<nums.length&&nums[fast]==nums[fast+1]){
                flag++;
                fast++;
                continue;
            }
            if(flag>=1){
                fast--;
                flag=0;
            }
            nums[slow]=nums[fast];
            slow++;
            ans++;
        }
        return  ans;
    }
}
