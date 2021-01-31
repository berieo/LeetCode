public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int index = 0;
        int sum = 0;
        int max = -100;
        int length = nums.length;

        for(;index < length; index++){
            sum += nums[index];
            max = sum > max ? sum : max;
            if(sum < 0){
                sum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
