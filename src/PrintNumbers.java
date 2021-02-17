import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintNumbers {
    public static int[] printNumbers(int n) {
        int[] ans = new int[(int) Math.pow(10, n) - 1];
        for(int i = 1; i <= ans.length; i++){
            ans[i-1] = i;
        }
        return ans;
    }

    public static void main(String[] args){
        int n = 3;
        System.out.println(Arrays.toString(printNumbers(n)));
    }
}
