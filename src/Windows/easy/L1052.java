package Windows.easy;
//爱生气的书店老板
public class L1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
           int max=0;
           int i=0;
           int sum=0;
           for(i=0;i<customers.length;i++){
               if(grumpy[i]==0)
                   sum=sum+customers[i];
           }
           for(i=0;i<customers.length;i++){
               if(grumpy[i]==1)sum=sum+customers[i];
               int left=i-minutes+1;
               if(left<0)continue;
               max=Math.max(max,sum);
               if(grumpy[left]==1)sum=sum-customers[left];
           }
           return  max;
    }
}
