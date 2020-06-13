import java.util.*;
public class Solution {

    // Method 1: By finding the index of the rightmost negative number (Time - O(n), Space - O(1))
    /*
        
        ex: {-6, -3, -1, 2, 4, 5}
        
        steps
        1. find the rightmost negative number's index
            leftIndex = 2;          //we will use it to traverse towards the left when we sort
            rightIndex = 3          
        2. Using leftIndex we will traverse towards the left and using rightIndex we will traverse towards the right,
            also we will compare each element and place it into a new array
        

    */
    static int[] squaredArray(int[] a) {
        
        int leftIndex = 0 ;
        for(int i = 0; i < a.length; i++) {
            if(a[i] < 0) {
                leftIndex = i;
            }
            a[i] = (int) Math.pow(a[i], 2);
        }

        int b[] = new int[a.length];

        for(int i = 0, rightIndex = leftIndex + 1; i < b.length; i++) {
        
            if(leftIndex >= 0 && rightIndex < b.length) {
                if(a[leftIndex] < a[rightIndex]) {
                    b[i] = a[leftIndex--];
                }
                else {
                    b[i] = a[rightIndex++];
                }
            }
            else if(leftIndex >= 0) {
                b[i] = a[leftIndex--];
            }
            else if(rightIndex < a.length) {
                b[i] = a[rightIndex++];
            }

        }
 
        return b;
    }

    public static void main(String[] args) {
        int a[] = {-6, -3, -1, 2, 4, 5};
        int ans[] = squaredArray(a);

        for (int i : ans) {
            System.out.println(i);
        }
        
    }

}