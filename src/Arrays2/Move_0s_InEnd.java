package Arrays2;

import java.util.Arrays;

public class Move_0s_InEnd {
    public static void main(String[] args) {
        int[] arr = {0,7,0,8,1,0,3,0,0,5};
        move_0s_InEnd(arr);
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }
        System.out.println(Arrays.toString(arr));
    }
    static void move_0s_InEnd(int[] arr){
        int key=0;
        for (int i = 0; i < arr.length; i++) {
            int temp;
            for (int j = 1; j < arr.length ; j++) {
                if (arr[j-1]==key){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
