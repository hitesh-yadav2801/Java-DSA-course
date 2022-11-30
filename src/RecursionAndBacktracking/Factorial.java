package RecursionAndBacktracking;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n){
        if(n==0) return 1;
        int result = factorial(n-1)*n;
        return result;
    }
}
