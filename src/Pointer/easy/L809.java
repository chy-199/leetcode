package Pointer.easy;
//情感丰富的文字
public class L809 {
    public int expressiveWords(String s, String[] words) {
        int ans=0;
        for(int n=0;n<words.length;n++){
            String word=words[n];
            int j=0;
            int i=0;
            int ok=1;
            int count=0;
            int m=0;
            while (j<s.length()){
                if(i<word.length()&&word.charAt(i)==s.charAt(j)){
                    i++;
                    j++;
                    count=0;
                }
                else if(i>0&&s.charAt(j)==s.charAt(j-1)){
                    j++;
                    count++;
                }
                else {
                    ok=0;
                    break;
                }
                m++;
               if(j==s.length()|| s.charAt(j)!=s.charAt(j-1)){
                   if(m<3&&count>0){
                       ok=0;
                       break;
                   }
                   m=0;
                   count=0;
               }
            }
            if(i<word.length())ok=0;
            if(ok==1)ans++;
        }
        return ans;
    }
}
