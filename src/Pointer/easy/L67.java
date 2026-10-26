package Pointer.easy;
//两数之和II
public class L67 {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int[] result=new int[2];
        while (left<right){
            if(numbers[left]+numbers[right]==target){
                result[0]=left+1;
                result[1]=right+1;
                break;
            }
            else if(numbers[left]+numbers[right]<target){
                left++;
            }
            else {
                right--;
            }
        }
        return result;
    }
}
