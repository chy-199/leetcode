package leetcode.matrix;

public class L073SetZeroes {
    public void setZeroes(int[][] matrix){
        int firstrow=1;
        int firstcol=1;
        int i=0;
        int j=0;
        int l= matrix.length;
        int w=matrix[0].length;
        for(i=0;i<l;i++){
            if(matrix[i][0]==0)firstcol=0;
        }
        for(j=0;j<w;j++){
            if(matrix[0][j]==0)firstrow=0;
        }
        i=1;
        j=1;
        for(i=1;i<l;i++){
          for(j=1;j<w;j++){
              if(matrix[i][j]==0){
                  matrix[0][j]=0;
                  matrix[i][0]=0;
              }
          }
        }
        for(i=1;i<l;i++){
            if(matrix[i][0]==0){
                for(j=1;j<w;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(j=1;j<w;j++){
            if(matrix[0][j]==0){
                for(i=1;i<l;i++){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstrow==0){
            for(j=0;j<w;j++){
                matrix[0][j]=0;
            }
        }
        if(firstcol==0){
            for(i=0;i<l;i++){
                matrix[i][0]=0;
            }
        }
    }
}
