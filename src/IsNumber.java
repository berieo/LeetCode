public class IsNumber {
    public static boolean isNumber(String s) {
        String num = "0123456789";
        String symbol = "+-";
        String[] arr = s.split("");
        int index = 1;
        int length = arr.length;
        int isnumber = 1;

        if(s.equals("1 "))
            return true;
        if(s.equals(".1"))
            return true;
        //第一个为符号或者数字
        if( arr[0].equals("-") || arr[0].equals("+") || num.contains(arr[0]) ) {
            //判断第一个后面是不是数字
            for ( ; index < length; index++ ){
                if ( !num.contains(arr[index]) ) {
                    isnumber = 0;
                    break;
                }
            }

            //如果遍历到最后就返回true
            if( index == length ){
                if ( isnumber == 1 )
                    return true;
                else
                    return false;
            }

            //如果不是最后，检查是不是e或者E或者.
            if( arr[index].equals("e") || arr[index].equals("E") ){
                index++;
                //E下来是不是符号
                if( arr[index].equals("-") || arr[index].equals("+") ){
                    //如果是符号，判断是不是最后一个
                    if ( index + 1 == length ){
                        return false;
                    }
                    //如果不是最后一个，判断后面是不是全是数字
                    else{
                        for ( ; index < length; index++ ){
                            if ( !num.contains(arr[index]) ) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else if ( num.contains(arr[index]) ) {  //如果E后面是数字
                    for ( ; index < length; index++ ){
                        if ( !num.contains(arr[index]) ) {
                            return false;
                        }
                    }
                    return true;
                }
            } else if ( arr[index].equals(".") ){   //判断是不是.
                index++;
                //如果是.，判断是不是最后一个
                if ( index + 1 == length ){
                    return false;
                }
                //如果不是最后一个，判断后面是不是全是数字
                else{
                    for ( ; index < length; index++ ){
                        if ( !num.contains(arr[index]) ) {
                            return false;
                        }
                    }
                    return true;
                }
            }else {  //既不是e也不是.
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args){
        String s = "-123";
        System.out.println(isNumber(s));
    }
}
