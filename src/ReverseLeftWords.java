public class ReverseLeftWords {
    public static String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }

    public static void main(String[] args){
        String s = "lrloseumgh";
        int n = 6;
        System.out.println(reverseLeftWords(s, n));
    }
}
