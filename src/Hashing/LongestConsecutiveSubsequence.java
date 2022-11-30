package Hashing;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int arr[] = {2,1,4,8,4,5,3,9,7,2,6};
        System.out.println(longestConsecutiveSubsequence(arr));
    }
    static int longestConsecutiveSubsequence(int arr[]){
        HashSet <Integer> set = new HashSet<>();
        for (int e : arr) {
            set.add(e);
        }
        int ans =0;
        for (int e : set) {
            if(!set.contains(e-1)) {
              int length = 1;
              while (set.contains(++e)){
                  length++;
              }
                ans = Math.max(ans, length);
            }
        }
        return ans;
    }
}
