public class FindNthDigit {
    public static int findNthDigit(int n) {
        long location = 0;
        int i = 0;
        for( ; n > location; i++){
            location += (i * 9 * Math.pow(10, i-1));
        }
        location -= (--i) * 9 * Math.pow(10, i-1);
        long quotient = (n - location) / i;  //商
        long remainder = (n - location) % i; //余数
        long num = remainder == 0 ? (int) Math.pow(10, i-1) - 1 + quotient : (int)Math.pow(10, i-1) + quotient; //在哪个数上
        remainder = remainder == 0 ? remainder + i : remainder;
        for(int j = 0; j < i - remainder ; j++){
            num = (num - num % 10) / 10;
        }
        return (int) num % 10;
    }

    public static void main(String[] args){
        int n = 15;
        System.out.println(findNthDigit(n));
    }
}
