package Pointer.easy;
//哪种连续子字符串最长
public class L1869 {
    public boolean checkZeroOnes(String s) {
        boolean ans;
        int i=0;
        int max1=0;
        int max0=0;
        while (i<s.length()){
            char c=s.charAt(i);
            int start=i;
            while (i<s.length()&& s.charAt(i)==c){
                i++;
            }
            if(c=='1'){
                max1=Math.max(max1,i-start);
            }
            else {
                max0=Math.max(max0,i-start);
            }
        }
        if(max1>max0)return true;
        else return false;
    }
}
