package RecursionAndBacktracking;

public class SumOfNNaturalNumber {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
    static int sum(int n){
        if (n == 1){
            return 1;
        }
        int result = sum(n-1) + n;
        return result;
    }
}
