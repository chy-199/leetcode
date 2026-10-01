package leetcode.stack;
import java.util.Deque;
import java.util.ArrayDeque;
public class L155MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minstack;
    public L155MinStack(){
       stack=new ArrayDeque<>();
       minstack=new ArrayDeque<>();
    }
    public void push(int value) {
       stack.push(value);
       if(minstack.isEmpty()||value<=minstack.peek()){
           minstack.push(value);
       }
    }

    public void pop() {
        int i=stack.pop();
        if(i==minstack.peek()){
            minstack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.pop();
    }
}
