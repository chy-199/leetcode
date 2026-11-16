package Pointer.medium;
//循环增长使字符串子序列等于另一个字符串
public class L2825 {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0;
        int j=0;
        while (j<str2.length()){
            if (str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            }
            else if((str1.charAt(i)=='z'&&str2.charAt(j)=='a')||(str1.charAt(i)+1)==str2.charAt(j)){
                i++;
                j++;
            }
            else {
                i++;
            }
            if(i==str1.length()&&j!=str2.length())return false;
        }
        return true;
    }
}
