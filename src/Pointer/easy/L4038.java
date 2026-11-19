package Pointer.easy;

import java.util.HashMap;
import java.util.HashSet;

//计算单个区间中出现的整数数量
public class L4038 {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Integer> flag=new HashMap<>();
        int i=0;
        int ans=0;
        while (i<nums.length){
            int target=nums[i];
            if(flag.containsKey(target)){
                int temp=flag.get(target);
                temp=temp+1;
                flag.put(target,temp);
                if(temp<=2){
                    ans--;
                }
            }
            else {
                flag.put(target,1);
                ans++;
            }
            while (i<nums.length&&nums[i]==target){
                i++;
            }
        }
        return ans;
    }
}
