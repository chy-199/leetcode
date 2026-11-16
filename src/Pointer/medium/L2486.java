package Pointer.medium;
//追加字符以获得子序列
public class L2486 {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        while (j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else {
                i++;
            }
            if(i==s.length())return t.length()-j;
        }
        return 0;
    }
}
