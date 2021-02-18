import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindContinuousSequence {
    public static int[][] findContinuousSequence(int target) {
        int length = target / 2 + 1;
        int[] nums = new int[length];
        int begin = 0;
        int end = 1;
        int sum = 3;
        List<int []> list = new ArrayList<>();
        for(int i = 1; i <= length; i++){
            nums[i-1] = i;
        }
        while(true){
            if(sum < target){
                if(end + 1 < length){
                    sum += nums[++end];
                } else
                    break;
            } else if(sum > target){
                if(begin + 2 < length){
                    sum -= nums[begin++];
                } else{
                    break;
                }
            } else{
                list.add(Arrays.copyOfRange(nums, begin, end + 1));
                sum -= nums[begin++];
            }
        }
        int[][] ans = new int[list.size()][];
        int index = 0;
        for(int[] i : list){
            ans[index++] = i;
        }
        return ans;
    }

    public static void main(String[] args){
        int target = 15;
        System.out.println(Arrays.toString(findContinuousSequence(target)));
    }
}
