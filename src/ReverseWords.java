public class ReverseWords {
    public static String reverseWords(String s) {
        s= s.trim();
        String[] str = s.split("\\s+");
        StringBuilder ans = new StringBuilder();
        for( int i = str.length - 1; i >= 0; i-- ){
            ans.append(str[i]);
            ans.append(" ");
        }
        String res = ans.toString().trim();
        return res;
    }

    public static void main(String[] args){
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

}
