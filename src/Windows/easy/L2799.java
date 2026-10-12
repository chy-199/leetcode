package Windows.easy;
//统计完全子数组的数目
public class L2799 {
    public int countCompleteSubarrays(int[] nums) {
           int ans=0;
           int right=0;
           int left=0;
           int[] flag=new int[2001];
           int dif=0;
           int match=0;
           for(int i=0;i<nums.length;i++){
               flag[nums[i]]++;
               if(flag[nums[i]]==1)dif++;
           }
        for(int i=0;i<nums.length;i++){
            flag[nums[i]]=0;
        }
        for(right=0;right<nums.length;right++){
            flag[nums[right]]++;
            if(flag[nums[right]]==1)match++;
            while (match>=dif){
                if(flag[nums[left]]==1)match--;
                flag[nums[left]]--;
                left++;
            }
            ans =ans+left;
        }
           return ans;
    }
}
