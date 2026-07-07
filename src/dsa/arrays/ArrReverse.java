package dsa.arrays;

import java.util.Arrays;

public class ArrReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,8};
        System.out.println(Arrays.toString(arr));
        reversedArr(arr);
    }

    static void reversedArr(int[] arr) {
        int start = 0;
//        int end = 7;
        int end = arr.length - 1;
        for (int i = start; i < end; i++) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            if (start>end) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
