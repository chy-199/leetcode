package Pointer.medium;
//统计有序矩阵中的负数
public class L1351 {
    public int countNegatives(int[][] grid) {
        int i=0;
        int j=grid[0].length-1;
        int ans=0;
        while (i<grid.length&&j>=0){
            while (j>=0&&grid[i][j]<0){
                j--;
                ans+=grid.length-i;
            }
            while (j>=0&& i<grid.length&&grid[i][j]>=0){
                i++;
            }
        }
        return ans;
    }
}
