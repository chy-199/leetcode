package Pointer.easy;
//反转元音数相同的单词
public class L3775 {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int flag=0;
        while (i<s.length()&&arr[i]!=' '){
            if(isVowel(arr[i]))flag++;
            i++;
        }
        int match=0;
        for(i=i+1;i<arr.length;i++){
            match=0;
            int left=i;
            while (i<arr.length&&arr[i]!=' '){
                if(isVowel(arr[i]))match++;
                i++;
            }
            int right=i-1;
            if(match==flag){
                reverse(arr,left,right);
            }
        }
        return new String(arr);
    }
    public void reverse(char[] nums,int left,int right){
        int i=left;
        int j=right;
        while (i<j){
            char temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public boolean isVowel(char c){
        return (c=='a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='o')||(c=='O')||(c=='u')||(c=='U');
    }
}
