package Arrays1;

public class Array_ThirdLargestNum {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,8,9,12,225,567,222,4444,4444,9999};
        int n = arr.length;
        int max = arr[0];
        int max2 = arr[0];
        int max3 = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max3 = max2;
                max2 = max;
                max = arr[i];
            }
        }
        System.out.println("3rd largest number in array : " + max3 );
    }
}
