class Solution {
    
    static boolean isPowerOf2Log(int n) {
        if(n == 0) return false;
        return (int)(Math.log(n)/ Math.log(2)) == (Math.log(n)/ Math.log(2));
    }

    static boolean isPowerOf2(int x) {
        return x != 0 && ( (x & (x - 1)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOf2(256));
    }
}