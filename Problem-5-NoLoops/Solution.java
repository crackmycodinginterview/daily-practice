class Solution {

    // Method 1: Recursive Approach (Time - O(n), Space - O(n))
    static void printSeries(int n) {
        if (n == 0) {
            return;
        }
        printSeries(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        printSeries(n);
    }
}