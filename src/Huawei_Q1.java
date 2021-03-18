import java.util.HashMap;
import java.util.Scanner;

public class Huawei_Q1 {

    public static void find(String str){
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> hashMap =  new HashMap<>();
        int pre = 0;
        int max = 0;
        boolean isfirst = false;
        for(int i = 0; i < ch.length; i++){
            //如果存在，则放进hashmap
            if(hashMap.containsKey(ch[i])){
                int count = hashMap.get(ch[i]);
                count++;
                //如果有重复三次的，移动到第二次出现的
                if(count > 2){
                    //初始化max
                    if (isfirst == false){
                        max = i - pre;
                        //isfirst = true;
                    }
                    char cur = ch[i];
                    while(true){
                        if(ch[pre] == cur){
                            hashMap.put(ch[pre], 1);
                            max = Math.max(i - pre, max);
                            pre++;
                            break;
                        }
                        //如果不相等，hashmap对应值-1，指针后移
                        else{
                            int num = hashMap.get(ch[pre]);
                            if(num == 1)
                                hashMap.remove(ch[pre]);
                            else if(num == 2)
                                hashMap.put(ch[pre], 1);
                            pre++;
                        }
                    }
                }
                hashMap.put(ch[i], count);
            }else{
                hashMap.put(ch[i], 1);
            }
        }
        System.out.print(max);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        find(str);
    }
}
