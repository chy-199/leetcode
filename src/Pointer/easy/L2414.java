package Pointer.easy;
//最长的字母序连续子字符串的长度
public class L2414 {
    public int longestContinuousSubstring(String s) {
        int i=0;
        int ans=0;
        while (i<s.length()){
            int start=i;
            i++;
            while (i<s.length()&& s.charAt(i)==(s.charAt(i-1)+1)){
                i++;
            }
            ans=Math.max(ans,i-start);
        }
        return ans;
    }
}
