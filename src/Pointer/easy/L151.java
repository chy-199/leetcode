package Pointer.easy;
//反转字符串中的单词
public class L151 {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        reverse(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            int left=i;
            while (i<arr.length&&arr[i]!=' '){
                i++;
            }
            int right=i-1;
            reverse(arr,left,right);
        }
        int slow=0;
        int fast=0;
        int l=0;
        //跳过开头空格
        while (arr[fast]==' '){
            fast++;
        }
        while (fast<arr.length-1){
            while (fast<arr.length-1&&(arr[fast]==' '&&arr[fast+1]==' ')){
                fast++;
            }
            arr[slow]=arr[fast];
            slow++;
            fast++;
            l++;
        }
        //补最后一个元素
        if(fast<arr.length){
            arr[slow]=arr[fast];
            l++;
        }
        //跳末尾空格
        while (arr[l-1]==' ')l--;
       return new String(arr,0,l);
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
