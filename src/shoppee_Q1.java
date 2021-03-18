import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class shoppee_Q1 {

    public static void q1(String str){
        String target = "[A,a][B,b][C,c]";
        System.out.println(str.replaceAll(target, ""));
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        q1(str);
    }
}
