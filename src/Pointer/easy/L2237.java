package Pointer.easy;
//移动片段得到字符串
public class L2237 {
    public boolean canChange(String start, String target) {
        int s=0;
        int t=0;
        while (s<start.length()||t<target.length()){
            while (s<start.length()&& start.charAt(s)=='_'){
                s++;
            }
            while (t<target.length()&& target.charAt(t)=='_'){
                t++;
            }
            if(s==start.length()||t==target.length())return s==start.length()&&t==target.length();
            if(start.charAt(s)!=target.charAt(t)){
                return false;
            }
            if(start.charAt(s)=='L'&&s<t)return false;
            if(start.charAt(s)=='R'&&s>t)return false;
            s++;
            t++;
        }
        return true;
    }
}
