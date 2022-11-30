package RecursionAndBacktracking;

public class OneToN {
    public static void main(String[] args) {
        int n =0;
//        oneToN(1);
        printNos(1000);
    }

    //    static void oneToN(int n){
//        System.out.print(n + " ");
//        if (n==100) return;
//        oneToN(n+1);
//    }
    static void printNos(int n) {
        if (n > 0) {
            printNos(n - 1);
            System.out.print(n + " ");
        }
    }


}
