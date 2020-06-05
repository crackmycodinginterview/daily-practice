class Solution {

    /*Method 1: Using Modulus Operator (Time - O(n), here n is length of input, Space - O(1))
    For finding sum of all digits we need to take out each digit from the number one by one and then add it.

    Let's take a look at the behaviour of modulus (%) operator 
    This operator is used to find the remainder when the first value is divided by the second value.
    
    ex1: 5 % 3 == 2
    ex2: 7 % 2 == 1
    ex3: 4 % 7 == 4 // if don't get this for the first time try dividing 11 with 7 using pen and paper

    An important result is % by 10, it returns the last digit of the number
    ex4: 123 % 10 == 3

    so if we do a an integer division (Refer. Problem-1 -> Solution.java -> method 2) by 10 we can remove the last digit.
    no we can again perform % operation to get the last second digit

    Everything goes like this

        int sum = 0;

        123 % 10 = 3        // sum = 0 + 3 = 3
        123 / 10 = 12

        12 % 10 = 2         // sum = 3 + 2 = 5
        12 / 10 = 1

        1 % 10 = 1          // sum = 5 + 1 = 6
        1 / 10 = 0     

    */
    static int sumOfDigits(int n) {

        if(n < 0) {
            return -1;
        }

        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10; // equivalent to n = n / 10;
        }

        return sum;
    }

    public static void main(String args[]) {
        int sum = sumOfDigits(24083);
        System.out.println(sum);   
    }
}