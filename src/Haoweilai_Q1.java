import java.util.Scanner;

public class Haoweilai_Q1 {

    public static void find(int num){
        char[] ch = Integer.toString(num).toCharArray();
        int max = ch.length - 1;
        int[] arr = new int[ch.length];
        for(int i = ch.length - 1; i >= 0; i--){
            if(ch[i] > ch[max]){
                max = i;
            }
            arr[i] = max;
        }
        for(int i = 0; i < ch.length; i++){
            if(ch[arr[i]] != ch[i]){
                char box = ch[arr[i]];
                ch[arr[i]] = ch[i];
                ch[i] = box;
                break;
            }
        }
        for(char c : ch){
            System.out.print(c);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        find(num);
    }
}
