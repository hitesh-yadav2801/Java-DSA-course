package Arrays2;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {0,1,1,2,2,2,3,3,4,4,4,4,5};
        int n = arr.length;
        System.out.println(frequencyOfElementsInSortedArray(arr,n));
    }
    static int frequencyOfElementsInSortedArray(int[] arr, int n){
        int frequency =1;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]==arr[i-1]){
                    frequency++;
                }else {
                    System.out.println("Frequency of " + arr[i-1] + " is " + frequency);
                    frequency =1;
                }
            }
        System.out.println("Frequency of " + arr[n-1] + " is " + frequency);
          return frequency;
    }
}
