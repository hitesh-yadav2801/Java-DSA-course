package RecursionAndBacktracking;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(nthFibonacciNumber(4));
    }
    static int nthFibonacciNumber(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
       int Result = nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2);
        return Result;
    }
}
