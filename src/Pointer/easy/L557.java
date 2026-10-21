package Pointer.easy;
//反转字符串中的单词III
public class L557 {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++){
            int left=i;
            while (i<s.length()&&arr[i]!=' '){
                i++;
            }
            int right=i;
            reverse(arr,left,right-1);
        }
        return new String(arr);
    }
    public void reverse(char[] arr,int left,int right){
        int i=left;
        int j=right;
        while (i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
