package Windows.easy;
//无重复字符的最长子串
public class L003 {
    public int lengthOfLongestSubstring(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=0;
        int ans=0;
        int max=0;
        int[] flag=new int[128];
        for(right=0;right<arr.length;right++){
            flag[arr[right]]++;
            while (flag[arr[right]]>1){
                flag[arr[left]]--;
                left++;
            }
            ans=right-left+1;
            max=Math.max(max,ans);
        }
        return max;
    }
}
