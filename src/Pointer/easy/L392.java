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
    //查询多个s时，进阶写法;
    public boolean isSubsequencePlus(String s,String t){
        int[][] next=new int[t.length()+1][26];
        for(int j=0;j<26;j++){
            next[t.length()][j]=-1;
        }
        int i=t.length()-1;
        int j=0;
        for(;i>=0;i--){
            for(j=0;j<26;j++){
                next[i][j]=next[i+1][j];
            }
            next[i][t.charAt(i)-'a']=i;
        }
        int pos=0;
        i=0;
        while (i<s.length()){
            int result=next[pos][s.charAt(i)-'a'];
            i++;
            if(result==-1)return false;
            pos=result+1;
        }
        return true;
    }
}
