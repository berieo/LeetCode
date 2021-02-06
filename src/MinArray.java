public class MinArray {
    public static int minArray(int[] numbers) {
        int min = numbers[0];
        for(int i = numbers.length - 1; i > 0; i--){
            if(numbers[i - 1] > numbers[i])
                return numbers[i];
        }
        return numbers[0];
    }
    public static void main(String[] args){
        int[] numbers = {2,2,2,0,1};
        System.out.println(minArray(numbers));
    }
}
