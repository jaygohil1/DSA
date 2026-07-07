package dsa.arrays;

import java.util.Arrays;

public class BasicArrays {
    public static void main(String[] args) {
        int [] nums = new int[5];


        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
//        nums[4] = 50;

        System.out.println(Arrays.toString(nums));
        //for every element in the array print the element
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.print(num + " "); //num represents the element of the array

        }
    }
}
