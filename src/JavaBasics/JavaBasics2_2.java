package JavaBasics;
import java.util.Scanner;
public class JavaBasics2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        int multiply =0;
        for (int i = 1; i <=10; i++) {
            multiply= i*num;
            System.out.println(multiply);
        }
    }
}
