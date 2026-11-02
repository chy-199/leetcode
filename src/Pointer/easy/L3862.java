package Pointer.easy;
//找出最小平衡下标
public class L3862 {
    public int smallestBalancedIndex(int[] nums) {
        long[] sum=new long[nums.length];
        long[] prod=new long[nums.length];
        sum[0]=(long)nums[0];
        prod[nums.length-1]=(long)nums[nums.length-1];
        int left=0;
        int right=nums.length-1;
        for(left=1;left<nums.length;left++){
            sum[left]=sum[left-1]+(long)nums[left];
        }
        for(right=nums.length-2;right>=0;right--){
            if(prod[right+1]<sum[nums.length-1]/nums[right])
            prod[right]=prod[right+1]*(long)nums[right];
            else {
                prod[right]=sum[nums.length-1]+1;
            }
        }
        if(nums.length>=2&& prod[1]==0)return 0;
        for(int i=1;i<nums.length-1;i++){
            if(sum[i-1]==prod[i+1])return i;
        }
        if(nums.length>=2&& prod[1]==0)return 0;
        return -1;
    }
}
