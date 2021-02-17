import java.util.Arrays;

public class IsStraight {
    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zero = 0;
        for(int n : nums){
            if(n == 0)
                zero++;
            else
                break;
        }
        for(int i = zero + 1, temp = nums[zero]; i < nums.length; i++){
            if(nums[i] == temp){
                return false;
            }
            if(nums[i] != temp + 1){
                zero = zero - (nums[i] - temp - 1);
                if(zero < 0){
                    return false;
                }
                temp = nums[i];
            }else{
                temp++;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] nums = {9,0,6,0,10};
        System.out.println(isStraight(nums));
    }
}
