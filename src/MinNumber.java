import java.util.Arrays;

public class MinNumber {
    public static String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder res = new StringBuilder();
        for(String s : strs)
            res.append(s);
        return res.toString();
    }

    public static void main(String[] args){
        int[] nums = {3,30,34,5,9};
        System.out.println(minNumber(nums));
    }
}
