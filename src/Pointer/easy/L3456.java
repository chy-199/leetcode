package Pointer.easy;
// 找出长度为 K 的特殊子字符串
public class L3456 {
    public boolean hasSpecialSubstring(String s, int k) {
        int i=0;
        while (i<s.length()){
            char c=s.charAt(i);
            int start=i;
            i++;
            while (i<s.length()&&s.charAt(i)==s.charAt(i-1)){
                i++;
            }
            int length=i-start;
            if(length==k){
                return true;
            }
        }
        return false;
    }
}
