public class Array_SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,1,5};
        int n = arr.length;
        int min = arr[0];
        for (int i = 1; i <n ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Smallest Number in given array : " + min);
    }
}
