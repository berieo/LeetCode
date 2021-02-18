import java.util.Stack;

public class MinStack {
    /** initialize your data structure here. */
    static Stack<Integer> A = new Stack<Integer>();
    static Stack<Integer> B = new Stack<Integer>();

    public MinStack() {

    }

    public static void push(int x) {
        A.push(x);
        if(B.empty() ||  x <= B.peek())
            B.push(x);
    }

    public static void pop() {
        if(A.pop().equals(B.peek()))
            B.pop();
    }

    public static int top() {
        return A.peek();
    }

    public static int min() {
        return B.peek();
    }

    public static void main(String[] args){
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(4);
        minStack.push(1);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
    }
}
