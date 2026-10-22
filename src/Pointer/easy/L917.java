package Pointer.easy;

import java.lang.classfile.attribute.NestHostAttribute;

//仅仅反转字母
public class L917 {
    public String reverseOnlyLetters(String s) {
        int left=0;
        int right=s.length()-1;
        char[] arr=s.toCharArray();
        while (left<right){
            if(isLetter(arr[left])&&isLetter(arr[right])){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if(isLetter(arr[left])==true&&isLetter(arr[right])==false){
                right--;
            }
            else if(isLetter(arr[left])==false&&isLetter(arr[right])==true){
                left++;
            }
            else {
                left++;
                right--;
            }
        }
        return new String(arr);
    }
    public boolean isLetter(char c){
        return (c>='a'&&c<='z')||(c>='A'&&c<='Z');
    }
}
