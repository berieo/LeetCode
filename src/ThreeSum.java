import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> list = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while(left != right){
                int ans = nums[i] + nums[left] + nums[right];
                if(ans > 0)
                    right--;
                else if(ans < 0)
                    left++;
                else if(ans == 0) {
                    List<Integer> temp = new LinkedList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    list.add(temp);
                    break;
                }
            }
        }
        System.out.println(list.get(1));
        return list;
    }

    public static void main(String[] args){
        int[] sum = {-1,0,1,2,-1,-4};
        threeSum(sum);
    }
}
