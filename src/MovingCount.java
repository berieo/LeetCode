import java.util.Arrays;

public class MovingCount {
    static int count = 0;
    static int m_length;
    static int n_length;
    static int k_static;
    static boolean[][] isCount = new boolean[100][100];

    public static int movingCount(int m, int n, int k) {
        if (k == 0) {
            return 1;
        }
        boolean[][] isAccess = new boolean[m][n];
        boolean[][] temp = new boolean[100][100];
        count = 0;
        m_length = m;
        n_length = n;
        k_static = k;
        System.arraycopy(temp, 0, isCount, 0, temp.length);
        findMax(0, 0, isAccess);
        return count;
    }

    public static void findMax(int i, int j, boolean[][] isAccess){
        if(i >= m_length || i < 0 || j >= n_length || j < 0 || get(i) + get(j) > k_static || isAccess[i][j] == true) return;
        if(isCount[i][j] == false){
            isCount[i][j] = true;
            count++;
        }
        isAccess[i][j] = true;
        findMax(i, j+1, isAccess); //右
        findMax(i+1, j, isAccess); //下
        findMax(i, j-1, isAccess); //左
        findMax(i-1, j, isAccess); //上
        return;


    }

    // 计算 x 的数位之和
    private static int get(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        int k = 17;
        System.out.println(movingCount(m, n, k));
    }
}
