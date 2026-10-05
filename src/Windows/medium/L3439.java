package Windows.medium;
//重新安排会议得到最多空余时间 I
public class L3439 {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
          int i=0;
          int[] time=new int[startTime.length+1];
          time[0]=startTime[0];
          time[time.length-1]=eventTime-endTime[endTime.length-1];
          for(i=1;i<time.length-1;i++){
              time[i]=startTime[i]-endTime[i-1];
          }
          int sum=0;
          int max=0;
          for(i=0;i<time.length;i++){
              sum=sum+time[i];
              int left=i-k;
              if(left<0)continue;
              max=Math.max(max,sum);
              sum=sum-time[left];
          }
          return max;
    }
}
