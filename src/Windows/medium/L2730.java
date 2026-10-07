package Windows.medium;
// 找到最长的半重复子字符串
public class L2730 {
    public int longestSemiRepetitiveSubstring(String s) {
        int match=0;
        int left=0;
        int right=0;
        int max=0;
        if(s.length()==1)return 1;
        for(right=1;right<s.length();right++){
            char temp=s.charAt(right);
            if(temp==s.charAt(right-1))match++;
            while (match>1){
                temp=s.charAt(left);
                if(temp==s.charAt(left+1))match--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
