package package1;
import java.util.*;


//Sol155
public class MinStack {
    Stack<Integer> s;
    Stack<Integer> sm;
    

    /** initialize your data structure here. */
    public MinStack() {
        s = new Stack<Integer>();
        sm = new Stack<Integer>();
        sm.push(Integer.MAX_VALUE);
        
    }
    
    public void push(int x) {
        if(sm.peek() > x){
            sm.push(x);
        }
        else{
            sm.push(sm.peek());
        }
        s.push(x);
        
    }
    
    public void pop() {
        s.pop();
        sm.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return sm.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */