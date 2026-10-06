package hot100.matrix;
import java.util.List;
import java.util.ArrayList;
public class L054LuoXuan {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        while(left<=right&&top<=bottom){
            //向右走
            int i=left;
            for(i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            //向下走
            int j=top;
            for(j=top;j<=bottom;j++){
                result.add(matrix[j][right]);
            }
            right--;
            //向左走
            if(top<=bottom){
            int m=right;
            for(m=right;m>=left;m--){
                result.add(matrix[bottom][m]);
            }
            bottom--;
            }
            //向上走
            if(left<=right){
            int n=bottom;
            for(n=bottom;n>=top;n--){
                result.add(matrix[n][left]);
            }
            left++;
        }
        }
        return  result;
    }
}
