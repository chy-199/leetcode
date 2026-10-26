package Pointer.easy;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

//找到k个最接近的元素
public class L658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans=new ArrayList<>();
        int left=0;
        int right=arr.length-1;
        while (right-left+1>k){
            if(Math.abs(arr[left]-x)>Math.abs(arr[right]-x)){
                left++;
            }
            else {
                right--;
            }
        }
        for(int i=left;i<=right;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}
