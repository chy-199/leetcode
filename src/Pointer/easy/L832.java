package Pointer.easy;
//翻转图像
public class L832 {
    public int[][] flipAndInvertImage(int[][] image) {
        int i=0;
        for(i=0;i<image[0].length;i++){
            int left=0;
            int right=image.length-1;
            while (left<right){
                int temp=image[i][left];
                image[i][left]=image[i][right];
                image[i][right]=temp;
                left++;
                right--;
            }
            for(int j=0;j<image[0].length;j++){
                if(image[i][j]==0)image[i][j]=1;
                else image[i][j]=0;
            }
        }
        return image;
    }
}
