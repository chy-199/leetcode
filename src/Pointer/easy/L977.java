package Pointer.easy;
//有序数组的平方
public class L977 {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int[] arr=new int[nums.length];
        int i=nums.length-1;
        while (left<=right){
            int m=nums[left]*nums[left];
            int n=nums[right]*nums[right];
            if(m>=n){
                arr[i]=m;
                left++;
            }
            else {
                arr[i]=n;
                right--;
            }
            i--;
        }
        return arr;
    }
}
