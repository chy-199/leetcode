package Pointer.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//合并两个二维数组
public class L2570 {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i=0;
        int j=0;
        int p=0;
        int length=0;
        int[][] ans=new int[nums1.length+nums2.length][2];
        for(p=0;i<nums1.length&&j<nums2.length;p++){
            if(nums1[i][0]<nums2[j][0]){
                ans[p][0]=nums1[i][0];
                ans[p][1]=nums1[i][1];
                i++;
            }
           else if(nums1[i][0]==nums2[j][0]){
                ans[p][0]=nums1[i][0];
                ans[p][1]=nums1[i][1]+nums2[j][1];
                i++;
                j++;
            }
           else {
               ans[p][0]=nums2[j][0];
               ans[p][1]=nums2[j][1];
               j++;
            }
           length++;
        }
        while (i==nums1.length&&j<nums2.length){
            ans[p][0]=nums2[j][0];
            ans[p][1]=nums2[j][1];
            j++;
            length++;
            p++;
        }
        while (j==nums2.length&&i<nums1.length){
            ans[p][0]=nums1[i][0];
            ans[p][1]=nums1[i][1];
            i++;
            length++;
            p++;
        }
        return Arrays.copyOf(ans,length);
    }
}
