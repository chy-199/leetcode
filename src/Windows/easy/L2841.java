package Windows.easy;

import java.util.List;

//几乎唯一子数组的最大和
public class L2841 {
    public long maxSum(List<Integer> nums, int m, int k) {
        long sum=0;
        long max=0;
        int match=0;
        long[] flag=new long[1000000000];
        int i=0;
        for(i=0;i<nums.size();i++){
            int temp=nums.get(i);
            if(flag[temp]==0)match++;
            flag[temp]++;
            sum=sum+temp;
            int left=i-k+1;
            if(left<0)continue;
            if(match>=m){
                max=Math.max(max,sum);
            }
            sum=sum-nums.get(left);
            if(flag[nums.get(left)]==1){
                match--;
            }
            flag[nums.get(left)]--;
        }
        return max;
    }
}
