package RecursionAndBacktracking;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,4,3,2,1};
        int n = arr.length;
        System.out.println(ifPalindrome(arr, 0, arr.length-1));

    }
    static boolean ifPalindrome(int[] arr, int s, int e) {
        if (s >= e) return true;
        if (arr[s] == arr[e]) {
            return ifPalindrome(arr, s + 1, e - 1);
        } else {
            return false;
        }
    }
}
