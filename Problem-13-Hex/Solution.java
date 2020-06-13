class Solution {
    
    static String hexValue(int n) {
        final char[] nos = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, a, b, c, d, e, f};
    }

    static String calcHex(int a, int b, int c) {
        int hex = new String();
        hex = "#" + hexValue(a) + hexValue(b) + hexValue(c);
        return hex;
    }

    public static void main(String[] args) {
        int a = 60, b = 145, c = 94;
        System.out.println(calcHex(a, b, c));
    }
}