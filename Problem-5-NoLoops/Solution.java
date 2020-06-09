class Solution {

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