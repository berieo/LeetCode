import java.util.ArrayList;
import java.util.List;

public class FirstUniqChar {
    public static char firstUniqChar(String s) {
        if(s.length() == 1){
            return s.charAt(0);
        }
        if(s.length() == 0){
            return ' ';
        }
        String[] str = s.split("");
        int i = 0;
        int j = 0;
        List<String> list = new ArrayList();
        //从第一个到倒数第二个
        for( ; i < str.length - 1; i++ ){
            //如果之前已经发现重复，直接跳出
            if( !list.contains(str[i]) ){
                for( j = i + 1; j < str.length; j++ ){
                    if( str[i].equals(str[j]) ){
                        list.add(str[i]);
                        break;
                    }
                }
            }
            //如果比较完毕发现没有重复的，返回这个值
            j--;
            if( j == str.length - 1 && !str[i].equals(str[j]) ){
                if(!list.contains(str[i]))
                    return str[i].charAt(0);
            }

        }
        //如果最后一个和前面没有重复
        if(!list.contains(str[i]))
            return str[i].charAt(0);
        return ' ';
    }

    public static void main(String[] args){
        String s = "";
        System.out.println(firstUniqChar(s));
    }
}
