package Windows.easy;
//得到 K 个黑块的最少涂色次数
public class L2379 {
    public int minimumRecolors(String blocks, int k) {
         char[] arr=new char[blocks.length()];
         arr=blocks.toCharArray();
         int i=0;
         int max=0;
         int black=0;
         int op=0;
         for(i=0;i<arr.length;i++){
             if(arr[i]=='B')black++;
             int left=i-k+1;
             if(left<0)continue;
             max=Math.max(max,black);
             if(arr[left]=='B')black--;
         }
         op=k-max;
         return op;
    }
}
