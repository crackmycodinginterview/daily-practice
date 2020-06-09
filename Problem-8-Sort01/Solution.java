class Solution {

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