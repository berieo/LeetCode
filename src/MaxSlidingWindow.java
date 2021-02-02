import java.util.Arrays;

public class MaxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0){
            return new int[0];
        }
        if(nums.length == 1){
            return nums;
        }
        int length = nums.length;
        int[] ans = new int[length - k + 1];
        int[] location = new int[2]; //[0]为最大值下标，[1]为最大值
        int i = 0;

        //找出初始窗口最大值
        for ( location[0] = 0, location[1] = nums[0]; i < k; i++ ){
            if ( nums[i] > location[1] ) {
                location[0] = i;
                location[1] = nums[i];
            }
        }
        ans[0] = location[1];
        for ( ; i < length; i++ ){
            //最大值在滑动窗口内
            if ( location[0] != i - k ){
                //如果新的值大
                if ( nums[i] >= location[1] ){
                    ans[i - k + 1] = nums[i];
                    location[0] = i;
                    location[1] = nums[i];
                }
                else{ //如果旧的值大
                    ans[i - k + 1] = location[1];
                }
            } else {  //如果不在最大窗口内
                location[0] = i;
                location[1] = nums[i];
                for (int index = i - k + 1; index < i; index++ ){
                    //如果新的大
                    if ( nums[index] > location[1] ){
                        location[0] = index;
                        location[1] = nums[index];
                    }
                }
                ans[i - k + 1] = location[1];
            }
        }
        return ans;
    }

    public static void main(String[] args){
//        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] nums = {1,-1};
        int k = 1;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
