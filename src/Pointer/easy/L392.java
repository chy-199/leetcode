package Pointer.easy;
//判断子序列
public class L392 {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        if (s.length()==0)return true;
        while (j<t.length()){
            if(s.charAt(i)!=t.charAt(j)){
                j++;
                continue;
            }
            j++;
            i++;
            if(i==s.length())return true;
        }
        return i==s.length();
    }
}
