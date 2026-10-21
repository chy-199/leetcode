package Pointer.easy;
//反转字符串中的元音字母
public class L345 {
    public String reverseVowels(String s) {
         int left=0;
         int right=s.length()-1;
         char[] arr=s.toCharArray();
         while (left<right){
             if(isVowel(arr[left])&&isVowel(arr[right])){
                 char temp=arr[left];
                 arr[left]=arr[right];
                 arr[right]=temp;
                 left++;
                 right--;
             }
             else if(isVowel(arr[left])==true&&isVowel(arr[right])!=true){
                 right--;
             }
             else if(isVowel(arr[left])!=true&&isVowel(arr[right])==true){
                 left++;
             }
             else {
                 left++;
                 right--;
             }
         }
         return new String(arr);
    }
    public boolean isVowel(char c){
        return (c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U');
    }
}
