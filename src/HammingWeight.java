public class HammingWeight {
    public static int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((n & 1) == 1){
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args){
        int n = 5;
        hammingWeight(n);
    }
}