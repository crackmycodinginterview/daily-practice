class Solution {

    // Method 1: Linear Search ( Time - O(n), Space - O(1))
    static int findMinPositiveUsingLinearSearch(int[] a) {
        for(int i: a) {
            if(i >= 0) {
                return i;
            }
        }
        return 0;
    }


    // Method 2: Binary Approach (Time - O(log(n)), Space - O(1))
    /*
        Remember the array is sorted !
        Whenever we are looking into a sorted array it can be exploited using Binary Search Approach

        Traditional Binary Search:
            We keep track of two numbers the leftIndex and RightIndex
            and on each iteration we narrow down the search in half.

            here is a simple example:
                check if a[] = {1, 2, 5, 7} contains 2 in it or not?
                1. first we initialise
                    leftIndex = 0 and rightIndex = a.length - 1
                2. We calculate the middle index
                    mid = (rightIndex + leftIndex) / 2;
                3. now based on the value of mid in comparision to the number to be searched we will update leftIndex or rightIndex

                boolean find(int x) {
                    int leftIndex = 0;  
                    int rightIndex = a.length - 1;
                    int mid = (rightIndex + leftIndex) / 2;

                    while(leftIndex < rightIndex) {
                        
                        if(a[mid] == x) {
                            return true;
                        }

                        if(a[mid] < x) {
                            leftIndex = mid + 1;
                        }
                        if(a[mid] > x) {
                            rightIndex = mid;
                        }

                        mid = (rightIndex + leftIndex) / 2;
                    }
                    
                    return false;
                }
                
        But question don't want us to search for a specific number instead wants us to find minium positive number
        So here is our customised binary search

        here is our Customised Binary Search:
    */
    static int findMinPositiveUsingBinaryApproach(int[] a) {
        int leftIndex = 0;  
        int rightIndex = a.length - 1;
        int mid = (rightIndex + leftIndex) / 2;

        while(leftIndex < rightIndex) {
    
            if(a[mid] < 0) {
                leftIndex = mid + 1;
            }
            if(a[mid] >= 0) {
                rightIndex = mid;
            }

            mid = (rightIndex + leftIndex) / 2;
        }

        return a[rightIndex];
    }

    public static void main(String[] args) {
        int a[] = {-8, -4, -1, 6, 8, 12, 20, 24};
        int ans = findMinPositiveUsingBinaryApproach(a);
        System.out.println(ans);
    }
}