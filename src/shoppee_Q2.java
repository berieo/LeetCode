import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class shoppee_Q2 {

    /*
    data：任意数组，如[1,2,3,4,5]
    num：期望插入的节点value，如666
    N：上述valve期望插入节点的索引index，如4
    M：期望删除的节点的索引index，如2

    */
    public static void q2(List<Integer> list, int num, int N, int M){
        list.add(N+1, num);
        list.remove(M);
        for(int i = 0; i < list.size() - 1; i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.print(list.get(list.size() - 1));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<Integer> list = new LinkedList<Integer>();
        int num = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        str = str.substring(1, str.length() - 1);
        String[] arr = str.split(",");
        for(String s : arr){
            list.add(Integer.parseInt(s));
        }

        q2(list, num, N, M);
    }
}
