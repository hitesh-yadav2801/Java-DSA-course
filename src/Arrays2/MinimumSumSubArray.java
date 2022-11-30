package Arrays2;

public class MinimumSumSubArray {
    public static void main(String[] args) {
        int[] arr = {-5,4,6,-3,4,-1,-5,-3};
        // brute force

//        int minSum = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length ; i++) {
//            int sum =0;
//            for (int j = i; j < arr.length ; j++) {
//                sum += arr[j];
//                if (sum < minSum){
//                    minSum = sum;
//                }
//            }
//        }
//        System.out.println(minSum);


//        Kadane's Algo

        System.out.println(minimumSumSubArray(arr));
    }
    static int minimumSumSubArray(int[] arr){
        int minSum = Integer.MAX_VALUE;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum < minSum){
                minSum = sum;
            } if (sum> 0) {
                sum =0;
            }
        }
        return minSum;
    }

}
