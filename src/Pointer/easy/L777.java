package Pointer.easy;

import java.util.Locale;

//在LR字符串中交换相邻字符
public class L777 {
    public boolean canTransform(String start, String result) {
        int i=0;
        int j=0;
        char[] arr1=start.toCharArray();
        char[] arr2=result.toCharArray();
        while (i<start.length()||j<start.length()){
            while (i<arr1.length&&arr1[i]=='X'){
                i++;
            }
            while (j<arr2.length&&arr2[j]=='X'){
                j++;
            }
            if(i==start.length()||j==result.length())return i==start.length()&&j==result.length();
            if(arr1[i]!=arr2[j])return false;
            if(arr1[i]=='L'&&i<j)return false;
            if(arr1[i]=='R'&&i>j)return false;
            i++;
            j++;
        }
        return true;
    }
}
