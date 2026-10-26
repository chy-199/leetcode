package Pointer.easy;

import java.util.Arrays;

//数组中的k个最强值
public class L1471 {
    public int[] getStrongest(int[] arr, int k) {
        int left=0;
        int right=arr.length-1;
        Arrays.sort(arr);
        int m=arr[right/2];
        int count=0;
        int[] ans=new int[k];
        while (count<k){
            if(Math.abs(arr[left]-m)>Math.abs(arr[right]-m)){
                ans[count++]=arr[left];
                left++;
            }
            else {
                ans[count++]=arr[right];
                right--;
            }
        }

        return ans;
    }
}
