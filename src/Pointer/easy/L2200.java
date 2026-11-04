package Pointer.easy;

import java.util.ArrayList;
import java.util.List;

// 找出数组中的所有 K 近邻下标
public class L2200 {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int i=0;
        int j=0;
        int right=0;
        List<Integer> ans=new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i]!=key)continue;
            j=Math.max(i-k,0);
            while (j<=Math.min(i+k,nums.length-1)){
                ans.add(j);
                j++;
            }
        }
        return ans;
    }
}
