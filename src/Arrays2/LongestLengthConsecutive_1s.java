package Arrays2;

public class LongestLengthConsecutive_1s {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,1,1,1,1,0,0,0,1,1,1,1,1,1,1};
        System.out.println(longestLengthConsecutive_1s(arr));
    }
    static int longestLengthConsecutive_1s(int[] arr){
        int count =1;
        int maxCount = 0;
        int key = 1;
        for (int i = 1; i < arr.length ; i++) {
           if (key == arr[i-1]  && key == arr[i]){
               count++;
               maxCount = Math.max(count,maxCount);
           } else if (arr[i]==0) {
               count=1;
           }
        }
        return maxCount;
    }
}
