import java.util.Scanner;

public class Haoweilai_Q3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        for(int i = str.length - 1; i >= 0; i--){
            if(i != 0)
                System.out.print(str[i] + " ");
            else
                System.out.print(str[i]);
        }
    }
}
