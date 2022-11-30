package RecursionAndBacktracking;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(3,4));
    }
    static double power(int a,int b){
        if (b==1){
            return a;
        }
        double result = power(a,b-1)*a;
        return result;
    }
}
