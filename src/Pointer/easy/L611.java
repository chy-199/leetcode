package Pointer.easy;

import java.util.Arrays;

//有序三角形的个数
public class L611 {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int third=nums.length-1;
        for(third=nums.length-1;third>=2;third--){
            int first=0;
            int second=third-1;
            while (first<second){
                if(nums[first]+nums[second]>nums[third]){
                    ans+=second-first;
                    second--;
                }
                else {
                    first++;
                }
            }
        }
        return ans;
    }
}
