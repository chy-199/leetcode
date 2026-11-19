package Pointer.easy;
//连续字符
public class L1446 {
    public int maxPower(String s) {
        int i=0;
        int ans=0;
        while (i<s.length()){
            char c=s.charAt(i);
            int start=i;
            while (i<s.length()&&s.charAt(i)==c){
                i++;
            }
            ans=Math.max(ans,i-start);
        }
        return ans;
    }
}
