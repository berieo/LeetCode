public class IsMatch {
    public static boolean isMatch(String s, String p) {
        //如果s是空的，p必须是"."或".*"
        if ( s.isEmpty() ){
            if( p.equals(".") || p.equals(".*") )
                return true;
            else
                return false;
        }
        //如果p是空的，肯定不能匹配
        if ( p.isEmpty() )
            return false;

        int i = 0;
        int j = 0;

        //从第一个遍历到倒数第二个
        for ( ; i < s.length() && j < p.length(); j++ ){
            if ( p.charAt(j) == '.' ){
                //如果不是最后一个
                if (j != p.length() - 1){
                    //如果下一个是*
                    if  ( p.charAt(j + 1) == '*' ){
                        if ( j + 2 == p.length() )//如果后面没有了
                            return true;
                        else {  //如果后面还有
                            return false;
                        }
                    }
                    //如果下一个是字母
                    else {
                        i++;
                    }
                }else{ //如果是最后一个
                    if ( i == s.length() - 1){
                        return true;
                    }
                    else
                        return false;
                }
            }else if ( p.charAt(j) == '*' ){
                //如果是最后一个
                if ( j == p.length() - 1){
                    if ( i == s.length() )
                        return true;
                    else
                        return false;
                }
            }else {
                //如果不是最后一个
                if (j != p.length() - 1){
                    if  ( p.charAt(j + 1) == '*' ){ //如果下一个是*
                        if ( j + 2 != p.length() ) {//下一个也不是最后一个
                            int count_s = 0;
                            int count_p = 0;
                            for (int index = j + 2; index < p.length(); index++){
                                if (p.charAt(j) == p.charAt(index))
                                    count_p++;
                            }
                            for (int index = i + 1; index < s.length(); index++){
                                if (s.charAt(j) == s.charAt(index))
                                    count_s++;
                            }
                            if ( count_p == 0 ){ //后面没有一样的了
                                for ( ; s.charAt(i) == p.charAt(j); i++ ){
                                    if ( i == s.length() - 1 ){ //如果s是最后一个
                                        if (j + 2 == p.length())
                                            return true;
                                        else
                                            return false;
                                    }
                                }
                                j++;
                            }else{  //后面有一样的
                                if ( count_p > count_s )
                                    return false;
                                else {
                                    i = i + count_s + 1;
                                    j = j + count_p + 2;
                                }
                            }
                        } else {  //*是最后一个
                            for ( ; i < s.length(); i++){
                                if(s.charAt(i) != p.charAt(j))
                                    return false;
                            }
                            return true;
                        }
                    }else {    //如果下一个不是*
                        if ( p.charAt(j) == s.charAt(i) ) //如果相等
                            i++;
                        else
                            return false;
                    }
                }else {  //如果p是最后一个
                    if ( i == s.length() - 1 ){
                        if ( s.charAt(i) == p.charAt(j))
                                return true;
                        else
                            return false;
                    }else{  //如果p不是最后一个
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        String s = "aaa";
        String p = "a*a";
        System.out.println(isMatch(s, p));
    }
}
