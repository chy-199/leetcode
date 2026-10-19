package Pointer.easy;
//反转单词前缀
public class L2000 {
    public String reversePrefix(String word, char ch) {
        char[] string=word.toCharArray();
        int i=0;
        int flag=0;
        for(i=0;i<string.length;i++){
            if(string[i]==ch){
                flag=1;
                break;
            }
        }
        int left=0;
        int right=i;
        if(flag==0)return word;
        while (left<right){
            char temp=string[left];
            string[left]=string[right];
            string[right]=temp;
            left++;
            right--;
        }
        return new String(string);
    }
}
