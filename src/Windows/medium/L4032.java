package Windows.medium;
//至多 K 个不同质因数集合的最长子数组
public class L4032 {
    public int longestSubarray(int[] nums, int k) {
        int[] queue=new int[100000];
        int[] flag=new int[100000];
        int front=0;
        int rear=0;
        int left=0;
        int right=0;
        int ans=0;
        int match=0;
        for(right=0;right<nums.length;right++){
            for(int i=2;i*i<=nums[right];i+=2){
                if(nums[right]%i==0){
                    if(flag[i]==0) {
                        match++;
                        queue[rear++]=i;
                    }
                    if(flag[nums[right]/i]==0) {
                        queue[rear++]=nums[right]/i;
                        match++;
                    }
                    flag[i]++;
                    flag[queue[rear-1]]++;
                }
            }
            while (match>k){
                for(int i=2;i*i<=nums[left];i+=2){
                    if(nums[left]%i==0){
                        if(flag[i]==1) {
                            match--;
                            queue[front++]=0;
                        }
                        if(flag[nums[right]/i]==1) {
                            queue[front++]=0;
                            match--;
                        }
                        flag[i]--;
                        flag[nums[right]/i]--;
                    }
                }
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
