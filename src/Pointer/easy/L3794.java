package Pointer.easy;

import java.util.Arrays;

//反转字符串前缀
public class L3794 {
    public String reversePrefix(String s, int k) {
        if(k>s.length())return s;
        int i=0;
        int j=k-1;
        char[] arr=s.toCharArray();
        for(i=0;i<j;i++){
            char c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
            j--;
        }
        return new String(arr);
    }
}
