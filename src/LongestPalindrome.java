public class LongestPalindrome {

    //中心扩散法
//    public static String longestPalindrome(String s) {
//        if(s.length() < 2)
//            return s;
//
//        int start = 0;
//        int end = 0;
//
//        for(int i = 0; i < s.length() - 1; i++){
//            int len1 = findLongestPalindrome(s, i, i);
//            int len2 = findLongestPalindrome(s, i, i + 1);
//            int len = Math.max(len1, len2);
//            if(len > end - start){
//                start = i - (len - 1) / 2;
//                end = i + len / 2;
//            }
//        }
//
//        return s.substring(start, end + 1); //不包含end位置
//    }
//
//
//    public static int findLongestPalindrome(String s, int left, int right){
//        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
//            left--;
//            right++;
//        }
//        return right - left - 1;
//
//    }

    public static String longestPalindrome(String s) {
        if(s.length() < 2)
            return s;

        int left = 0;
        int right = 0;

        for(int i = 0; i < s.length(); i++){
            int len1 = find(s, i, i);
            int len2 = find(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len > right - left){
                left = i - (len - 1) / 2;
                right = i + len / 2;
            }
        }

        //substring 不包含end位置
        return s.substring(left, right + 1);
    }

    public static int find(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }


    //动态规划法, 纵为begin,行为end
//    public static String longestPalindrome(String s) {
//        int len = s.length();
//        if(len < 2)
//            return s;
//
//        boolean[][] isPalindrome = new boolean[len][len];
//        int maxLen = 1;
//        int begin = 0;
//        for(int i = 0; i < s.length(); i++){
//            isPalindrome[i][i] = true;
//        }
//        for(int j = 1; j < s.length(); j++){
//            for(int i = 0; i < j; i++){
//                if(s.charAt(i) != s.charAt(j))
//                    isPalindrome[i][j] = false;
//                else{
//                    if(j - i < 3){
//                        isPalindrome[i][j] = true;
//                    }else{
//                        isPalindrome[i][j] = isPalindrome[i + 1][j - 1];
//                    }
//                }
//
//                if(isPalindrome[i][j] && j - i + 1 > maxLen){
//                    maxLen = j - i + 1;
//                    begin = i;
//                }
//            }
//        }
//        return s.substring(begin, begin + maxLen);
//    }

    public static void main(String[] args){
        String s = new String("babad");
        longestPalindrome(s);
    }
}
