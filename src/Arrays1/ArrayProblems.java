public class ArrayProblems {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int result = -1;
        int key = 2;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == key) {
                result = i;
                break;
            }
        }
        if(result== -1){
            System.out.println("element not found");
        } else{
            System.out.println("Element found at index: " + result);
        }
    }
}
