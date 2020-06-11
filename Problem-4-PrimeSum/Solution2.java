import java.util.*;
import java.math.BigInteger;

class Solution2 {

    /*
        Method 2: Using BigInteger method to Check prime
        Steps to obtain all pairs
        1. Generate all prime numbers till N
        2. Create a HashMap to find pair of numbers.

        Why HashMap?
        - it fetches in constant time O(1)
    */


    static Set<Integer> generateListTillN(int n) {
        Set<Integer> set = new HashSet<>();

        for (int i = 2; i < n; i++) {
            if (BigInteger.valueOf(i).isProbablePrime(1)) { // BigInteger in-built method is faster than Method 1
                set.add(i);
            }
        }
        return set;
    }

    static Map<Integer, Integer> primePairsForN(int n) {

        Set<Integer> set = generateListTillN(n);
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : set) {
            int val = n - i;
            if (val != i && set.contains(val) && !map.containsValue(val)) {
                map.put(val, i);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        int n = 10;
        Map<Integer, Integer> pairs = primePairsForN(n);

        Iterator it = pairs.entrySet().iterator(); // we cannot iterator map without converting it to Entry set
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.printf("[%d, %d]\n", e.getKey(), e.getValue());
        }
    }
}