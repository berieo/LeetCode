// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class Solution {

    static int[] res = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //T组数据
        int T = sc.nextInt();
        int ans = 0, x;
        int n, m;
        int res1, res2;
        //两组数据，遍历两侧，遍历的时候读完就计算
        for(int i = 0; i < T; i++){
            n = sc.nextInt();
            m = sc.nextInt();
            //初始化
            for(int j = 1; i <= n; j++)
                res[j] = j;

            int[][] arr = new int[m][2];
            //拿到位置
            for(int j = 0; j < m; j++){
                arr[j][0] = sc.nextInt();
                arr[j][1] = sc.nextInt();
            }
            //并查集找环
            for(int j = 0; j < m; j++){
                if(arr[j][0] != arr[j][1]){
                    res1 = find(arr[j][0]);
                    res2 = find(arr[j][1]);
                    if(res1 != res2)
                        res[res2] = res1;
                    else
                        ans++;
                }
                else
                    ans--;
            }
            System.out.println(ans);
        }

    }

    public static int find(int i){
        if(i != res[i])
            res[i] = find(res[i]);
        return res[i];
    }
}