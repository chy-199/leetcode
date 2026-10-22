package Pointer.easy;
// 删除字符串两端相同字符后的最短长度
public class L1750 {
    public int minimumLength(String s) {
        int left=0;
        int right=s.length()-1;
        int count=0;
        while (left<right&&s.charAt(left)==s.charAt(right)){
            while (left<right&&s.charAt(left)==s.charAt(left+1)){
                left++;
                count++;
            }
            while (left<right&&s.charAt(right)==s.charAt(right-1)){
                right--;
                count++;
            }
            left++;
            right--;
            count+=2;
        }
        if(s.length()-count<0)return 0;
        return s.length()-count;
    }
}
