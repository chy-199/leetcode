package Windows.easy;
//包含所有三种字符的子字符串数目
public class L1358 {
    public int numberOfSubstrings(String s) {
        int left=0;
        int right=0;
        int result=0;
        int a=0;
        int b=0;
        int c=0;
        for(right=0;right<s.length();right++){
            char temp=s.charAt(right);
            if(temp=='a')a++;
            if(temp=='b')b++;
            if(temp=='c')c++;
            while (a>0&&b>0&&c>0){
                temp=s.charAt(left);
                if(temp=='a')a--;
                if(temp=='b')b--;
                if(temp=='c')c--;
                left++;
            }
            result=result+left;
        }
        return result;
    }
}
