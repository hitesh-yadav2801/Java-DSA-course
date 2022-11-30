import java.util.Arrays;

public class Array_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,4,5};
        int[] result = new int[arr.length];
        result[0] = arr[0];
        for (int i = 1; i < arr.length-1; i++) {
           int j = 0;
                if (arr[i] == result[j]) {
                    j++;
                } else if (arr[i] != result[j]) {
                    result[j+1] = arr[i];
                    j++;
                }

        }
        System.out.println(Arrays.toString(result));
    }
}
