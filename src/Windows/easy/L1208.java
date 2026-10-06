package Windows.easy;
//尽可能使字符串相等
public class L1208 {
    public int equalSubstring(String s, String t, int maxCost) {
      int[] cost=new int[s.length()];
      int i=0;
      for(i=0;i<t.length();i++){
          cost[i]=Math.abs((int)s.charAt(i)-(int)t.charAt(i));
      }
      int total=0;
      int max=0;
      int left=0;
      int right=0;
      for(right=0;right<s.length();right++){
          total=total+cost[right];
          while (total>maxCost){
              total=total-cost[left];
              left++;
          }
          max=Math.max(max,right-left+1);
      }
      return max;
    }
}
