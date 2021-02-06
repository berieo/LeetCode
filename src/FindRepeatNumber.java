import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindRepeatNumber {

    public static int findRepeatNumber(int[] nums) {
            Set<Integer> set = new HashSet<Integer>();
            int repeat = -1;
            for (int num : nums) {
                if (!set.add(num)) {
                    repeat = num;
                    break;
                }
            }
            return repeat;
    }

    public static void main(String[] args){
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }
}
