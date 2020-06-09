import java.util.*;

class Solution {

    // Method 1: Using ArrayList- Brute Force (Time - O( (n + m) * log(n + m)) , Space - O(n + m))
    static int[] mergeUsingArrayList(int a[], int b[]) {

        // initialise a list
        List<Integer> list = new ArrayList<>();

        // add all the values of array 'a' in the list
        for(int i: a){
            if(!list.contains(i)) {
                list.add(i);
            }
        }

        // add all the values of array 'b' in the list
        for(int i: b) {
            if(!list.contains(i)){
                list.add(i);
            }
        }

        Collections.sort(list);

        // initialise an array with size of the set.
        int c[] = new int[list.size()];

        //add all elements of the set into array 'c'
        int j = 0;
        for(Integer i: list) {
            c[j++] = i;
        }

        return c;

    }

    // Method 2: Using TreeSet (Time - O(n + m), Space - O(n + m))
    /* 
    explanation:
        Why TreeSet (Abstract Data Type)?
        A TreeSet has the following properties: -
        - As the name suggests: it's a set which means it will not contain any duplicate values.
        - Also When values are inserted in a TreeSet it automatically sorts itself
    */
    static int[] mergeUsingTreeSet(int a[], int b[]) {
       
       // initialise an empty TreeSet
        Set<Integer> set = new TreeSet<>(); 
  
        // add all the values of array 'a' in the set
        for(int i: a){
            set.add(i);
        }

        // add all the values of array 'b' in the set
        for(int i: b) {
            set.add(i);
        }

        // initialise an array with size of the set.
        int c[] = new int[set.size()];

        //add all elements of the set into array 'c'
        int j = 0;
        for(Integer i: set) {
            c[j++] = i;
        }
        
        return c;
    }

    public static void main(String args[]) {
        
        int a[] = {5, 3, 6, 2, 6, 2, 3};
        int b[] = {8, 5, 3, 7, 2, 1};

        int c[] = mergeUsingArrayList(a, b);

        for(int i: c) {
            System.out.println(i);
        }

    }
}