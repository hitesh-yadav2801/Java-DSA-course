package RecursionAndBacktracking;

public class ProductOfTwoNum {
    public static void main(String[] args) {
        System.out.println(product(5,8));
    }
    static int product(int a, int b){
        if (a==1) return b;
        return product(a-1,b) + b;
    }
}
