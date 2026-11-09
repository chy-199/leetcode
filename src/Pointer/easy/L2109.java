package Pointer.easy;
//向字符串添加空格
public class L2109 {
    public String addSpaces(String s, int[] spaces) {
        char[] ans=new char[s.length()+spaces.length];
        int i=ans.length-1;
        int c=s.length()-1;
        int j=spaces.length-1;
        for(i=ans.length-1;i>=0;i--){
            if(j>=0&&c==spaces[j]-1){
                ans[i]=' ';
                j--;
                continue;
            }
            ans[i]=s.charAt(c);
            c--;
        }
        return new String(ans);
    }
}
