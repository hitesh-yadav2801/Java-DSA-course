package RecursionAndBacktracking;

public class Geek_Onacci {
    public static void main(String[] args) {
        System.out.println(geekOnacciNum(5,1,3,5));
    }
    static int geekOnacciNum(int n,int a, int b, int c){
        if (n==1) return a;
        if (n==2) return b;
        if (n==3) return c;
        int result = geekOnacciNum(n-1,a,b,c) + geekOnacciNum(n-2,a,b,c) + geekOnacciNum(n-3,a,b,c);
        return result;
    }
}
