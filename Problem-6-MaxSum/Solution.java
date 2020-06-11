class Solution {

    // Method 1: Greed Approach (Time - O(n), Space - O(1))

    /*
        In this approach we will be traversing the list exactly once, and for each number we will be checking and updating the maximum product
        seen so far.
    
        To solve this question we need to keep track of 3 variables
        1. maxProd: It simply represent the maximum product of numbers obtain so far
        2. maxNum: When we loop through the numbers we have a possibility of seeing a number which is greater then any of the previous numbers
            therefore we have a possibility of finding a new maxProd
        
        3. minNum: If our list of numbers is only contained positive numbers we actually don't need to keep track of minNum
            but in our case we have a mix of positive and negative numbers

            how does tracking minNum helps in reaching to the correct solution?
            
            ex: {-1, 2, 4}
            op: 8 // 2 * 4

            ex: {-3, -2, 3}
            op: 6 // -3 * -2
            
            Also note keeping track of minNum makes sense when we have more than 1 negative number

    */
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