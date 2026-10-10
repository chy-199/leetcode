package Windows.easy;
//字符至少出现 K 次的子字符串 I
public class L3325 {
    public int numberOfSubstrings(String s, int k) {
        char[] string=s.toCharArray();
        int[] flag=new int[26];
        int ans=0;
        int right=0;
        int left=0;
        for(right=0;right<string.length;right++){
            int temp=string[right]-'a';
            flag[temp]++;
            while (flag[temp]>=k){
                flag[(int)(string[left]-'a')]--;
                left++;
            }
            ans=ans+left;
        }
        return ans;
    }
}
