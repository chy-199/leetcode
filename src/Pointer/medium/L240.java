package Pointer.medium;
//搜索二维矩阵
public class L240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[i].length-1;
        while (j>=0&&i<matrix.length) {
            if(matrix[i][j]==target)return true;
            while (j > 0 && matrix[i][j] > target) {
                j--;
            }
            while (j>=0&& i < matrix.length && matrix[i][j] < target) {
                i++;
            }
        }
        return false;
    }
}
