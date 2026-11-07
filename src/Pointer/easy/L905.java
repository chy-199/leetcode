package Pointer.easy;
//按奇偶排序数组
public class L905 {
    public int[] sortArrayByParity(int[] nums) {
        int[] result=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                result[left++]=nums[i];
            }
            else {
                result[right--]=nums[i];
            }
        }
        return result;
    }
}
