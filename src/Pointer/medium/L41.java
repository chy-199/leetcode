package Pointer.medium;
//缺失的第一个正数
public class L41 {
    public int firstMissingPositive(int[] nums) {
       for(int i=0;i<nums.length;i++){
               while (nums[i]>0&&nums[i]-1<nums.length&&nums[i]!=i+1){
                   int index=nums[i]-1;
                   if(nums[index]==nums[i])break;
                   int temp=nums[index];
                   nums[index]=nums[i];
                   nums[i]=temp;
               }
       }
       for(int i=0;i< nums.length;i++){
           if(nums[i]!=i+1){
               return i+1;
           }
       }
       return nums.length;
    }
}
