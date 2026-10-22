package Pointer.easy;
//字典序最小回文串
public class L2697 {
    public String makeSmallestPalindrome(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        int count=0;
        while (left<right){
            if(arr[left]!=arr[right]){
                if(arr[left]>arr[right]){
                    arr[left]=arr[right];
                }
                else {
                    arr[right]=arr[left];
                }
                count++;
            }
            left++;
            right--;
        }
        return  new String(arr);
    }
}
