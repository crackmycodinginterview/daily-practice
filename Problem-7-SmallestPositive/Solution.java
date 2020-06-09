class Solution {

    static int findMinPositive(int[] a) {
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
        int ans = findMinPositive(a);
        System.out.println(ans);
    }
}