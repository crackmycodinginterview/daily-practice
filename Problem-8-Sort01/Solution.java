class Solution {

    // Method 1: Two Pointers Apprach (Time - O(n), Space - O(1))

    /*
    We keep to track of two pointers:
    We find the left most 1 and swap it with the right most 0, this process is carried repeatedly until the array is sorted

    Looking at the code might trick you to think the Time complexitiy is O(n^2)
    but actually it is O(n) because of the fact every element of the array is visited exactly once.
    */
    static int[] sort(int a[]){
    
        for(int i = -1, j = a.length; i < j;) {
            while(a[++i] != 1) {}
            while(a[--j] != 0) {}

            if(i < j) {
                a[i] = 0;
                a[j] = 1;
            }
            
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {1, 1, 0, 0, 1, 0, 1};
        int ans[] = sort(a);
        for(int i: ans) {
            System.out.println(i);
        }
    }
}