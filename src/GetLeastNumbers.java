import java.util.Arrays;

public class GetLeastNumbers {
    public static int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0)
            return new int[0];
        Arrays.sort(arr);
        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = arr[i];
        }
        return ans;
    }

    public static void main (String[] args){
        int[] arr = {0,1,2,1};
        int k = 1;
        System.out.println(Arrays.toString(getLeastNumbers(arr, k)));
    }
}
