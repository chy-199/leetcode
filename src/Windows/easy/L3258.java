package Windows.easy;
// 统计满足 K 约束的子字符串数量 I
public class L3258 {
    public int countKConstraintSubstrings(String s, int k) {
           int left=0;
           int right=0;
           int result=0;
           int one=0;
           int zero=0;
           for(right=0;right<s.length();right++){
               if(s.charAt(right)=='0')zero++;
               else one++;
               while (one>k&&zero>k){
                   if(s.charAt(left)=='0')zero--;
                   else one--;
                   left++;
               }
               result=result+right-left+1;
           }
           return result;
    }
}
