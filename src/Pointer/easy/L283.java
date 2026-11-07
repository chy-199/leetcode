package Pointer.easy;
//移动0
public class L283 {
    public void moveZeroes(int[] nums) {
        int stacksize=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[stacksize++]=nums[i];
            }
            if(i==nums.length-1){
                while (stacksize<nums.length) {
                    nums[stacksize++] = 0;
                }
            }
        }
    }
}
