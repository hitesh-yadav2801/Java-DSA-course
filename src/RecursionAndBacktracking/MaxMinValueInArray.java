package RecursionAndBacktracking;

public class MaxMinValueInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-1,7,8,11};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println(maxMin(arr,0, min,max)[0]+ " " +maxMin(arr,0,min,max)[1]);
    }
    static int[] maxMin(int[] arr, int i, int min, int max){
        if (i == arr.length) return new int[]{min,max};
        if (arr[i] > max){
            max = arr[i];
        }
        if (arr[i]< min){
            min = arr[i];
        }
       return maxMin(arr,i+1,min,max);

    }

}
