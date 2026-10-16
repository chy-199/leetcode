package Pointer.easy;
//反转字符串
public class L344 {
    public void reverseString(char[] s) {
        int i=0;
        for(i=0;i<s.length/2;i++){
            char temp=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=temp;
        }
    }
}
