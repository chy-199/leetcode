package Pointer.medium;

import java.util.Arrays;

//找出与数组相加的整数 II
public class L3132 {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int n=2;n>0;n--){
            int x=nums2[0]-nums1[n];
            int i=0;
            int j=0;
            while (i<nums1.length&&j<nums2.length){
                if(nums1[i]+x==nums2[j]){
                    i++;
                    j++;
                }
                else {
                    i++;
                }
            }
            if(j==nums2.length)return x;
        }
        return nums2[0]-nums1[0];
    }
}
