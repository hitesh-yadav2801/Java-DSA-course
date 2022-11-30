package Arrays2;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,4,5,8,3,7};
        System.out.println(containerWithMostWater(arr));
    }
    static int containerWithMostWater(int[] arr){
        int maxArea = Integer.MIN_VALUE;
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int Area =0;
            int length = r-l;
            int height= Math.min(arr[l],arr[r]);
            Area = height*length;
            maxArea = Math.max(Area,maxArea);
            if (arr[l] <arr[r]){
                l++;
            }else {
                r--;
            }
        }
        return maxArea;

    }
}
