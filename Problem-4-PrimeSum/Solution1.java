import java.util.*;
import java.math.BigInteger;

class Solution1 {

    /*
        Method 1: Checking till Square root of a number to see if it is prime
        Steps to obtain all pairs
        1. Generate all prime numbers till N
        2. Create a HashMap to find pair of numbers.

        Why HashMap?
        - it fetches in constant time O(1)
    */


    static Set<Integer> generateListTillN(int n) {
        Set<Integer> set = new HashSet<>();

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                set.add(i);
            }
        }
        return set;
    }

    static boolean isPrime(int n) {
        int limit = (int) Math.sqrt(n) + 1;
        for(int i = 2; i < limit; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
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

        Iterator it = pairs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.printf("[%d, %d]\n", e.getKey(), e.getValue());
        }
    }
}