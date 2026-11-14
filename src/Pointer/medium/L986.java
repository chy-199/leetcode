package Pointer.medium;

import java.util.ArrayList;
import java.util.List;

//区间列表的交集
public class L986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while (i<firstList.length&&j<secondList.length){
            if(firstList[i][1]<secondList[j][0]){
                i++;
                continue;
            }
            else if(firstList[i][0]>secondList[j][1]){
                j++;
                continue;
            }
            int left=Math.max(firstList[i][0],secondList[j][0]);
            int right=Math.min(firstList[i][1],secondList[j][1]);
            int[] temp={left,right};
            ans.add(temp);
            if(firstList[i][1]<secondList[j][1]){
                i++;
            }
            else {
                j++;
            }
        }
        return ans.toArray(new int[0][]);
    }
}
