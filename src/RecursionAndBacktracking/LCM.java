package RecursionAndBacktracking;

import static RecursionAndBacktracking.GCD.gcd;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(5,15));
//        GCD obj = new GCD();
    }
    static int lcm(int a, int b){
        int lcm = (a*b)/gcd(5,15);
        return lcm;
    }
//    static int gcd(int a, int b){
//        if (b==0) return a;
//        return gcd(b, a%b);
//    }

}
