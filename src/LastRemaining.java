import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LastRemaining {
    public static int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < n; i++){
            list.add(i);
        }
        while(list.size() != 1){
            if((index + m) % list.size() == 0){
                list.remove(list.size() - 1);
                index = list.size();
            }
            else{
                index = (index + m) % list.size() - 1;
                list.remove(index);
            }

        }
        return list.get(0);
    }

    public static void main(String[] args){
        int n = 10;
        int m = 17;
        lastRemaining(n, m);
    }
}
