package Pointer.easy;

import java.util.Arrays;

//两个数组的间距值
public class L1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        int result=0;
        for(i=0;i<arr1.length;i++){
            while (j<arr2.length&&arr1[i]>=arr2[j]){
                j++;
            }
            boolean ok=true;
            if(j<arr2.length&&arr2[j]-arr1[i]<=d)ok=false;
            if(j>0&&arr1[i]-arr2[j-1]<=d)ok=false;
            if(ok)result++;
        }
        return result;
    }
}
