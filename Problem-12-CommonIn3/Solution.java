import java.util.*;

public class Solution {


 
    // Method 1
    /*
        steps:
            for each remove duplicates and then increase the count by one in Map
            check which key in map has value 1

    */
    static int[] findCommon(int a[], int b[], int c[]) {

        Map<Integer, Integer> map = new HashMap<>();

        Set<Integer> set = new HashSet<>();
        
        // add first array
        for(int i: a) set.add(i);
        
        for(Integer i: set) {
            if(map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else  map.put(i, 1);
        }

        set.clear();

        //add second array
        for(int i: b) set.add(i);
        
        for(Integer i: set) {
            if(map.containsKey(i)) map.put(i, map.get(i) + 1);
            else  map.put(i, 1);
        }
        
        set.clear();

        // add thrid array
        for(int i: c) set.add(i);
        
        for(Integer i: set) {
            if(map.containsKey(i)) map.put(i, map.get(i) + 1);
            else  map.put(i, 1);
        }
             
        // fill list
        ArrayList<Integer> list = new ArrayList<>();
        
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            if((Integer)e.getValue() == 3) {
                list.add((Integer)e.getKey());
            }
        }

        int[] r = new int[list.size()];
        int j = 0;
        for(int i: list){
            r[j++] = i;
        }

        return r;

    }

    public static void main(String[] args) {
        
        int[] array1 = { 1, 5, 10, 20, 40, 80 }, array2 = { 6, 7, 20, 80, 100 }, array3 = { 3, 4, 15, 20, 30, 70, 80, 120 };
        
        int res[] = findCommon(array1, array2, array3);

        for(int i: res) {
            System.out.println(i);
        }

    }
}