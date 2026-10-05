package Windows.easy;
//可获得的最大点数
public class L1423 {
    public int maxScore(int[] cardPoints, int k) {
         int min=0;
         int total=0;
         int sum=0;
         int i=0;
         for (i=0;i<cardPoints.length;i++){
             sum=sum+cardPoints[i];
         }
         min=sum;
         if (k == cardPoints.length) return sum;
         for(i=0;i<cardPoints.length;i++){
             total=total+cardPoints[i];
             int left=i-(cardPoints.length-k)+1;
             if(left<0)continue;
             min=Math.min(min,total);
             total=total-cardPoints[left];
         }
         return sum-min;
    }
}
