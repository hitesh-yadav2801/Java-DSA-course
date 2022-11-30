package GeeksForGeeks;

import java.util.HashMap;

public class OddOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,};
        int n = arr.length;
//      System.out.println(oddOccurrence(arr, arr.length));
        System.out.println(getOddOccurrence(arr,n));
    }

//    O(n) time and O(n) space
    static int oddOccurrence(int[] arr, int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++) {
            int e = arr[i];
            if(map.containsKey(e)) {
                int temp = map.get(e);
                map.put(e, temp+1);
            } else {
                map.put(e, 1);
            }
        }
        for(Integer a:map.keySet())
        {
            if(map.get(a) % 2 != 0)
                return a;
        }
        return -1;
    }
//    O(n) time and O(1) space
    static int getOddOccurrence(int[] arr, int n){
        int x =0;
        for (int i = 0; i <arr.length; i++) {
            x^= arr[i];
        }
        return x;
    }
}
