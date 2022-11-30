package JavaBasics;
public class JavaBasics2_1 {
    public static void main(String[] args) {
         //      Q1

        int[] arr = {1,2,3,4,5};
        float avg;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg= sum/5;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > avg) count++;
        }
        System.out.println(count);
    }
}