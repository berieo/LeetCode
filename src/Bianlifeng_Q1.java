import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bianlifeng_Q1 {

    public static void find(HashMap<Integer, String> hashMap, HashMap<Integer, String> input){
        //遍历原始，对比input，input里没有，说明delete，input里有说明motify
        HashMap<Integer, String> output = new HashMap<>();
        for(Map.Entry<Integer, String> entry : hashMap.entrySet()){
            //如果有,看看一样不
            if(input.containsKey(entry.getKey())){
                //比较是否一样
                //System.out.println(entry.getValue());
                //System.out.println(input.get(entry.getKey()));
                if(!entry.getValue().equals(input.get(entry.getKey())))
                    output.put(entry.getKey(), "motify");
            }else{   //如果没有
                output.put(entry.getKey(), "delete");
            }
        }
        //遍历input，对比原始，原始里没有说明add
        for(Map.Entry<Integer, String> entry : input.entrySet()){
            //如果没有
            if(!hashMap.containsKey(entry.getKey())){
                output.put(entry.getKey(), "add");
            }
        }
        //对输出排序
        TreeMap<Integer, String> sortedMap = new TreeMap<>(output);
        String[] ans = new String[1000];
        int i = 0;
        for(Map.Entry<Integer, String> entry : sortedMap.entrySet()){
            ans[i++] = entry.getValue() + "-" + entry.getKey();
        }
        for(int j = 0; j < i; j++){
            if(j != i - 1)
                System.out.print(ans[j] + ",");
            else
                System.out.print(ans[j]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] array1 = sc.next().split(",");
        String[] array2 = sc.next().split(",");
        HashMap<Integer, String> hashMap = new HashMap<>();
        HashMap<Integer, String> input = new HashMap<>();
        for(String s : array1){
            String[] temp = s.split("-");
            hashMap.put(Integer.parseInt(temp[0]), temp[1]);
            //System.out.println(temp[1]);
        }
        for(String s : array2){
            String[] temp = s.split("-");
            input.put(Integer.parseInt(temp[0]), temp[1]);
            //System.out.println(temp[1]);
        }

        find(hashMap, input);
    }
}
