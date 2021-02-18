import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if(nums.length == 1)
            return new int[0];
        int[] ans = new int[2];
        int start = 0;
        int end = 1;
        int sum = nums[0] + nums[1];

        outterLoop: for(; start + 1 < nums.length; start++) {
                        for(end = start + 1; end < nums.length; end++){
                            if(nums[start] + nums[end] < target)
                                continue;
                            else if(nums[start] + nums[end] > target)
                                break;
                            else{
                                ans[0] = nums[start];
                                ans[1] = nums[end];
                                break outterLoop;
                            }

                        }
                    }
                    return ans;
    }

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
