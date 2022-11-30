package Arrays2;
public class MaxSumSubArray {
    public static void main(String[] args) {
//        Brute force

        int[] arr = {-5,4,6,-3,4,-1};
//        int maxSum = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length ; i++) {
//            int sum = 0;
//            for (int j=i; j < arr.length; j++) { // key point to remember here is we have to initialize j from i
//                sum += arr[j];
//                if (sum>maxSum){
//                    maxSum = sum;
//                }
//            }
//        }
//        System.out.println(maxSum);

//        Kadane's algo


        maxSumSubArray(arr);
        System.out.println(maxSumSubArray(arr));

    }

    public static int maxSumSubArray(int[] arr){
        int maxSum=0;
        int sum =0;
        for (int i = 0; i <arr.length ; i++) {
            sum = sum + arr[i];
            if (sum>maxSum){
                maxSum=sum;
            }
            if (sum<0){
                sum=0;
            }
        }
      return maxSum;
    }
}
