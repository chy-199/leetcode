package Pointer.easy;
//将 0 移到末尾的最少交换次数
public class L3936 {
    public int minimumSwaps(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int count=0;
        while (left<right){
            while (left<right&&nums[right]==0)right--;
            if(left==right)break;
            if (nums[left]==0){
                nums[left]=nums[right];
                nums[right]=0;
                right--;
                count++;
            }
            left++;
        }
        return  count;
    }
}
