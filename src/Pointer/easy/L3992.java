package Pointer.easy;
//重新排列字符串以避免字符对
public class L3992 {
    public String rearrangeString(String s, char x, char y) {
        int slow=0;
        int fast=0;
        char[] arr=s.toCharArray();
        for(fast=0;fast<arr.length;fast++){
            if(arr[fast]!=y)continue;
            char temp=arr[fast];
            arr[fast]=arr[slow];
            arr[slow]=temp;
            slow++;
        }
        return  new String(arr);
    }
}
