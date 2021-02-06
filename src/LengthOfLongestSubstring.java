import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        List<Character> list = new LinkedList<>();
        list.add(s.charAt(0));
        int max = 1;
        int maxIndex = 0;
        for(int i = 1, j = 0; i < s.length(); i++){
            list.add(s.charAt(i));
            //找到list相同的字符
            for(j = list.size() - 2, maxIndex = -1; j >= 0; j--){
                if(s.charAt(i) == list.get(j)){
                    maxIndex = j;
                    break;
                }
            }
            //删除list一样之前的
            for(int index = 0; index <= maxIndex; index++){
                list.remove(0);
            }
            max = Math.max(max, list.size());
        }
        return max;
    }

    public static void main(String[] args){
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
