import java.util.Arrays;

public class Exchange {
    public static int[] exchange(int[] nums) {
        int [] ans = new int[nums.length];
        int index = 0;
        for(int i : nums){
            if(i % 2 != 0)
                ans[index++] = i;
        }
        for(int i : nums){
            if(i % 2 == 0)
                ans[index++] = i;
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        exchange(nums);
    }
}
