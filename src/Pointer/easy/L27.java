package Pointer.easy;
//移除元素
public class L27 {
    public int removeElement(int[] nums, int val) {
        int fast=0;
        int slow=0;
        int ans=0;
        for(fast=0;fast<nums.length;fast++){
            if(nums[fast]==val){
                ans++;
                continue;
            }
            nums[slow]=nums[fast];
            slow++;
        }
        return nums.length-ans;
    }
}
