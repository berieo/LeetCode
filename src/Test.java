import java.security.Signature;
import java.util.*;

public class Test {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a;
        while(in.hasNextLine()){
            a = in.nextInt();
            if(a != 0)
                System.out.println(a);
        }
    }
}
