public class NumWays {
    public static int numWays(int n){
        //最多有多少2
        long max_2 = 0;
        //记录1的个数
        long num_1 = 0;
        //记录2的个数
        long num_2 = 0;
        //记录结果
        int count = 0;

        //偶数
        if(n % 2 == 0){
            max_2 = n / 2;
        }else{  //奇数
            max_2 = (n - 1) / 2;
        }
        for(; num_2 <= max_2; num_2++){
            num_1 = n - (num_2 * 2);
            count = (int)(factorial(num_1 + num_2) / (factorial(num_1) * factorial(num_2)));
        }
        return count % 1000000007;
    }

    //计算阶乘
    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }

    public static void main(String[] args){
        System.out.println(numWays(23));
    }
}
