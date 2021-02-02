import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exist {

    static String str = new String();
    static char[][] m;

    public static boolean exist(char[][] board, String word) {
        if(word.length() == 1){
            for ( char[] ch : board ){
                for ( char c : ch ){
                    if ( word.charAt(0) == c)
                        return true;
                }
            }
            return false;
        }
        int i = 0;
        int j = 0;
        int charAt = 1;
        m = board.clone();
        str = word;


        boolean isExist = false;
        ArrayList<int[]> list = new ArrayList();

        //遍历一遍找到第一个字符所在位置
        for ( ; i < board.length; i++ ) {
            for ( j = 0 ; j < board[0].length; j++){
                if( word.charAt(0) == board[i][j]){
                    int[] temp = new int[2];
                    temp[0] = i;
                    temp[1] = j;
                    list.add(temp);
                }
            }
        }
        //遍历每个第一个字符的位置，查找是否匹配
        for ( int[] t : list ){
            i = t[0];
            j = t[1];
            boolean[][] isAccess = new boolean[board.length][board[0].length];
            isAccess[i][j] = true;
            if ( findPath(i, j ,charAt, isAccess) )
                return true;
        }

        return false;
    }

    public static boolean findPath(int i, int j, int charAt, boolean[][] isAccess){
        //比较上方
        if ( i - 1 >= 0 ){
            i--;
            //如果相等
            if ( str.charAt(charAt) == m[i][j] && isAccess[i][j] == false){
                //如果是最后一个
                if ( charAt == str.length() - 1){
                    return true;
                }
                //如果不是最后一个，继续递归
                else {
                    charAt++;
                    isAccess[i][j] = true;
                    if ( findPath(i, j, charAt, isAccess) )
                        return true;
                    else{
                        isAccess[i][j] = false;
                        charAt--;
                    }
                }
            }
            i++;
        }
        //比较右边
        if ( j + 1 < m[0].length ){
            j++;
            if ( str.charAt(charAt) == m[i][j] && isAccess[i][j] == false ){
                //如果是最后一个
                if ( charAt == str.length() - 1){
                    return true;
                }
                //如果不是最后一个
                else {
                    charAt++;
                    isAccess[i][j] = true;
                    if ( findPath(i, j, charAt, isAccess) )
                        return true;
                    else{
                        isAccess[i][j] = false;
                        charAt--;
                    }
                }
            }
            j--;
        }
        //比较下边
        if ( i + 1 <  m.length ){
            i++;
            //如果相等
            if ( str.charAt(charAt) == m[i][j] && isAccess[i][j] == false ){
                //如果是最后一个
                if ( charAt == str.length() - 1){
                    return true;
                }
                //如果不是最后一个
                else {
                    charAt++;
                    isAccess[i][j] = true;
                    if ( findPath(i, j, charAt, isAccess) )
                        return true;
                    else{
                        isAccess[i][j] = false;
                        charAt--;
                    }
                }
            }
            i--;
        }
        //比较左边
        if ( j - 1 >=  0 ){
            j--;
            //如果相等
            if ( str.charAt(charAt) == m[i][j] && isAccess[i][j] == false ){
                //如果是最后一个
                if ( charAt == str.length() - 1){
                    return true;
                }
                //如果不是最后一个
                else {
                    charAt++;
                    isAccess[i][j] = true;
                    if ( findPath(i, j, charAt, isAccess) )
                        return true;
                    else{
                        isAccess[i][j] = false;
                        charAt--;
                    }
                }
            }
            j++;
        }
        return false;
    }
    public static void main(String[] args){
//        char[][] board = {
//                {'a', 'b', 'c', 'e'},
//                {'s', 'f', 'c', 's'},
//                {'a', 'd', 'e', 'e'},
//        };
//        char[][] board = {
//                {'a','b'},
//                {'c','d'}
//        };
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'E', 'S'},
                {'A', 'D', 'E', 'E'},
        };

        System.out.println(exist(board, "ABCEFSADEESE"));
    }
}
