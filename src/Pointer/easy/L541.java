package Pointer.easy;
//反转字符串II
public class L541 {
    public String reverseStr(String s, int k) {
        int match=0;//偶数反转，奇数不反转；
        char[] arr=s.toCharArray();
        int n=s.length()/k;
        int l=0;
        int r=l+k-1;
       for(match=0;match<n;match++){
           l=match*k;
           r=l+k-1;
           int  left=l;
           int  right=r;
           if(match%2==1)continue;
           while (left<right){
               char temp=arr[left];
               arr[left]=arr[right];
               arr[right]=temp;
               left++;
               right--;
           }
       }
       if(arr.length%k!=0&&n%2==0) {
           int left = n * k;
           int right = arr.length - 1;
           while (left < right) {
               char temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;
               left++;
               right--;
           }
       }
        return  new String(arr);
    }
}
