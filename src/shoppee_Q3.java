import java.util.*;

public class shoppee_Q3 {

    public static void q3(List<Integer> list){
        int num = list.size() / 3;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(Integer i : list){
            if(hashMap.containsKey(i)){
                int count = hashMap.get(i);
                count++;
                hashMap.put(i, count+1);

            }else{
                hashMap.put(i, 1);
            }
        }
        String str = "";
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            if (entry.getValue() > num)
                str += entry.getKey().toString() + ",";
        }
        str = str.substring(0, str.length() - 1);
        //str += "]";
        System.out.print(str);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<Integer> list = new LinkedList<Integer>();
        str = str.substring(1, str.length() - 1);
        String[] arr = str.split(",");
        for(String s : arr){
            list.add(Integer.parseInt(s));

        }
       q3(list);
    }
}
