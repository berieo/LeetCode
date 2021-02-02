import java.util.Stack;

public class CQueue {

    Stack<Integer> append = new Stack<Integer>();
    Stack<Integer> delete = new Stack<Integer>();

    public CQueue() {

    }

    public void appendTail(int value) {
        append.push(value);
    }

    public int deleteHead() {
        //两个栈都空，返回-1
        if ( delete.empty() && append.empty() ){
            return -1;
        }
        //delete栈不空，delete栈pop
        else if ( !delete.empty() ){
            return delete.pop();
        }
        //delete栈空，append栈不空，append栈移到delete栈，delete栈pop
        else {
            while( !append.empty() ){
                delete.push(append.pop());
            }
            return delete.pop();
        }
    }

    public static void main(String[] args){
        CQueue obj = new CQueue();
        obj.appendTail(2);
        int param_2 = obj.deleteHead();
    }
}
