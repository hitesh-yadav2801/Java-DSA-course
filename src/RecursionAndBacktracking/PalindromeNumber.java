package RecursionAndBacktracking;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(palindrome(num));
    }
    static boolean palindrome(int num){
        int rev =0;
        int temp = num;
        while (temp>0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;
        }
       return num == rev;
    }
}
