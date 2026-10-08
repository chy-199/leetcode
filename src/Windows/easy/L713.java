package Windows.easy;
//乘积小于 K 的子数组
public class L713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;
        int right=0;
        int total=1;
        int result=0;
        if(k<=1)return 0;
        for(right=0;right<nums.length;right++){
            total=total*nums[right];
            while (total>=k){
                total=total/nums[left];
                left++;
            }
            result=result+right-left+1;
        }
        return result;
    }
}
