import java.util.Arrays;

public class SpiralOrder {

    //输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字

    public static int[] spiralOrder(int[][] matrix) {
        //判断数组是否为空
        if(matrix==null||matrix.length==0||(matrix.length==1&&matrix[0].length==0)){
            return new int[0];
        }

        //行长度
        int x = matrix[0].length;
        //列长度
        int y = matrix.length;
        int num = x * y;
        //行下标
        int i = 0;
        //列下标
        int j = 0;
        //结果
        int [] res = new int[num];
        //结果下标
        int index = 0;
        //方向标记
        int orien = 1; //1往右，2往下，3往左，4往上
        //往右次数
        int orien1 = 0;
        //往下次数
        int orien2 = 0;
        //往左次数
        int orien3 = 0;
        //往上次数
        int orien4 = 0;

        if(y == 1){
            for(; i < x; i++){
                res[index++] = matrix[j][i];
            }
            return res;
        }
        if(x == 1) {
            for (; j < y; j++) {
                res[index++] = matrix[j][i];
            }
            return res;
        }

        while(true){
            //往右遍历
            if(orien == 1){
                for(; i < x - orien2; i++){
                    res[index++] = matrix[j][i];
                }
                //下一次往下遍历
                orien = 2;
                orien1++;
                i--;
                j++;
            }
            if(index == num){
                break;
            }
            //往下遍历
            if(orien == 2){
                for(; j < y - orien3; j++){
                    res[index++] = matrix[j][i];
                }
                //下一次往左遍历
                orien = 3;
                orien2++;
                j--;
                i--;
            }
            if(index == num){
                break;
            }
            //往左遍历
            if(orien == 3){
                for(; i >= orien4; i--){
                    res[index++] = matrix[j][i];
                }
                //下一次往上遍历
                orien = 4;
                orien3++;
                i++;
                j--;
            }
            if(index == num){
                break;
            }
            //往上遍历
            if(orien == 4){
                for(; j >= orien1; j--) {
                    res[index++] = matrix[j][i];
                }
                //下一次往右遍历
                orien = 1;
                orien4++;
                j++;
                i++;
            }
            //如果行数加起来为总行数或者列数加起来为总列数
            if(index == num){
                break;
            }
        }

        return res;
    }

    public static void main(String [] args){
        //[1,2,3,6,9,12,11,10,7,4,5,8]
        int [][] matrix = new int[][] {
                {2, 5},
                {8, 4},
                {0, -1}
        };
        System.out.println(Arrays.toString(spiralOrder(matrix)));
    }
}
