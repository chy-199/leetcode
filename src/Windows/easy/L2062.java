package Windows.easy;
//统计字符串中的元音子字符串
public class L2062 {
    public int countVowelSubstrings(String word) {
        int[] c=new int[5];
        int left=0;
        int right=0;
        int ans=0;
        int base=0;
        char[] s=word.toCharArray();
        for(right=0;right<s.length;right++){
            if(s[right]=='a')c[0]++;
            else if(s[right]=='e')c[1]++;
            else if(s[right]=='i')c[2]++;
            else if(s[right]=='o')c[3]++;
            else if(s[right]=='u')c[4]++;
            else {
                c[0]=0;
                c[1]=0;
                c[2]=0;
                c[3]=0;
                c[4]=0;
                left=right+1;
                base=right+1;
                continue;
            }
            while (c[0]>=1&&c[1]>=1&&c[2]>=1&&c[3]>=1&&c[4]>=1){
                if(s[left]=='a')c[0]--;
                else if(s[left]=='e')c[1]--;
                else if(s[left]=='i')c[2]--;
                else if(s[left]=='o')c[3]--;
                else if(s[left]=='u')c[4]--;
                else {
                }
                left++;
            }
            ans=left-base+ans;
        }
        return ans;
    }
}

