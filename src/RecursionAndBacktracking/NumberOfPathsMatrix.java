package RecursionAndBacktracking;

public class NumberOfPathsMatrix {
    public static void main(String[] args) {
        System.out.println(path(2,3));
    }
    static int path(int n, int m){
        if (n==1) return 1;
        if (m==1) return 1;
        int result = path(n,m-1) + path(n-1,m);
        return result;
    }
}
