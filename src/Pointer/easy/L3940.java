package Pointer.easy;
//限制有序数组中的元素出现次数
public class L3940 {
    public int[] limitOccurrences(int[] nums, int k) {
        int slow=0;
        int fast=0;
        int flag=0;
        int ans=0;
        if(k>=nums.length)return nums;
        for(fast=0;fast<nums.length;fast++){
            while (fast+1<nums.length&&nums[fast]==nums[fast+1]){
                flag++;
                fast++;
            }
            if(flag>=k-1){
                int temp=fast;
                fast=fast-k+1;
                flag=0;
                while (fast<=temp){
                    nums[slow]=nums[fast];
                    slow++;
                    fast++;
                    ans++;
                }
                fast--;
            }
            else {
                int start=fast-flag;
                flag=0;
               while (start<=fast){
                   nums[slow]=nums[start];
                   slow++;
                   start++;
                   ans++;
               }
            }
        }
        int[] result=new int[ans];
        for(int i=0;i<ans;i++){
            result[i]=nums[i];
        }
        return result;
    }
}
//for (fast = 0; fast < n; fast++) {
//int start = fast;
//    while (fast + 1 < n && nums[fast] == nums[fast + 1]) fast++;
//int c = Math.min(fast - start + 1, k);   // 留几个
//int from = fast - c + 1;                 // 从这组的倒数第 c 个开始
//    while (from <= fast) { nums[slow++] = nums[from++]; ans++; }
//        }
