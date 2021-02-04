import java.util.Stack;

public class ValidateStackSequences {

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if (popped.length == 0){
            return true;
        }
        if (pushed.length == 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int[] pushed_origin = new int[pushed.length];
        System.arraycopy(pushed, 0, pushed_origin, 0, popped.length);
        int index = findIndex(pushed_origin, popped[0]);
        //初始化栈
        for (int i = 0; i < index; i++){
            stack.push(pushed[i]);
            pushed[i] = -1;
        }
        pushed[index] = -1;
        for(int i = 1; i < popped.length; i++){
            int cur = findIndex(pushed_origin, popped[i]);
            if (cur > index) {
                for (int j = index + 1; j < cur; j++){
                    if (pushed[j] != -1) {
                        stack.push(pushed[j]);
                        pushed[j] = -1;
                    }
                }
                pushed[cur] = -1;
            }else if (cur < index){
                if(stack.pop() != popped[i])
                    return false;
            }
            index = cur;
        }

        return true;
    }

    //找在pushed中的下标
    public static int findIndex(int[] pushed, int val){
        for( int index = 0; index < pushed.length; index++){
            if(pushed[index] == val)
                return index;
        }
        return 0;
    }

    public static void main(String[] args){
        int[] pushed = {3,1,0,2};
        int[] popped = {2,0,3,1};
        System.out.println(validateStackSequences(pushed, popped));
    }
}
