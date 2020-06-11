public class Solution {

    // Method 1: Swapping elements (Time - O(n), Space - O(1))

    /*
        The idea is simple we are going swap values at each index with another index equal to the value at that index - 1;

        here is an example:
            ex1: {3, 1, 2}
            
            1. At i = 0: we will swap 3 and 1
            {1, 3, 2}

            2. At i = 1: we will swap 3 and 2
            {1, 2, 3}

            3. At i = 2: we will swap 3 with itself
            {1, 2, 3} // no change

            Everything looks fine but it still have an issue, 
            lets work it out using another example.

            ex2: {4, 3, 1, 2}
            
            1. At i = 0: we will swap 4 and 2
            {2, 3, 1, 4}

            2. At i = 1: we will swap 3 and 1
            {2, 1, 3, 4}

            3. At i = 2: we will swap 3 with itself
            {2, 1, 3, 4} // no change

            4. At i = 3: we will swap 4 with itself
            {2, 1, 3, 4} // no change

            What went wrong?
            Our algorithm stopped working correctly just after step 2 was completed.
            Notice in step 3 when i = 2 we have a[1] = 1 which is not at its correct position and we are not going to swap it again
            because we already completed step 2.

            Simple fix is to only update the value of i, iff i is greater than or equal to value at that index - 1 
            
    */
    static int[] sort(int[] a){

        for(int i = 0; i < a.length; ) {
            int temp = a[i];
            int swapIndex = temp - 1;
            a[i] = a[swapIndex];
            a[swapIndex] = temp;

            if(temp >= i) {
                i++;
            }
        }

        return a;

    }

    public static void main(String[] args) {
        int a[] = {4, 6, 1, 5, 3, 2};
        int ans[] = sort(a);
        
        for(int i: ans) {
            System.out.println(i);
        }
    }

}