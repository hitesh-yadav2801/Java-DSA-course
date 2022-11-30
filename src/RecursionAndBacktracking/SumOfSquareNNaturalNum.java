package RecursionAndBacktracking;

public class SumOfSquareNNaturalNum {
    public static void main(String[] args) {
        System.out.println(squareSum(5));
    }
    static int squareSum(int n){
        if (n==1) return n;
        int result = squareSum(n-1) + n*n;
        return result;
    }
}
