package Pointer.medium;

import java.util.Arrays;

//三数之和的多种可能
public class L923 {
    public int threeSumMulti(int[] arr, int target) {
        long ans=0;
        int first=0;
        Arrays.sort(arr);
        for(first=0;first<arr.length-2;first++){
            int second=first+1;
            int third=arr.length-1;
            while (second<third){
                if(arr[first]+arr[second]+arr[third]==target){
                    int c1=1;
                    int c2=1;
                    while (second<third&&arr[second]==arr[second+1]){
                        second++;
                        c1++;
                    }
                    while (second<third&&arr[third]==arr[third-1]){
                        third--;
                        c2++;
                    }
                    if(arr[second]==arr[third]){
                        ans+=c1*(c1-1)/2;
                    }
                    else {
                        ans+=c1*c2;
                    }
                    second++;
                    third--;
                }
                else if(arr[first]+arr[second]+arr[third]<target){
                    second++;
                }
                else {
                    third--;
                }
            }
        }
        ans=ans%(1000000000+7);
        return (int)ans;
    }
}
