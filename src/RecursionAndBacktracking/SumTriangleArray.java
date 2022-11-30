package RecursionAndBacktracking;

import java.util.Arrays;

public class SumTriangleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sumTriangleArray(arr);
    }
    static void sumTriangleArray(int[] arr){
        if (arr.length == 1) {
            return;
        }
       int[] sum = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            int x= arr[i] + arr[i+1];
            sum[i] = x;
        }
        sumTriangleArray(sum);
        System.out.println(Arrays.toString(sum));
    }
}
