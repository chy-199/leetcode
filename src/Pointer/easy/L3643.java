package Pointer.easy;
//垂直反转子矩阵
public class L3643 {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int left=x;
        int right=x+k-1;
        while (left<right){
            for(int i=y;i<y+k;i++){
                int temp=grid[left][i];
                grid[left][i]=grid[right][i];
                grid[right][i]=temp;
            }
            left++;
            right--;
        }
        return grid;
    }
}
