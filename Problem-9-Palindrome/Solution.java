public class Solution {

    // Mehod 1: Two Pointers Approach (Time - O(n), Space - O(1))
    /*
        We check first character with last character
        second character with last second character
        and so on until we find a mis match

        othersiwe we return true
    */
    static boolean isPalindrome(String s) {
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "malayalam";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }
}