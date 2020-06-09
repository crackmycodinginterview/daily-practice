class Solution {

    static int findMaxProductOfTwo(int a[]) {

        int minNum = a[0];
        int maxNum = a[0];
        int maxProd = a[0];

        for (int i = 1; i < a.length; i++) {

            maxProd = Math.max(Math.max(maxProd, maxNum * a[i]), minNum * a[i]);

            if (maxNum < a[i]) {
                maxNum = a[i];
            }

            if (minNum > a[i]) {
                minNum = a[i];
            }

        }

        return maxProd;
    }

    public static void main(String args[]) {
        int[] a = { 1, -8, 3, -4, 5 };
        int result = findMaxProductOfTwo(a);
        System.out.println(result);
    }

}