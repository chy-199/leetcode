package Windows.medium;
//最长特殊序列
public class L522 {
    public int findLUSlength(String[] strs) {
        int maxl=-1;
        for(int n=0;n<strs.length;n++){
            String s=strs[n];
            int flag=0;
            for(int i=0;i<strs.length;i++){
                if(flag>1)break;
                if(isSame(s,strs[i])){
                    flag++;
                }
            }
            if(flag==1){
                maxl=Math.max(maxl,s.length());
            }
        }
        return maxl;
    }
    //判断s是否是t的子序列
    public boolean isSame(String s,String t){
        int i=0;
        int j=0;
        while (i<s.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else {
                j++;
            }
            if(j==t.length())return i==s.length();
        }
        return true;
    }
}
