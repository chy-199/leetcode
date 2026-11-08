package Pointer.easy;
//重新排列数组
public class L1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int x=0;
        int y=n;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[x++];
            i++;
            ans[i]=nums[y++];
        }
        return  ans;
    }
}
