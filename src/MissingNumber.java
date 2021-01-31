public class MissingNumber {
    public static int missingNumber(int[] nums) {

        if( nums.length == 1 ){
            if( nums[0] == 0)
                return 1;
            else if( nums[0] == 1 )
                return 0;
            else
                return nums[0];
        }
        if( nums[0] != 0){
            return 0;
        }
        int i = 0;
        for( ; i < nums.length - 1; i++ ){
            if( nums[i+1] - nums[i] != 1 )
                return nums[i] + 1;
        }
        return nums[i] + 1;
    }

    public static void main(String[] args){
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }
}
