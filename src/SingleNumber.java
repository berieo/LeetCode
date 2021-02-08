public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int[] count = new int[32];
        int ans = 0;
        int k = 0;
        for(int i = 31; i >= 0; i--){
            for(int n = 0; n < nums.length; n++){
                count[i] += nums[n] & 1;
                nums[n] >>= 1;
            }
            count[i] %= 3;
            ans += count[i] * Math.pow(2,k++);
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {3,4,3,3};
        System.out.println(singleNumber(nums));
    }
}
