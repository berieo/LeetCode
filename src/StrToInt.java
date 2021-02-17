public class StrToInt {
    public static int strToInt(String str) {
        if(str.length() == 0){
            return 0;
        }
        //第一个不为空格或数字
        if(str.charAt(0) != ' ' && (str.charAt(0) < 48 || str.charAt(0) > 57) && str.charAt(0) != '-' && str.charAt(0) != '+'){
            return 0;
        }
        int index = 0;
        boolean minus = false;
        Long ans = 0L;
        int x = 0;
        //消除空格
        while (index < str.length() && str.charAt(index) == 32){
            index++;
        }
        if(index < str.length()){
            if(str.charAt(index) == '-'){
                minus = true;
                index++;
            } else if(str.charAt(index) == '+'){
                index++;
            }
            while(index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9' ){
                ans = ans * 10 + str.charAt(index) - 48;
                x = ans == 0 ? 0 : ++x;
                if(x > 10){
                    return minus == true ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                index++;
            }
            ans = minus == true ? -ans : ans;
            if(ans < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            if(ans > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            return ans.intValue();
        }
        return 0;
    }

    public static void main(String[] args){
        String str = "2147483648";
        System.out.println(strToInt(str));
    }
}
