import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class IsValid {

    public static boolean isValid(String s) {
        if(s.length() == 0 || s == null)
            return true;

        HashMap<Character, Character> hashMap = new HashMap<>();
        Deque<Character> stack = new LinkedList<>();

        hashMap.put('}','{');
        hashMap.put(')','(');
        hashMap.put(']','[');

        for(Character ch : s.toCharArray()){
            if(hashMap.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != hashMap.get(ch)) {
                    return false;
                }
                stack.pop();
            }
           else
               stack.push(ch);
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String s = "{()}";
        System.out.println(isValid(s));
    }
}
