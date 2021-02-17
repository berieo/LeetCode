public class TranslateNum {
    public static int count = 0;

    public static int translateNum(int num) {
        String s = String.valueOf(num);
        findCount(0, s);

        return count;
    }

    public static void findCount(int index, String s){
        if(index == s.length()){
            count++;
            return;
        }else if(index > s.length()){
            return;
        }
        if(s.charAt(index) == 48 || s.charAt(index) > 50){
            findCount(++index, s);
        }
        //s为1
        else if(s.charAt(index) == 49){
            findCount(++index, s);
            findCount(++index, s);
        }
        //s为2
        else{
            if(index + 1 < s.length()){
                if(s.charAt(index+1) > 53){
                    findCount(++index, s);
                }
                else{
                    findCount(++index, s);
                    findCount(++index, s);
                }
            }else{
                count++;
                return;
            }
        }
    }

    public static void main(String[] args){
        int num = 26;
        System.out.println(translateNum(num));
    }
}
