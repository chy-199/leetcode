package Pointer.easy;
//比较含退格的字符串
public class L844 {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        while (i>=0||j>=0){
            int c=0;
            while (i>=0){
                if(s.charAt(i)=='#'){
                    i--;
                    c++;
                }
                else if(c>0){
                    i--;
                    c--;
                }else {
                    break;
                }
            }
            c=0;
            while (j>=0){
                if(t.charAt(j)=='#'){
                    j--;
                    c++;
                }
                else if(c>0){
                    j--;
                    c--;
                }
                else {
                    break;
                }
            }
            if(i<0||j<0)return i<0&&j<0;
            if(i>=0&&j>=0&&s.charAt(i)!=t.charAt(j))return false;
            i--;
            j--;
        }
        return true;
    }
}
