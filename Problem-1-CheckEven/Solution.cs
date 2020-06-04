// For Explanation read Solution.java

using System.IO;
using System;

class Solution
{
    
    // Method 1
    static bool usingBitwiseOper(int n) {
        return (n & 1) == 0;
    }
    
    // Method 2
    static bool usingIntegerDivision(int n) {
        if((n / 2) * 2 == n) {
            return true;
        }
        return false;
    }

    static void Main()
    {
     
        Console.WriteLine(usingBitwiseOper(0));
        Console.WriteLine(usingBitwiseOper(1));
        Console.WriteLine(usingBitwiseOper(4));
        Console.WriteLine(usingBitwiseOper(99));

        // Console.WriteLine(usingIntegerDivision(0));
        // Console.WriteLine(usingIntegerDivision(1));
        // Console.WriteLine(usingIntegerDivision(4));
        // Console.WriteLine(usingIntegerDivision(99));

    }
}