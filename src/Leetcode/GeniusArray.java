import java.util.Scanner;
public class GeniusArray {
    public static long solve(String A) {
        long count =0;
        long i = Long.parseLong(A);
        for(long a =0;a<=i;a++){
            for(long b=0; b<=i; b++){
                if(a < b){
                    count++;
                }
            }
        }
        return (long) (count%(Math.pow(10,9)+7));
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String A = in.nextLine();
        solve(A);
        System.out.println(solve(A));

    }
}
