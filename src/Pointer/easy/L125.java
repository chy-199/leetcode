package Pointer.easy;
//验证回文串
public class L125 {
    public boolean isPalindrome(String s) {
        char[] arr=new char[s.length()];
        int i=0;
        int l=0;
        for(i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if((temp<65&&temp>57)||(temp>90&&temp<97)||temp>122||temp<48)continue;
            if(temp>=65&&temp<=90)temp=(char)(temp+32);
            arr[l]=temp;
            l++;
        }
        for(i=0;i<l/2;i++){
            if(arr[i]!=arr[l-i-1])return false;
        }
        return true;
    }
}
