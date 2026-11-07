package Pointer.easy;
//对数组执行操作
public class L2640 {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1])continue;
            nums[i]*=2;
            nums[i+1]=0;
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)continue;
            nums[j]=nums[i];
            j++;
        }
        while (j<nums.length){
            nums[j]=0;
            j++;
        }
        return nums;
    }
}
