public class Array_2ndLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int max = arr[0];
        int max_2 = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] > max){
                max_2 = max;
                max = arr[i];
            }
        }
        System.out.println(max_2);
    }
}
