package Pointer.easy;
//等差三元组的数目
public class L2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int a=0;
        int b=0;
        int c=0;
        int ans=0;
        while (a<nums.length-2){
            int target1=nums[a]+diff;
            int target2=nums[a]+2*diff;
            b=a+1;
            c=a+2;
            while (c<nums.length&&nums[c]<target2){
                c++;
            }
            while (b<nums.length&&nums[b]<target1){
                b++;
            }
            if(c<nums.length&&b<nums.length&&nums[c]==target2&&nums[b]==target1)ans++;
            a++;
        }
        return ans;
    }
}
