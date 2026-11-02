package Pointer.easy;

import java.util.Arrays;

//数的平方等于两数乘积的方法数
public class L1577 {
    public int numTriplets(int[] nums1, int[] nums2) {
        int ans=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++){
            int left=0;
            int right=nums2.length-1;
            long target=(long)nums1[i]*nums1[i];
            while (left<right){
                long temp=(long)nums2[left]*nums2[right];
                if(temp<target)left++;
                else if(temp>target)right--;
                else {
                    int c1=1;
                    int c2=1;
                    while (left<right&&nums2[left]==nums2[left+1]){
                        left++;
                        c1++;
                    }
                    while (left<right&&nums2[right]==nums2[right-1]){
                        right--;
                        c2++;
                    }
                    if(left==right){
                        ans+=c1*(c1-1)/2;
                    }
                    else {
                        ans+=c1*c2;
                    }
                    left++;
                    right--;
                }
            }
        }
        for(int i=0;i<nums2.length;i++){
            int left=0;
            int right=nums1.length-1;
            long target=(long)nums2[i]*nums2[i];
            while (left<right){
                long temp=(long)nums1[left]*nums1[right];
                if(temp<target)left++;
                else if(temp>target)right--;
                else {
                    int c1=1;
                    int c2=1;
                    while (left<right&&nums1[left]==nums1[left+1]){
                        left++;
                        c1++;
                    }
                    while (left<right&&nums1[right]==nums1[right-1]){
                        right--;
                        c2++;
                    }
                   if(left==right){
                       ans+=c1*(c1-1)/2;
                   }
                   else {
                       ans+=c1*c2;
                   }
                    left++;
                    right--;
                }
            }
        }
        return ans;
    }
}
