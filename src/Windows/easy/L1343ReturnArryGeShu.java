package Windows.easy;

public class L1343ReturnArryGeShu {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int result=0;
        double total=0;
        double average=0;
        int i=0;
        for(i=0;i<arr.length;i++){
            total=total+arr[i];
            int left=i-k+1;
            if(left<0)continue;
            average=total/k;
            if(average>=threshold)result++;
            total=total-arr[left];
        }
        return result;
    }
}
