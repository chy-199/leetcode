package Windows.easy;

public class L1456MaxYuanYinString {
    public int maxVowels(String s, int k) {
           char[] str=s.toCharArray();
           int i=0;
           int result=0;
           int max=0;
           for(i=0;i<s.length();i++){
               if(str[i]=='a'||str[i]=='e'||str[i]=='o'||str[i]=='u'||str[i]=='i')
                   result++;
               max=Math.max(max,result);
               if(max==k)return max;
               int left=i-k+1;
               if(left<0)continue;
               if(str[left]=='o'||str[left]=='a'||str[left]=='e'||str[left]=='i'||str[left]=='u')
                   result--;
           }
           return max;
    }
}
