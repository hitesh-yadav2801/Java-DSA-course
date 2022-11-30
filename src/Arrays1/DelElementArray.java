public class DelElementArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int deleteElement = 4;
        for (int i = 0; i <n ; i++) {
            if(deleteElement == arr[i]){
                for (int j = i; j < n-1; j++) {
                    arr[j] = arr[j+1];
                }
            }
            break;
        }
        for (int i = 0; i <n-1 ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
