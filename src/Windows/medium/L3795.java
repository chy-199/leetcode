package Windows.medium;
//不同元素和至少为 K 的最短子数组长度
public class L3795 {
    public int minLength(int[] nums, int k) {
        int left=0;
        int right=0;
        int total=0;
        int ans=nums.length;
        int match=0;
        int[] flag=new int[1000000];
        for(right=0;right<nums.length;right++){
            if(flag[nums[right]]<1)
                total=total+nums[right];
            flag[nums[right]]++;
            while (total>=k){
                match=1;
                ans=Math.min(ans,right-left+1);
                if (flag[nums[left]]==1) {
                    total=total-nums[left];
                }
                flag[nums[left]]--;
                left++;
            }
        }
        if(match==0)return -1;
        return ans;
    }
}
