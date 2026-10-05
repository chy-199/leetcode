package Windows.medium;
// 使库存平衡的最少丢弃次数
public class L3679 {
    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
          int i=0;
          int[] flag=new int[100001];
          int op=0;
          for(i=0;i<arrivals.length;i++){
              flag[arrivals[i]]++;
              if(flag[arrivals[i]]>m){
                  op++;
                  flag[arrivals[i]]--;
                  arrivals[i]=-1;
              }
              int left=i-w+1;
              if(left<0)continue;
              if(arrivals[left]!=-1)
              flag[arrivals[left]]--;
          }
          return op;
    }
}
