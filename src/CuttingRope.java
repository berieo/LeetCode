public class CuttingRope {
    public static int cuttingRope(int n) {
        Long ans = 1L;
        if(n == 2 || n == 3)
            return  n - 1;
        else if(n == 4)
            return 4;
        else if(n % 3 == 0){
            for(int i = 1; i <= n / 3; i++)
                ans = (ans * 3) % 1000000007;
        }
        else if(n % 3 == 1){
            for(int i = 1; i <= n / 3 - 1; i++)
                ans = (ans * 3) % 1000000007;
            ans = (ans * 4) % 1000000007;
        }
        else if(n % 3 == 2){
            for(int i = 1; i <= n / 3; i++)
                ans = (ans * 3) % 1000000007;
            ans = (ans * 2) % 1000000007;
        }
        return ans.intValue();
    }

    public static void main(String[] args){
        int n = 127;
        System.out.println(cuttingRope(n));

    }
}
