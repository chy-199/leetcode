package Windows.easy;

import java.util.Random;

//使数组平衡的最少移除数目
public class L3634 {
    //快速排序
    public void qsort(int[] nums){
        if (nums == null || nums.length <= 1) return;
        int left=0;
        int right=nums.length-1;
        int[] stack=new int[nums.length*2];
        int top=-1;
        Random r=new Random();
        stack[++top]=left;
        stack[++top]=right;
        while (top>=0){
            right=stack[top--];
            left=stack[top--];
            int index=left+r.nextInt(right-left+1);
            int pivot=nums[index];
            int temp=nums[left];
            nums[left]=pivot;
            nums[index]=temp;
            int i=left;
            int j=right;
            while (i<j) {
                while (i < j && nums[j] >= pivot) j--;
                nums[i] = nums[j];
                while (i < j && nums[i] <= pivot) i++;
                nums[j] = nums[i];
            }
            nums[i]=pivot;
            if(left<i){
                stack[++top]=left;
                stack[++top]=i-1;
            }
            if(right>i){
                stack[++top]=i+1;
                stack[++top]=right;
            }
        }
    }
    public int minRemoval(int[] nums, int k) {
        qsort(nums);
        int right=nums.length-1;
        int left=nums.length-1;
        int result=0;
        for(left=nums.length-1;left>=0;left--){
           while (nums[right]*1.0/nums[left]>k){
               right--;
           }
           result=Math.max(result,right-left+1);
        }
        return nums.length-result;
    }
}
