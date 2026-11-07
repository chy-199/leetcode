package Pointer.easy;

import java.util.ArrayList;
import java.util.List;

//数组中的重复数据
public class L422 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                //该位置已被标记过，说明当前数字重复
                ans.add(index + 1);
            } else {
                //第一次出现，用负数标记对应位置
                nums[index] = -nums[index];
            }
        }

        return ans;
    }
}
