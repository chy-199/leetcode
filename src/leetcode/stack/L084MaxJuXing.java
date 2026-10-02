package leetcode.stack;
import java.util.Deque;
import java.util.ArrayDeque;
public class L084MaxJuXing {
    public int largestRectangleArea(int[] heights) {
            int maxarea=0;
            Deque<Integer> stack=new ArrayDeque<>();
            int[] h=new int[heights.length+1];
            System.arraycopy(heights, 0, h, 0, heights.length);
            h[heights.length]=0;
            int i=0;
            for(i=0;i<h.length;i++){
                int width=0;
                int area=0;
                while (!stack.isEmpty()&&h[i]<stack.peek()){
                    width++;
                    int temp=stack.pop();
                    area=width*temp;
                    if(area>maxarea)maxarea=area;
                }
                while (width>0){
                    stack.push(h[i]);
                    width--;
                }
                stack.push(h[i]);
            }
            return maxarea;
    }
}
