package RecursionAndBacktracking;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(654321));
    }
    static int digitSum(int n) {
        int sum = 0;
        if (n == 0) return sum;
        int remainder = n % 10;
        n = n / 10;
        sum = sum + remainder;
        return sum +digitSum(n);
    }
}
