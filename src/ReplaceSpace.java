public class ReplaceSpace {
    public static String replaceSpace(String s) {
        return s.replaceAll(" ", "%20");
    }

    public static void main(String[] args){
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }
}
