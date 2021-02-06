import java.util.Arrays;

public class SingleNumbers {

    public static int[] singleNumbers(int[] nums) {
        int xor = 0;
        for(int n : nums){
            xor ^= n;
        }
        //查看第几位为1
        int and = 1;
        for(int i = 1; i <= 32; i++, and <<=  1){
            if ((and & xor) == and){
                break;
            }
        }
        //根据这一位对所有数分组，然后异或
        int a = 0, b = 0;
        for(int n : nums){
            if ((and & n) != 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[]{a, b};
    }

    public static void main(String[] args){
        int[] nums = {4, 1, 4, 3, 3, 5};
        System.out.println(Arrays.toString(singleNumbers(nums)));
    }
}
