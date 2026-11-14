package Windows.easy;

public class L3467 {
    //将数组按照奇偶性转化
    public int[] transformArray(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while (left<right){
            if(nums[left]%2==0){
                nums[left++]=0;
            }
            else {
                nums[left]=nums[right];
                nums[right--]=1;
            }
        }
        return nums;
    }
}
