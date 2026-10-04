package Windows.easy;

public class L643MaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        double max=-0;
        for(i=0;i<k;i++){
            max=max+nums[i];
        }
        double result=0;
        for(i=0;i<nums.length;i++){
            result=result+nums[i];
            int left=i-k+1;
            if(left<0){
                continue;
            }
            max=Math.max(result,max);
            result=result-nums[left];
        }
        return max/k;
    }
}
