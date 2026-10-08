package Windows.medium;
//最短且字典序最小的美丽子字符串
public class L2904 {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        int right=0;
        int ans=s.length();
        int match=0;
        for(right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(c=='1')match++;
            while (match>=k){
                ans=Math.min(right-left+1,ans);
                if(s.charAt(left)=='1')match--;
                left++;
            }
        }
        left=0;
        String temp;
        String min =null;
        match=0;
        for(right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(c=='1')match++;
            while (match>=k){
                if(right-left+1==ans){
                    temp=s.substring(left,right+1);
                    if(min==null||temp.compareTo(min)<0)min=temp;
                }
                if(s.charAt(left)=='1')match--;
                left++;
            }
        }
        if (min==null)return "";
        return min;
    }
}
