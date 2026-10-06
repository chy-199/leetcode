package Windows.easy;
//每个字符最多出现两次的最长子字符串
public class L3090 {
    public int maximumLengthSubstring(String s) {
         int left=0;
         int right=0;
         char[] arr=s.toCharArray();
         int max=0;
         int[] flag=new int[26];
         for(right=0;right<arr.length;right++){
             char temp=arr[right];
             int index=temp-'a';
             flag[index]++;
             while (flag[index]>2){
                 flag[arr[left]-'a']--;
                 left++;
             }
             max=Math.max(max,right-left+1);
         }
         return max;
    }
}
