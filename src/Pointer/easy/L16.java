package Pointer.easy;

import java.util.Arrays;

//最接近的三数之和
class L16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best = nums[0] + nums[1] + nums[2];
        for (int first = 0; first < nums.length - 2; first++) {
            int second = first + 1;
            int third = nums.length - 1;
            while (second < third) {
                int sum = nums[first] + nums[second] + nums[third];
                if (sum == target) return sum;
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum < target) {
                    second++;
                } else {
                    third--;
                }
            }
        }
        return best;
    }
}

