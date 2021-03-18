import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Huawei_Q3 {

    public static void find(int K, int W, int[] p, int[] c){

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int W = sc.nextInt();
        String Profits = sc.next();
        String Capital = sc.next();
        String[] pro = Profits.split(",");
        String[] cap = Capital.split(",");
        int[] p = new int[pro.length];
        int[] c = new int[cap.length];
        for(int i = 0; i < pro.length; i++){
            p[i] = Integer.parseInt(pro[i]);
        }
        for(int i = 0; i < cap.length; i++){
            c[i] = Integer.parseInt(cap[i]);
        }
        System.out.println(K);
        System.out.println(W);
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(c));
        find(K, W, p, c);
    }
}
