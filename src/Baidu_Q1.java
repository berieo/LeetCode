import java.util.Scanner;

public class Baidu_Q1 {

    public static void find(int x, int y, String str){
        for(char ch : str.toCharArray()){
            if(ch == 'U')
                y += 1;
            else if(ch == 'D')
                y -= 1;
            else if(ch == 'L')
                x -= 1;
            else if(ch == 'R')
                x += 1;
        }
        System.out.print(x + " " + y);
    }

    public static void main(String[] args){
        int x, y;
        String str;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        str = sc.next();
        find(x, y, str);
    }
}
