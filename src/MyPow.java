public class MyPow {
    public static double myPow(double x, int n) {
        if(x == 1)
            return 1;
        long b = n;
        double ans = 1;
        if(b >= 0){
            for(long i = 0; i < b; i++){
                ans *= x;
            }
        }else{
            b = -b;
            for(long i = 0; i < b; i++){
                ans *= x;
            }
            ans = 1 / ans;
        }
        return ans;
    }

    public static void main(String[] args){
        double x = 2;
        int n = -2147483648;
        System.out.println(myPow(x, n));
    }
}
