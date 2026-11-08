package Pointer.easy;

import java.util.ArrayList;
import java.util.List;

//找到数组中所有消失的数字
public class L448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           int index1=i;
           while (index1!=nums[index1]-1){
               int index2=nums[index1]-1;
               int temp=nums[index2];
               if(temp==nums[index1])break;
               nums[index2]=nums[index1];
               nums[index1]=temp;
           }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
