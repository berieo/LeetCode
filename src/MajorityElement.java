import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        Integer temp = 0;
        Integer length = nums.length;
        for(int n : nums){
            temp = map.get(n);
            if(temp == null){
                map.put(n, 1);
            }else{
                temp++;
                if(temp > length / 2 )
                    return n;
                else
                    map.put(n, temp);
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(majorityElement(nums));
    }
}
