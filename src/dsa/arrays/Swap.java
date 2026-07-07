package dsa.arrays;


import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [] arr = {1,3,7,5,9,4,6,2};

        swap(arr,2,5);

    }
    static void swap(int arr[],int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
