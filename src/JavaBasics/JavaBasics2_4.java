package JavaBasics;
public class JavaBasics2_4 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 5, 8};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < 5; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element is : " + min);
        System.out.println("Maximum element is : " + max);
    }
}
