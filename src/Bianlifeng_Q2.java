import java.util.Scanner;

public class Bianlifeng_Q2 {
    public static void find(int[][] arr, int line){
        long last = 0;
        long ans = 0;
        for(int i = 0; i < line; i++){
            last = Math.max(arr[i][0], last);
            last += arr[i][1];
            ans += last - arr[i][0];
        }
        System.out.print(ans);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        String[] input = new String[1000];
        int[][] arr = new int[1000][2];
        for(int i = 0; i < line; i++){
            String str = sc.next();
            String[] temp = str.split(",");
            arr[i][0] = Integer.parseInt(temp[0]);
            arr[i][1] = Integer.parseInt(temp[1]);
        }
        find(arr, line);
    }
}
