package Windows.easy;

import java.util.Arrays;

//半径为 k 的子数组平均值
public class L2090 {
    public int[] getAverages(int[] nums, int k) {
        int[] result=new int[nums.length];
        int i=0;
        long total=0;
        int average=0;
        if (2 * k + 1 > nums.length) {
            for(i=0;i<nums.length;i++){
                result[i]=-1;
            }
            return result;
        }
        for(i=0;i<k;i++){
            result[i]=-1;
        }
        for(i=nums.length-k;i<nums.length;i++){
            result[i]=-1;
        }
        for(i=0;i<nums.length;i++){
            total=total+nums[i];
            int left=i-2*k;
            if(left<0)continue;
            average = (int)(total / (2*k+1));
            result[i-k]=average;
            total=total-nums[left];
        }
        return result;
    }
}
