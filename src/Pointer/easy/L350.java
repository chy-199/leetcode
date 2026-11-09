package Pointer.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//两个数组的交集
public class L350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            int[] temp=nums1;
            nums1=nums2;
            nums2=temp;
        }
        Map<Integer,Integer> res=new HashMap<>();
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            Integer temp=res.get(nums1[i]);
            if(temp==null){
                res.put(nums1[i],1);
            }
            else {
                temp=temp+1;
                res.put(nums1[i],temp);
            }
        }
        int count=0;
        for(int i=0;i<nums2.length;i++){
            Integer temp=res.get(nums2[i]);
            if(temp==null||temp==0)continue;
            ans[count]=nums2[i];
            temp=temp-1;
            res.put(nums2[i],temp);
            count++;
        }
        return Arrays.copyOf(ans,count);
    }
}
