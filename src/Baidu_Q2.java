//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Baidu_Q2 {
//
//    int[][] save = new int[1000][2];
//
////    public static boolean baidu_Q2(int n, int[][] arr, int a, int b){
////        //找到一个0，上下左右全部回溯，如果发现有0到了边缘，则返回false
////        for(int i = 1; i < n; i++){
////            for(int j = 1; i < n; j++){
////                if(arr[i][j] == 0){
////                    arr[i][j] = -1;
////                    baidu_Q2(n, arr, i - 1, j);
////                }
////            }
////        }
////    }
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        int n;
//        n = sc.nextInt();
//        int[][] arr = new int[n][n];
//        String[] str = new String[n];
//        for(int i = 0; i < n; i++){
//            str[i] = sc.next();
//        }
//        for(int i = 0; i < n; i++){
//            char[] ch = str[i].toCharArray();
//            for(int j = 0; j < n; j++){
//                arr[i][j] = ch[j] - 48;
//            }
//        }
//
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(0);
//            }
//            if(i != n - 1)
//                System.out.println();
//        }
//
//        //边缘的0都初始化为-1;
//        int index = 0;
//        for(int j = 0; j < n; j++){
//            if(arr[index][j] == 0)
//                arr[index][j] = -1;
//        }
//        for(int j = 0; j < n; j++){
//            if(arr[j][index] == 0){
//                arr[j][index] = -1;
//            }
//        }
//        index = n - 1;
//        for(int j = 0; j < n; j++){
//            if(arr[index][j] == 0)
//                arr[index][j] = -1;
//        }
//        for(int j = 0; j < n; j++){
//            if(arr[j][index] == 0)
//                arr[j][index] = -1;
//        }
//
//        baidu_Q2(n, arr, 0, 0);
//    }
//}
