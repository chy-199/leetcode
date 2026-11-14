package Pointer.medium;
import java.util.List;
//通过删除字母匹配匹配到字典里面的最长单词
public class L524 {
    public String findLongestWord(String s, List<String> dictionary) {
        int[][] next=new int[s.length()+1][26];
        for(int j=0;j<26;j++){
            next[s.length()][j]=-1;
        }
        int i=s.length()-1;
        int j=0;
        for(;i>=0;i--){
            for(j=0;j<26;j++){
                next[i][j]=next[i+1][j];
            }
            next[i][s.charAt(i)-'a']=i;
        }
        j=0;
        int maxl=0;
        int maxindex=-1;
        while (j<dictionary.size()) {
            int pos=0;
            i=0;
            String t=dictionary.get(j);
            int ok=1;
            if(t.length()<maxl){
                j++;
                continue;
            }
            while (i<t.length()){
                int result=next[pos][t.charAt(i)-'a'];
                i++;
                if(result==-1){
                    ok=0;
                    break;
                }
                pos=result+1;
            }
            if(ok==1){
                if(t.length()>maxl||(t.length()==maxl&&t.compareTo(dictionary.get(maxindex))<0)){
                    maxindex=j;
                    maxl=t.length();
                }
            }
            j++;
        }
        if(maxindex==-1)return "";
        return dictionary.get(maxindex);
    }
}
