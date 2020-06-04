class Solution {

    // Method 1: Using Bitwise Operator
    /*
    explanation:
        Let's take an example of the binary representation of few numbers
        0 -> 0
        1 -> 1
        4 -> 100
        99 -> 1100011

        If you observe carefully, we can observe that all even numbers ends with a '0' in their binary representiation.
        Similarly all the odd numbers ends with  a '1'

        Conclusion: We only need to check whether the last bit is '0' or '1'. This can we done using Bitwise AND Operator(&).
        So if we performed '&' operation of the input integer with 1 then we will get either a 0 or 1 as output depending
        upon whether the number is even or odd.

        ex1: 4 & 1

              100
            & 001
            -----
              000 // ans 0 therefore even
            -----

        ex2: 99 & 1
        
              1100011
            & 0000001
            ---------
              0000001 // ans 1 therefore odd
            ---------
    */
    static boolean usingBitwiseOper(int n) {
        return (n & 1) == 0;
    }

    // Method 2: Using Integer Division
    /*
    explanation:
      When we perform division operation on an integer datatype, no decimal digit is saved in the number.
    So by doubling the integer division of an integer can be used to determine whether the number is even or not.  
    
      ex 1:  3 / 2 -> 1 (instead of 1.5)
        on doubling the result i.e. 1 * 2 = 2
        2 != 3 (odd)
    
      ex 2: 4 / 2 -> 2
        on doubling the result i.e 2 * 2 = 4
        4 == 4 (even) 
    */
    static boolean usingIntegerDivision(int n) {
        if((n / 2) * 2 == n) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        
        System.out.println(usingBitwiseOper(0));
        System.out.println(usingBitwiseOper(1));
        System.out.println(usingBitwiseOper(4));
        System.out.println(usingBitwiseOper(99));

        // System.out.println(usingIntegerDivision(0));
        // System.out.println(usingIntegerDivision(1));
        // System.out.println(usingIntegerDivision(4));
        // System.out.println(usingIntegerDivision(99));

    }
}