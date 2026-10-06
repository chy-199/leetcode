package hot100.stack;
import java.util.Deque;
import java.util.ArrayDeque;
public class L739DailyTemperature {
    public int[] DailyTemperature(int[] temperature){
        Deque<Integer> stack=new ArrayDeque<>();
        int[] result=new int[temperature.length];
        int i=0;
        for(i=0;i<temperature.length-1;i++){
            if(temperature[i]<temperature[i+1]){
                result[i]=1;
                while(!stack.isEmpty()&&temperature[i+1]>temperature[stack.peek()]){
                    result[stack.peek()]=i+1-stack.peek();
                    stack.pop();
                }
            }
            else {
                stack.push(i);
            }
        }
        while (!stack.isEmpty()){
            result[stack.pop()]=0;
        }
        result[temperature.length-1]=0;
        return result;
    }
}
