
import java.util.Arrays;
import java.util.Scanner;

public class Array_IfSorted {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,6,5,8,4};
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] <=arr[i+1]) {
//                break;
//            }
//        }
//        System.out.println("Array is not sorted");

//        2nd Appraoch

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
