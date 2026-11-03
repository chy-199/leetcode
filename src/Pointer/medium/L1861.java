package Pointer.medium;
//旋转盒子
public class L1861 {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int i=0;
        int j=0;
        int rows=boxGrid.length;
        int cols=boxGrid[0].length;
        for(i=0;i<rows;i++){
            int fast;
            int slow=cols-1;
            for(fast=cols-1;fast>=0;fast--){
               if(boxGrid[i][fast]=='*'){
                   slow=fast-1;
               }
               else if(boxGrid[i][fast]=='#'){
                   if(slow!=fast) {
                       boxGrid[i][slow] = '#';
                       boxGrid[i][fast] = '.';
                   }
                   slow--;
               }
            }
        }
        return  reverseMatrix(boxGrid,rows,cols);
    }
    public static char[][] reverseMatrix(char[][] boxGrid,int rows,int cols){
        char[][] arr=new char[cols][rows];
        int i=0;
        int j=0;
        for(i=0;i<cols;i++){
            for(j=0;j<rows;j++){
                arr[i][j]=boxGrid[rows-j-1][i];
            }
        }
        return arr;
    }
}
