import java.util.Arrays;
import java.util.Scanner;

public class Meituan_Q1 {
    public static boolean isFirst(String str){
        int[] arr = new int[str.length()];
        for(int c : str.toCharArray()){
            arr[c]++;
        }
        int temp = 0;
        for(int i : arr){
            if(i % 2 == 1)
                temp++;
        }
        if(temp <= 1)
            return true;
        return false;
    }

    public static void find(String str){
        System.out.print(isFirst(str));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        for(int i = 0; i < group; i++){
            int length = sc.nextInt();
            String str = sc.next();
            find(str);
            //System.out.println(str);
        }
    }
}
